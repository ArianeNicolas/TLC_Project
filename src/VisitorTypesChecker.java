import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;


//ex f1,f2 = f3,f4,f5 -> on choisit si on gere ou pas
//x1,x2=x2,x1
public class VisitorTypesChecker extends Visitor {

    private ArrayList<WhileContext> symbolsTable;
    private String currentContextName;

    /**
     * @param symbolsTable Symbols table used to check the AST (need to be already filled)
     */
    public VisitorTypesChecker(ArrayList<WhileContext> symbolsTable) {
        System.out.println(symbolsTable);
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
                //children
                List<CommonTree> children = (List<CommonTree>) node.getChildren();
                System.out.println("children" +children);

                //gauche égalité
                CommonTree vars = children.get(0);
                
                //droite égalité 
                CommonTree exprs = children.get(1);

                if(getType(vars) != getType(exprs)){
                    throw new WhileException("Type mismatch", node.getLine());
                }


            default:
                break;
        } 
    }

    
    /**
     * Return the number of values in the node
     * @param node
     * @return
     */
    private int getType(CommonTree node){

        //todo
        //get context -> si dans contexte -> on peut definir le type
            //on utilise le nom du contexte ???
            //OU -> dans cette classe qud fonction currentOCntext+1 et quand END -> currentContext-1
        //sinon -> nil

        String token=node.getText();
        switch (token) {
            case "nil":
                return 0;

            default:
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

