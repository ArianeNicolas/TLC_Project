import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import org.antlr.runtime.tree.CommonTree;

public class VisitorSymbolsTable extends Visitor {
    private Stack<HashMap<String, String>> symbolsTable;

    public Stack<HashMap<String, String>> getSymbolsTable() {
        return symbolsTable;
    }

    public VisitorSymbolsTable(){
        symbolsTable = new Stack<HashMap<String, String>>();
        symbolsTable.push(new HashMap<String, String>());
    }
    
    //@Override
    public void process(CommonTree node){
        String token=node.getText();
        switch (token) {
            case "FUNCDEF":
                symbolsTable.peek().put(node.getChild(0).getText(), "function");
                System.out.println("Add function " + node.getChild(0).getText());
                symbolsTable.push(new HashMap<String, String>());
                System.out.println("Push table");
                break;

            case "INPUTS":
                List<CommonTree> inputs = (List<CommonTree>) node.getChildren();
                if(inputs == null) break;
                for (CommonTree input : inputs) {
                    symbolsTable.peek().put(input.getText(), "input");
                    System.out.println("Add input " + input.getText());
                }
                break;

            case "VARIABLES":
                List<CommonTree> variables = (List<CommonTree>) node.getChildren();
                if(variables == null) break;
                for (CommonTree variable : variables) {
                    symbolsTable.peek().put(variable.getText(), "variable");
                    System.out.println("Add variable " + variable.getText());
                }
                break;

            case "FOREACH":
                symbolsTable.push(new HashMap<String, String>());
                System.out.println("Push table");
                break;

            case "IN":
                symbolsTable.peek().put(node.getChild(0).getText(), "variable");
                System.out.println("Add variable " + node.getChild(0).getText());
                break;

            case "END":
                symbolsTable.pop();
                System.out.println("Pop table");
                break;
            
            case "WHILE":
                
                break;

            case "IF":
                    
                break;

            case "FOR":
                
                break;
             
            default:
                break;
        }
    }
}
