package compilateur;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

//todo tester 


//todo verification
//dans if : 1
//dans for : 1
//dans while: 1
//appel fonction : nombre inputs

public class VisitorTypesChecker extends Visitor {

    private ArrayList<WhileContext> symbolsTable;

    /**
     * @param symbolsTable Symbols table used to check the AST (need to be already filled)
     */
    public VisitorTypesChecker(ArrayList<WhileContext> symbolsTable) {
        this.symbolsTable = symbolsTable;
    }


    @Override
    protected void entry(CommonTree node) throws WhileException {
        String token=node.getText();
        switch (token) {
            //tester qu'une fonction est definie avant d'etre utilisée
            //tester ses parametres et ses outputs

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
                break;
            case "VARDEF": // Assignment statement :=
                //children
                List<CommonTree> children = (List<CommonTree>) node.getChildren();
                //System.out.println("children" +children);

                //gauche égalité
                List<CommonTree> vars_left = new ArrayList<>();
                int vars_left_type = 0;
                //droite égalité 
                List<CommonTree>  exprs_right = new ArrayList<>();
                int exprs_right_type = 0;

                for (CommonTree child : children) {
                    if(child.getText().equals("EXPR")){ 
                        exprs_right.add((CommonTree)child.getChild(0));
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
                System.out.println("vars_left " + vars_left);
                System.out.println("vars_left_type " + vars_left_type);
                System.out.println("exprs_right " + exprs_right);
                System.out.println("exprs_right_type " + exprs_right_type);

                
                if(vars_left_type != exprs_right_type) {
                    throw new WhileException("Mismatched inputs("+vars_left_type+") and outputs("+exprs_right_type+") : "+App.getFileNameAndLineNumber(node));
                }
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

        // variable = 1
        // function -> input ou output
        //todo
        //get context -> si dans contexte -> on peut definir le type
            //on utilise le nom du contexte ???
            //OU -> dans cette classe qud fonction currentOCntext+1 et quand END -> currentContext-1
        //sinon -> nil

        //fonction -> nbre outpus  ou input

        String token=node.getText();
        switch (token) {
            //parcours table de symboles
            // si fonction 
                // on retourne le nombre d'output de la fonction
                // mais il d'abord vérifier que la fonction recoit le bon nombre d'input
            //no output

            //todo completer la liste des cas valant 0
            case "IF":
            case "ELSE":
            case "THEN":
            case "FOR":
            case "WHILE":
            case "COMMENT":
                return 0;
            case "nil":
                return 1;
            case "CALL":
                CommonTree functionNode = (CommonTree) node.getChild(0);
                WhileContext function = VisitorSymbolsTable.getFunction(functionNode, symbolsTable);
                return function.getOutputs().size();
            default:
                return 1;
        }
    }

}
        


    // todo? gerer erreur table des symboles à sa construction
