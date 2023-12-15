package main;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.CommonTree;

public class VisitorSymbolsTable extends Visitor {
    private ArrayList<WhileContext> symbolsTable = null;

    private int currentContextIndex;
    private int lastContextIndex;
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
        lastContextIndex = INVALID_CONTEXT_INDEX;
    }
    
    /**
     * Add the node to the symbols table
     * @param node  
     * @throws WhileException
     * @throws Exception
     */
    @Override
    public void process(CommonTree node) throws WhileException {
        String token=node.getText();
        switch (token) {
            case "INPUTS":
                List<CommonTree> inputs = (List<CommonTree>) node.getChildren();
                List<String> inputNames = new ArrayList<String>();
                if(inputs == null) break;
                for (CommonTree input : inputs) {
                    //test if the input is already declared in the current context
                    if(currentContextIndex >=0 && inputNames.contains(input.getText())) {
                        throw new WhileException("Input already declared : "+input.getText(), node.getLine());
                    }
                    // add a parameter to the current function
                    symbolsTable.get(currentContextIndex).addParameter(input.getText());
                    inputNames.add(input.getText());
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
                        throw new WhileException("Output already declared : "+output.getText(), node.getLine());
                    }
                    // add an output to the last function (because it's after the end)
                    symbolsTable.get(lastContextIndex).addOutput(output.getText());
                    outputNames.add(output.getText());
                }
                break;

            case "VARIABLES":
                List<CommonTree> variables = (List<CommonTree>) node.getChildren();
                if(variables == null) break;
                for (CommonTree variable : variables) {
                    // add a variable to the current function
                    symbolsTable.get(currentContextIndex).addVariable(variable.getText());
                }
                break;

            case "FUNCDEF":
                WhileContext newContext;
                if(currentContextIndex < 0){
                    newContext = new WhileContext(node.getChild(0).getText(), null);
                } else {
                    newContext = new WhileContext(node.getChild(0).getText(), symbolsTable.get(currentContextIndex));
                } 
                checkMultipleFunctionsDeclaration(newContext,node);
           
                symbolsTable.add(newContext);
                currentContextIndex = symbolsTable.indexOf(newContext); // TODO optimize when working

                break;
           
            case "END":
                if(currentContextIndex > INVALID_CONTEXT_INDEX){
                    WhileContext currentContext = symbolsTable.get(currentContextIndex).getParentContext();
                    lastContextIndex = currentContextIndex;
                    currentContextIndex = symbolsTable.indexOf(currentContext);

                }

                break;
            default:
                break;
        }
    }
    private void checkMultipleFunctionsDeclaration(WhileContext currrentContext, CommonTree node) throws WhileException {
        //if two function have the same name -> error
        for (WhileContext ctx : symbolsTable) {
            if(currrentContext.getName().equals(ctx.getName()) && currrentContext != ctx) { // currrentContext != ctx if currrentContext is already add in symbolsTable 
                throw new WhileException("Same declaration", node.getLine());
            }
        }
    }


    @Override
    public String toString() {
        return symbolsTable.toString();
    }
}