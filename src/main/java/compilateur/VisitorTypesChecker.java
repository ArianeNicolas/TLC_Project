package compilateur;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

//todo verification
// dans =? -> peut etre pareil que dans := ???????
//dans if : 1
//dans while: 1

/**
 * Check the types of the AST and stop the program if there is a type error (needs an already filled symbols table to work)
 */
public class VisitorTypesChecker extends Visitor {
    private ArrayList<WhileContext> symbolsTable;

    /**
     * @param symbolsTable Symbols table used to check the AST (need to be already filled)
     */
    public VisitorTypesChecker(ArrayList<WhileContext> symbolsTable) {
        this.symbolsTable = symbolsTable;
        //A main function is needed
        boolean mainFound = false;
        for (WhileContext function : symbolsTable) {
            if(function.getName().equals("main")) {
                mainFound = true;
            }
        }
        if(!mainFound) {
            //print warning in orange
            System.err.println("\u001B[38;5;208m" + "[Warning] no main function found" + "\u001B[0m");
        }
    }


    @Override
    protected void entry(CommonTree node) throws WhileException {
        String token=node.getText();
        switch (token) {
            case "CALL": // Function call
                CommonTree functionNode = (CommonTree) node.getChild(0);
                WhileContext function = VisitorSymbolsTable.getFunction(functionNode, symbolsTable);
                //function parameters are the children of the call node except the first one (the function name)
                ArrayList<CommonTree> parameters = (ArrayList<CommonTree>) node.getChildren();
                parameters.remove(0);

                int parametersType = 0;
                for (CommonTree parameter : parameters) {
                    parametersType += getType(parameter);
                }

                // The type of the parameters must match the type of the inputs of the function
                if(parametersType != function.getParameters().size()) {
                    throw new WhileException("Wrong number of inputs for function "+function.getName()+" ("+parametersType+ " instead of "+function.getParameters().size()+") : "+App.getFileNameAndLineNumber(node));
                }
                System.out.println("Function called : "+function.getName()+" (inputs number="+parametersType+")");

                break;
            case "WHILE": // While loop, todo tester (d'abord juste la table des symboles)
                break;
            case "IF": // If statement, todo tester (d'abord juste la table des symboles)
                break;
            case "FOR": // For loop, works
                CommonTree condition = (CommonTree) node.getChild(0);
                ArrayList<CommonTree> conditionChildren = (ArrayList<CommonTree>) condition.getChildren();
                int conditionType = 0;
                for (CommonTree child : conditionChildren) {
                    conditionType += getType(child);
                }
                // Only boolean condition are allowed (one value)
                if(conditionType != 1) {
                    throw new WhileException("Condition must be a boolean : "+App.getFileNameAndLineNumber(node));
                }
                System.out.println("Condition (in "+token+") had one input, has expected");
                break;
            case "VARDEF": // Assignment statement :=
                List<CommonTree> children = (List<CommonTree>) node.getChildren();

                //Left side of the assignment
                List<CommonTree> vars_left = new ArrayList<>();
                int vars_left_type = 0;
                //Right side of the assignment
                List<CommonTree>  exprs_right = new ArrayList<>();

                int exprs_right_type = 0;
                for (CommonTree child : children) {
                    if(child.getText().equals("EXPR")){ 
                        //if an expression has more than one child, it is a comparison
                        if(child.getChildCount() > 1) {
                            //a comparison returns one value
                            exprs_right_type += 1;
                        } else if (child.getChildCount() == 1) { 
                            exprs_right.add((CommonTree)child.getChild(0));
                        }
                    } else {
                        vars_left.add(child);
                    }
                }
                
                for (CommonTree var_left : vars_left) {
                    vars_left_type += getType(var_left);
                }
                for (CommonTree expr_right : exprs_right) {
                    exprs_right_type += getType(expr_right);
                }
                if(vars_left_type != exprs_right_type) {
                    throw new WhileException("Mismatched inputs("+vars_left_type+") and outputs("+exprs_right_type+") : "+App.getFileNameAndLineNumber(node));
                }
                System.out.println("Assignement statement : "+vars_left+" = "+exprs_right+" ("+vars_left_type+" = "+exprs_right_type+")");
                break;
            default:
                break;
        } 
    }

    /**
     * Called when exiting a node, does nothing
     */
    @Override
    protected void exit(CommonTree node) throws Exception {
        // nothing to do
    }

    
    /**
     * Return the number of values in the node
     * @param node
     * @return
     * @throws WhileException
     */
    private int getType(CommonTree node) throws WhileException{
        String token=node.getText();
        switch (token) {
            //todo completer la liste des cas valant 0
            //The following tokens have no value
            case "IF":
            case "ELSE":
            case "THEN":
            case "FOR":
            case "WHILE":
            case "COMMENT":
                return 0;
            //nil is a value
            case "nil":
                return 1;
            //The number of outputs of a function is stated in the symbols table
            case "CALL":
                CommonTree functionNode = (CommonTree) node.getChild(0);
                WhileContext function = VisitorSymbolsTable.getFunction(functionNode, symbolsTable);
                return function.getOutputs().size();
            //a variable has one value
            default:
                return 1;
        }
    }

}
        


    // todo? gerer erreur table des symboles à sa construction
