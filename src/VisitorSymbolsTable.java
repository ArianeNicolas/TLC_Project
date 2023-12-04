import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import org.antlr.runtime.tree.CommonTree;

//???
//liste fonctions et parametres
//localement à chaque fonction connecter toutes les variables

//NIVE GLOAB SYMBOLS SONT fonction;
//NIV LOCAL PARAM? SéPARéS DES VAR LOCALES
//affectations typées
//types de retour

public class VisitorSymbolsTable extends Visitor {
    private ArrayList<WhileContext> symbolsTable;

    private int currentContextIndex;

    /**
     * Each in the Stack is a context
     * @return the symbolsTable
     */
    public ArrayList<WhileContext> getSymbolsTable() {
        return symbolsTable;
    }

    public int currentContextIndex() {
        return currentContextIndex;
    }

    public VisitorSymbolsTable(){
        symbolsTable = new ArrayList<WhileContext>();
        currentContextIndex = -1;
    }
    
    /**
     * Add the node to the symbols table
     * @param node  
     */
    //@Override
    public void process(CommonTree node){
        String token=node.getText();
        switch (token) {
            case "INPUTS":
                List<CommonTree> inputs = (List<CommonTree>) node.getChildren();
                if(inputs == null) break;
                for (CommonTree input : inputs) {
                    // add a parameter to the current function
                    symbolsTable.get(currentContextIndex).addParameter(input.getText());
                }
                break;

            //todo patch OSKOUR C APRES LE END
            case "OUTPUT":
                List<CommonTree> outputs = (List<CommonTree>) node.getChildren();
                if(outputs == null) break;
                for (CommonTree output : outputs) {
                    // add an output to the current function
                    symbolsTable.get(currentContextIndex).addOutput(output.getText());
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
                symbolsTable.add(newContext);
                currentContextIndex = symbolsTable.indexOf(newContext); // TODO optimize when working
                break;
           
            case "END":
                if(currentContextIndex > -1){
                    WhileContext currentContext = symbolsTable.get(currentContextIndex).getParentContext();
                    currentContextIndex = symbolsTable.indexOf(currentContext);
                }
                break;

                 /*
            case "IN":
            case "FOREACH":
            case "WHILE":
            case "IF":
            case "FOR":
                System.out.println(token);
                break;
            */

            default:
                break;
        }
    }
    @Override
    public String toString() {
        return symbolsTable.toString();
    }
}