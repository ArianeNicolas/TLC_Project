package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;


//ex f1,f2 = f3,f4,f5 -> on choisit si on gere ou pas
//x1,x2=x2,x1
public class VisitorTypesChecker extends VisitorOld {

    private ArrayList<WhileContext> symbolsTable;
    private String currentContextName;

    /**
     * @param symbolsTable Symbols table used to check the AST (need to be already filled)
     */
    public VisitorTypesChecker(ArrayList<WhileContext> symbolsTable) {
        this.symbolsTable = symbolsTable;
    }


    @Override
    protected void process(CommonTree node) throws WhileException {
        String token=node.getText();
        switch (token) {
            //tester qu'une fonction est definie avant d'etre utilisée
            //tester ses parametres et ses outputs


            case "VARIABLES":
                //tester qu'une variable est definie dans le contexte avant d'etre utilisée
                //tester que c'est avant la ligne courante
                //vraiment à faire ????? -> juste ca vaut nil sinon

                break;


            case "VARDEF": //:=
                //System.out.println("NODE" +node);
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

                
                //foreahc children in exprs -> get type

                
                break;
            default:
                break;
        } 
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
            //condition arbre 1
            // if arbre 0

            // si if
                //0
            //si condition -> jsp comment on fait
            //si arbre 
                //1
            //parcours table de symboles
            // si fonction 
                // on retourne le nombre d'output de la fonction
                // mais il d'abord vérifier que la fonction recoit le bon nombre d'input
    

            case "nil":
                return 1;
            default:
                //si nom de fonction dans la table des symboles, retourner le nombre d'output
                for (WhileContext context : symbolsTable) {
                    
                    if(context.getName().equals(token)){
                        //check if we are in the inputs 
                        //todo
                        ///get the parent children
                        CommonTree parent = (CommonTree) node.getParent();
                        List<CommonTree> children = (List<CommonTree>) parent.getChildren();

                        //System.out.println(App.getFileNameAndLineNumber(node));


                        //TODOOOOOOOO CHECK IF INPUT IS RIGHT
                        //children count
                        //(add Result (add Result Op2)) donne
                        //(EXPR add Result add Result Op2) 
                        // à voir si normal


                       
                        return context.getOutputs().size();
                    }
                }
                return 1;
        }
    }

}
        


    // gerer erreur table des symboles à sa construction

    //type fonction nmbre valeurs retours / entrees
    //tester les affectations -> nbre gauche, nbre droite
    //a chaque noeudde l'ast (presque) -> associer l'exposant en tant que type
    //fonctions a3 -> vers a2 
    //x,y,...=a   -> affectation si type gauche= type droit

