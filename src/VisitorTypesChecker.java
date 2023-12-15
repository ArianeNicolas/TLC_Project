import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    protected void process(CommonTree node) {
        String token=node.getText();
        switch (token) {
            //tester qu'une fonction est definie avant d'etre utilisée
            //tester ses parametres et ses outputs


            case "VARIABLES":
                //tester qu'une variable est definie dans le contexte avant d'etre utilisée
                //tester que c'est avant la ligne courante
                //vraiment à faire ????? -> juste ca vaut nil sinon

                break;

            case "VARDEF":
                //soit 

                
                break;
            

            default:
                break;
        }

        

    }

    // gerer erreur table des symboles à sa construction

    //type fonction nmbre valeurs retours / entrees
    //tester les affectations -> nbre gauche, nbre droite
    //a chaque noeudde l'ast (presque) -> associer l'exposant en tant que type
    //fonctions a3 -> vers a2 
    //x,y,...=a   -> affectation si type gauche= type droit
}
