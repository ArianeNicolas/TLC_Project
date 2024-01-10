package compilateur;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.CommonTree;

public class VisitorSymbolsTable extends Visitor {
    private ArrayList<WhileContext> symbolsTable = null;

    private int currentContextIndex;
    private final static int INVALID_CONTEXT_INDEX = -1;

    /**
     * Each WhileContext (=functions) in the Stack is a context 
     * @return the symbolsTable
     */
    public ArrayList<WhileContext> getSymbolsTable() {
        assert symbolsTable != null : "Visit AST before get symbolsTable";
        return symbolsTable;
    }

    /**
     * @return the currentContext
     */
    public int currentContextIndex() {
        return currentContextIndex;
    }

    /**
     * Create an empty symbols table, to be filled by calling visit on the AST
     */
    public VisitorSymbolsTable(){
        symbolsTable = new ArrayList<WhileContext>();
        currentContextIndex = INVALID_CONTEXT_INDEX;
    }
    
    /**
     * Add the node to the symbols table
     * @param node  
     * @throws WhileException
     * @throws Exception
     */
    @Override
    public void entry(CommonTree node) throws WhileException {
        String token=node.getText();
        switch (token) {
            case "INPUTS":
                List<CommonTree> inputs = (List<CommonTree>) node.getChildren();
                List<String> inputNames = new ArrayList<String>();
                if(inputs == null) break;
                for (CommonTree input : inputs) {
                    //test if the input is already declared in the current context
                    if(currentContextIndex >=0 && inputNames.contains(input.getText())) {
                        throw new WhileException("Input already declared : "+App.getFileNameAndLineNumber(node));
                    }
                    // add a parameter to the current function
                    String inputName = input.getText();
                    //if it isn't a comment
                    if(!inputName.equals("COMMENT"))
                    {
                        symbolsTable.get(currentContextIndex).addParameter(inputName);
                        inputNames.add(inputName);
                    }
                    
                }
                break;
                
            case "OUTPUT":
                List<CommonTree> outputs = (List<CommonTree>) node.getChildren();
                List<String> outputNames = new ArrayList<String>();
                if(outputs == null) break;
                for (CommonTree output : outputs) {
                    //test if the output is already declared in the current context 
                    if(currentContextIndex >=0 && outputNames.contains(output.getText())) {
                        //todo to test
                        throw new WhileException("Output already declared : "+App.getFileNameAndLineNumber(node));
                    }
                    // add an output to the last function (because it's after the end)
                    symbolsTable.get(currentContextIndex).addOutput(output.getText());
                    outputNames.add(output.getText());
                }
                break;

            case "VARDEF":
                List<CommonTree> variables = (List<CommonTree>) node.getChildren();
                if(variables == null) break;
                for (CommonTree variable : variables) {
                    String var_text = variable.getText();
                    //only add left part of the affectation
                    if(!var_text.equals("EXPR"))
                    {
                        // add a variable to the current function
                        symbolsTable.get(currentContextIndex).addVariable(var_text);
                    }
                }
                break;

            case "FUNCDEF":
                WhileContext newContext;
                newContext = new WhileContext(node.getChild(0).getText());
                checkMultipleFunctionsDeclaration(newContext,node);
           
                symbolsTable.add(newContext);
                currentContextIndex = symbolsTable.indexOf(newContext); // TODO optimize when working
                break;
            default:
                break;
        }
    }

    


    private void checkMultipleFunctionsDeclaration(WhileContext currrentContext, CommonTree node) throws WhileException {
        //if two function have the same name -> error
        for (WhileContext ctx : symbolsTable) {
            if(currrentContext.getName().equals(ctx.getName()) && currrentContext != ctx) { // currrentContext != ctx if currrentContext is already added in symbolsTable 
                throw new WhileException("Same declaration of function : "+App.getFileNameAndLineNumber(node));
            }
        }
    }

    @Override
    public String toString() {
        return symbolsTable.toString();
    }

    /**
     * Return a context in the symbols table corresponding to the node name
     * @param node
     * @param symbolsTable
     * @return
     * @throws WhileException
     */
    public static WhileContext getFunction(CommonTree node, ArrayList<WhileContext> symbolsTable) throws WhileException {
    String nodeName = node.getText();
    for (WhileContext ctx : symbolsTable) {
        if(nodeName.equals(ctx.getName())) {
            return ctx;
        }
    }
        throw new WhileException("Function not found : "+App.getFileNameAndLineNumber(node));
    }

    /**
     * Called when exiting a node, does nothing
     */
    @Override
    protected void exit(CommonTree node) throws Exception {
        // do nothing
    }


}