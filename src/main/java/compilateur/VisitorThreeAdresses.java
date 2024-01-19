package compilateur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

public class VisitorThreeAdresses extends Visitor {

    int indice = 0;
    private HashMap<String,Integer> outputs = new HashMap<>();
    private int indiceBlock = 0;

    /**
     * Classe ThreeAdresses, correspondant à une ligne de code 3 adresses
     */
    public class ThreeAdresses {
        public String op;
        public String arg;
        public String var;
    };

    /**
     * Hashmap associant un noeud aux codes 3 adresses de lui-même et de tous ses fils
     */
    private HashMap<CommonTree,ArrayList<ThreeAdresses>> stock = new HashMap<CommonTree,ArrayList<ThreeAdresses>>(); 

    public HashMap<CommonTree,ArrayList<ThreeAdresses>> getCode3A() {
        return stock;
    }

    @Override
    protected void entry(CommonTree node) {
    }

    /**
     * Focntion appelée en remontant dans l'arbre, effectue une action en fonction du texte du noeud courant
     */
    @Override
    protected void exit(CommonTree node) {
        
        //Toutes les feuilles sont considérées comme inutiles, on les lira depuis leur noeud parent si besoin (sauf les fonctions cons et list qui peuvent ne pas prendre d'arguments)
        if(node.getChildren() == null&&!(node.getText().equals("END"))&&!(node.getText().equals("CONS"))&&!(node.getText().equals("LIST"))) {
            ArrayList<ThreeAdresses> list = new ArrayList<>();
            list.add(threeAdresses("IGNORE", null, null));
            stock.put(node,list);
        }
        //sinon on parcourt le switch
        else{
            switch (node.getText()) {

                //on ignore les commentaires
                case "COMMENT":
                    ArrayList<ThreeAdresses> comment = new ArrayList<>();
                    comment.add(threeAdresses("IGNORE", null, null));
                
                //on rassemble tous les codes des noeuds fils
                case "START":
                    ArrayList<ThreeAdresses> start = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                            start.addAll(stock.get(child));    
                    }
                    stock.put(node, start);
                    break;

                //on rassemble tous les codes des noeuds fils
                case "PROGRAM":
                    ArrayList<ThreeAdresses> program = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                            program.addAll(stock.get(child));    
                    }
                    stock.put(node, program);
                    break;

                case "FUNCDEF":
                    //on commence par récupérer les nombre d'outputs de la fonction, qui nous servira plus tard
                    CommonTree outputNode = (CommonTree) node.getChild(1).getChild(node.getChild(1).getChildCount()-1);
                    int outputNumber = 1;
                    while(outputNode.getChild(1) != null) {
                        outputNumber++;
                        outputNode = (CommonTree) outputNode.getChild(1);
                    }
                    outputs.put(node.getChild(0).getText(), outputNumber);

                    ArrayList<ThreeAdresses> funcdef = new ArrayList<>();
                    funcdef.add(threeAdresses("ENTER", node.getChild(0).getText(), "FUNCTION"));//on indique qu'on entre dans une fonction 
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(Character.isUpperCase(child.getText().charAt(0))) {
                            funcdef.addAll(stock.get(child));//on ajoute le code de tous les enfants sauf le nom de la fonction
                        }
                    }
                    stock.put(node, funcdef);
                    break;

                //on rassemble tous les codes des noeuds fils
                case "FUNCTION":
                    ArrayList<ThreeAdresses> func = new ArrayList<>();
                    
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(!child.getText().equals("OUTPUT")) {
                            func.addAll(stock.get(child));
                        }  
                }
                    stock.put(node, func);
                    break;

                case "INPUTS":
                    //on ajoute autant de fois que nécessaire le ThreeAdresses "READ" avec le nom de la variable entrée
                    ArrayList<ThreeAdresses> inputs = new ArrayList<>();
                    for(int i = 0; i < node.getChildCount(); i++) {
                        inputs.add(threeAdresses("READ", null, node.getChild(i).getText()));
                    }
                    stock.put(node,inputs);
                    break;

                case "VARDEF":
                    ArrayList<ThreeAdresses> listVar = new ArrayList<>();
                    //On récupère les codes 3 adresses de chacun des enfants
                    for(int i = 0; i < node.getChildCount(); i++) {
                        listVar.addAll(stock.get(node.getChild(i)));
                    }
                    
                    for(int i = 0; i < node.getChildCount(); i++) {//On parcourt tous les noeuds fils
                        CommonTree nodei = (CommonTree) node.getChild(i);
                        if(nodei.getText().equals("EXPR")){//Si le noeud fils est une EXPR (variable à assigner)
                            if(nodei.getChildCount()>1){//si l'expression a deux enfants, il s'agit d'une égalité
                                ArrayList<ThreeAdresses> stockChildren = stock.get(node.getChild(i));
                                boolean assign = false;
                                int j = stockChildren.size();
                                while(j>0&&!assign){//On parcourt tous les code 3 adresses associé au noeud EXPR
                                    j--;
                                    ThreeAdresses c3a = stockChildren.get(j);
                                    if(c3a.op.equals("CALL")&&c3a.var.equals("equals")){//Si on trouve un CALL de equals
                                        listVar.add(threeAdresses("ASSIGN", null, c3a.arg));//on assigne le registre correspondant au retour
                                        assign=true;
                                    }
                                }   
                            }
                            else{//sinon il s'agit d'une variable ou d'une fonction
                                CommonTree op = (CommonTree) nodei.getChild(0); //on récupère le noeud (variable, TL, HD, CALL...)
                                
                                //s'il s'agit d'une fonction
                                if(op.getText().equals("CALL")||op.getText().equals("CONS")||op.getText().equals("HD")||op.getText().equals("TL")||op.getText().equals("LIST")){
                                    ArrayList<ThreeAdresses> stockChildren = stock.get(node.getChild(i));
                                    boolean assign = false;
                                    int j = stockChildren.size();
                                    while(j>0&&!assign){//On parcourt tous le code 3 adresses associé au noeud EXPR
                                        j--;
                                        ThreeAdresses c3a = stockChildren.get(j);
                                        if(c3a.op.equals("CALL")){//Si on trouve un CALL on regarde si la fonction appelée est celle voulue
                                            if(op.getText().equals("CALL")&&c3a.var.equals(op.getChild(0).getText())){
                                                String[] outputVar = c3a.arg.split(", ");
                                                for(String reg : outputVar){//on ajoute à la liste tous ses registres
                                                    listVar.add(threeAdresses("ASSIGN", null, reg));
                                                }
                                                assign=true;
                                            }
                                            else if(c3a.var.equals(op.getText().toLowerCase())||(c3a.var.equals("cons")&&op.getText().equals("LIST"))){
                                                listVar.add(threeAdresses("ASSIGN", null, c3a.arg));
                                                assign=true;
                                            }
                                        }
                                    }
                                }                            
                                else{//il s'agit d'une variable, on peut l'assigner telle quelle
                                    listVar.add(threeAdresses("ASSIGN", null, op.getText()));
                                }
                            }
                        }
                        else{//les variables assignées ne sont pas des expr, on ajoute donc un ThreeAdresses "ASSIGNED"
                            listVar.add(threeAdresses("ASSIGNED", null, node.getChild(i).getText()));
                        }
                    }
                    
                    stock.put(node,listVar);
                    break;

                case "EXPR":
                    ArrayList<ThreeAdresses> list2 = new ArrayList<>();
                    if(node.getChildCount() == 1) {
                        list2 = stock.get(node.getChild(0));
                    }
                    else { //On sait pas ce que c'est un égalité
                    list2 = new ArrayList<>();
                    for(int i = 0; i<2; i++){
                        String text = node.getChild(i).getText();
                        if(text.equals("CALL")||text.equals("TL")||text.equals("HD")||text.equals("CONS")||text.equals("LIST")){
                            ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(i));
                            list2.addAll(c3a);
                            list2.add(threeAdresses("PARAM", c3a.get(c3a.size()-1).arg, null));
                        }
                        else {
                            list2.add(threeAdresses("PARAM", text, null));
                        }
                    }
                    list2.add(threeAdresses("CALL", "Reg_"+indice, "equals"));   //on appelle la fonction equals avec les paramètres
                    indice++;                     
                }
                stock.put(node,list2);
                break;

                case "TL":
                    list2 = stock.get(node.getChild(0));
                    ThreeAdresses paramTL = new ThreeAdresses();
                    paramTL.op = "PARAM";
                    String textTL = node.getChild(0).getText();
                    if(textTL.equals("CALL")||textTL.equals("TL")||textTL.equals("HD")||textTL.equals("CONS")||textTL.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                        paramTL.arg = c3a.get(c3a.size()-1).arg;
                    }
                    else {
                        paramTL.arg = node.getChild(0).getText();
                    }
                    list2.add(paramTL);
                    list2.add(threeAdresses("CALL", "Reg_"+indice, "tl"));
                    indice++;
                    stock.put(node,list2);
                    break;


                case "HD":
                    list2 = stock.get(node.getChild(0));
                    ThreeAdresses paramHD = new ThreeAdresses();
                    paramHD.op = "PARAM";
                    String textHD = node.getChild(0).getText();
                    if(textHD.equals("CALL")||textHD.equals("TL")||textHD.equals("HD")||textHD.equals("CONS")||textHD.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                        paramHD.arg = c3a.get(c3a.size()-1).arg;
                    }
                    else {
                        paramHD.arg = node.getChild(0).getText();
                    }
                    list2.add(paramHD);
                    list2.add(threeAdresses("CALL", "Reg_"+indice, "hd"));
                    indice++;
                    stock.put(node,list2);
                    break;

                case "LIST":
                    list2 = new ArrayList<>();
                    if(node.getChildCount()==0){
                        list2.add(threeAdresses("PARAM", "empty", null));
                        list2.add(threeAdresses("PARAM", "empty", null));
                        list2.add(threeAdresses("CALL", "Reg_"+indice, "list"));
                        indice++;
                    }
                    else {    
                        ArrayList<String> paramCons = new ArrayList<>();
                        for(CommonTree child: (List<CommonTree>) node.getChildren()){
                            String text = child.getText();
                            if(text.equals("CALL")||text.equals("TL")||text.equals("HD")||text.equals("CONS")||text.equals("LIST")){
                                list2.addAll(stock.get(child));
                                String[] outputs_func = stock.get(child).get(stock.get(child).size()-1).arg.split(", ");
                                for(String output : outputs_func){
                                    paramCons.add(output);
                                }
                            }
                            else{
                                paramCons.add(child.getText());
                            }
                        }
                        paramCons.add("nil");
                        list2 = consRecursif(paramCons, list2);
                    }
                    stock.put(node, list2);
                    break;

                case "CONS":
                    list2 = new ArrayList<>();
                    if(node.getChildCount()==0){
                        list2.add(threeAdresses("PARAM", "empty", null));
                        list2.add(threeAdresses("PARAM", "empty", null));
                        list2.add(threeAdresses("CALL", "Reg_"+indice, "cons"));
                        indice++;
                    }
                    else {    
                        ArrayList<String> paramCons = new ArrayList<>();
                        for(CommonTree child: (List<CommonTree>) node.getChildren()){
                            String text = child.getText();
                            if(text.equals("CALL")||text.equals("TL")||text.equals("HD")||text.equals("CONS")||text.equals("LIST")){
                                list2.addAll(stock.get(child));
                                String[] outputs_func = stock.get(child).get(stock.get(child).size()-1).arg.split(", ");
                                for(String output : outputs_func){
                                    paramCons.add(output);
                                }
                            }
                            else{
                                paramCons.add(child.getText());
                            }
                        }
                        if (paramCons.size()==1){
                            list2.add(threeAdresses("PARAM", "empty", null));
                            list2.add(threeAdresses("PARAM", paramCons.get(0), null));
                            list2.add(threeAdresses("CALL", "Reg_"+indice, "cons"));
                            indice++;
                        }
                        else list2 = consRecursif(paramCons, list2);
                    }
                    stock.put(node, list2);
                    break;

                case "CALL":
                    list2 = new ArrayList<>();
                    for(int i = 1; i<node.getChildCount();i++){
                        String text = node.getChild(i).getText();
                        if(Character.isUpperCase(text.charAt(0))){
                            list2.addAll(stock.get(node.getChild(i)));
                        }
                        ThreeAdresses param = new ThreeAdresses();
                        param.op = "PARAM";
                        if(text.equals("CALL")||text.equals("TL")||text.equals("HD")||text.equals("CONS")||text.equals("LIST")){
                            ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(i));
                            param.arg = c3a.get(c3a.size()-1).arg;
                        }
                        else {
                            param.arg = node.getChild(i).getText();
                        }
                        
                        list2.add(param);
                    }
                    String output = "Reg_"+ indice;//chaque fonction a au moins un retour
                    indice++;
                    for(int i = 0; i<(outputs.get(node.getChild(0).getText())-1);i++){//si elle en a plus, on ajoute à la string autant de registres qu'il faut
                        String concat = ", Reg_"+indice;
                        output+=concat;
                        indice++;
                    }
                    list2.add(threeAdresses("CALL", output, node.getChild(0).getText()));
                    stock.put(node,list2);
                    break;            

                case "FOR":
                    ArrayList<ThreeAdresses> forList = new ArrayList<>();
                    String textFOR = node.getChild(0).getChild(0).getText();
                    String indiceFor = "";
                    if(textFOR.equals("CALL")||textFOR.equals("TL")||textFOR.equals("HD")||textFOR.equals("CONS")||textFOR.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                        forList.addAll(c3a);
                        indiceFor = c3a.get(c3a.size()-1).arg;
                    }
                    else indiceFor = textFOR;
                    forList.add(threeAdresses("GOTO_IF_NIL", indiceFor, "block"+(indiceBlock+1)));
                    forList.add(threeAdresses("ENTER", null, "block"+indiceBlock));
                    
                    //On ajoute les codes trois adresses des enfants
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("DO")) {
                            forList.addAll(stock.get(child));
                        }
                    }
                    forList.add(threeAdresses("PARAM", indiceFor, null));
                    forList.add(threeAdresses("CALL", indiceFor, "tl"));
                    forList.add(threeAdresses("GOTO_IF_NOT_NIL", indiceFor, "block"+indiceBlock));
                    indiceBlock++;
                    forList.add(threeAdresses("ENTER", null, "block"+indiceBlock));
                    indiceBlock++;
                    stock.put(node, forList);
                    
                    break;

                case "FOREACH":
                    ArrayList<ThreeAdresses> foreachList = new ArrayList<>();
                    String textForeach = node.getChild(0).getChild(1).getChild(0).getText();
                    String indiceForeach = "";
                    if(textForeach.equals("CALL")||textForeach.equals("TL")||textForeach.equals("HD")||textForeach.equals("CONS")||textForeach.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0).getChild(1));
                        foreachList.addAll(c3a);
                        indiceForeach = c3a.get(c3a.size()-1).arg;
                    }
                    else indiceForeach = textForeach;      
                    foreachList.add(threeAdresses("GOTO_IF_NIL", indiceForeach, "block"+(indiceBlock+1)));
                    
                    foreachList.add(threeAdresses("ASSIGNED", null, "Reg_"+indice)); 
                    foreachList.add(threeAdresses("ASSIGN", null, indiceForeach));
                    foreachList.add(threeAdresses("ASSIGNED", null, node.getChild(0).getChild(0).getText())); 
                    foreachList.add(threeAdresses("ASSIGN", null, indiceForeach)); 
                    
                    foreachList.add(threeAdresses("ENTER", null, "block"+indiceBlock));
                    
                    foreachList.add(threeAdresses("PARAM", "Reg_"+indice, null));
                    foreachList.add(threeAdresses("CALL", node.getChild(0).getChild(0).getText(), "tl"));
                    //On ajoute les codes trois adresses des enfants
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("DO")) {
                            foreachList.addAll(stock.get(child));
                        }
                    }
                    foreachList.add(threeAdresses("PARAM", "Reg_"+indice, null));
                    foreachList.add(threeAdresses("CALL", "Reg_"+indice, "hd"));
                    foreachList.add(threeAdresses("GOTO_IF_NOT_NIL", "Reg_"+indice, "block"+indiceBlock));
                    foreachList.add(threeAdresses("ENTER", null, "block"+indiceBlock+1));
                    
                    stock.put(node, foreachList);
                    indice++;
                    indiceBlock+=2;
                    break;

                    case "WHILE":
                    System.out.println("JENTRE DANS LE WHILE");
                    ArrayList<ThreeAdresses> whileList = new ArrayList<>();
                    String textWhile = node.getChild(0).getChild(0).getText();
                    String indiceWhile = "";
                    if(textWhile.equals("CALL")||textWhile.equals("TL")||textWhile.equals("HD")||textWhile.equals("CONS")||textWhile.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                        whileList.addAll(c3a);
                        indiceWhile = c3a.get(c3a.size()-1).arg;
                    }
                    else indiceWhile = textWhile;
                    whileList.add(threeAdresses("GOTO_IF_NOT_TRUE", indiceWhile, "block"+indiceBlock+1));
                    whileList.add(threeAdresses("ENTER", null, "block"+indiceBlock));
                    
                    //On ajoute les codes trois adresses des enfants
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("DO")) {
                            whileList.addAll(stock.get(child));
                        }
                    }
                    whileList.add(threeAdresses("PARAM", indiceWhile, null));
                    whileList.add(threeAdresses("CALL", indiceWhile, "tl"));
                    whileList.add(threeAdresses("GOTO_IF_TRUE", indiceWhile, "block"+indiceBlock));
                    whileList.add(threeAdresses("ENTER", null, "block"+indiceBlock+1));
                    stock.put(node, whileList);
                    indiceBlock+=2;
                    
                case "DO":
                    ArrayList<ThreeAdresses> list7 = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        System.out.println(child.getText());
                        list7.addAll(stock.get(child));
                    }
                    stock.put(node, list7);
                    break;
                case "IF":
                    ArrayList<ThreeAdresses> ifList = new ArrayList<>();
                    String textIf = node.getChild(0).getChild(0).getText();
                    String indiceIf = "";
                    if(textIf.equals("CALL")||textIf.equals("TL")||textIf.equals("HD")||textIf.equals("CONS")||textIf.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                        ifList.addAll(c3a);
                        indiceIf = c3a.get(c3a.size()-1).arg;
                    }
                    else indiceIf = textIf;
                    ifList.add(threeAdresses("PARAM", indiceIf, null));
                    ifList.add(threeAdresses("CALL", indiceIf, "tl"));
                    ifList.add(threeAdresses("GOTO_IF_NOT_TRUE", indiceIf, "block"+indiceBlock));
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("THEN")){
                            ifList.addAll(stock.get(child));
                        }
                    }
                    ifList.add(threeAdresses("GOTO", indiceIf, "block"+(indiceBlock+1)));
                    
                    ifList.add(threeAdresses("ENTER", null, "block"+indiceBlock));
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("ELSE")){
                            ifList.addAll(stock.get(child));
                        }
                    }
                    ifList.add(threeAdresses("ENTER", null, "block"+(indiceBlock+1)));
                    indiceBlock+=2;
                    stock.put(node, ifList);
                    break;
                case "THEN":
                    ArrayList<ThreeAdresses> list6 = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {

                        list6.addAll(stock.get(child));
                    }
                    stock.put(node, list6);
                    break;
                case "ELSE":
                    ArrayList<ThreeAdresses> list4 = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        list4.addAll(stock.get(child));
                    }
                    stock.put(node, list4);
                    break;

                case "END":
                        String parent = node.getParent().getText();
                        ArrayList<ThreeAdresses> endCode = new ArrayList<>();
                        if(parent.equals("FUNCDEF")) {
                            endCode.add(threeAdresses("ENDFUNC", null, null));
                            
                        }
                        else endCode.add(threeAdresses("END", null, null)); 
                        stock.put(node, endCode);
                default:
                    break;
            }
        }
    }
    /**
     * Construit une ligne de code 3 adresses
     * @param op l'opérateur
     * @param arg l'argument
     * @param var la variable
     * @return un ThreeAdresses
     */
    public ThreeAdresses threeAdresses(String op, String arg, String var){
        ThreeAdresses c3a = new ThreeAdresses();
        c3a.op = op;
        c3a.arg = arg;
        c3a.var = var;
        return c3a;
    }

    /**
     * Fonction permettant la création des codes 3 adresses pour un cons avec n arguments, de manière récursive
     * @param inputs la liste des inputs restants
     * @param list les codes 3 adresses existants
     * @return la liste complète des codes 3 adresses
     */
    public ArrayList<ThreeAdresses> consRecursif(ArrayList<String> inputs, ArrayList<ThreeAdresses> list){
        if(inputs.size()==2){//s'il ne reste que deux paramètres à la liste, on crée le dernier cons, qui sera lu en premier
            list.add(threeAdresses("PARAM", inputs.get(0), null));
            list.add(threeAdresses("PARAM", inputs.get(1), null));
            list.add(threeAdresses("CALL", "Reg_"+indice, "cons"));
            indice++;
            return list;
        }
        else{//sinon on crée un cons contenant le premier indice de la liste, et le résultat de cons récursif pour le reste de la liste
            String param = inputs.get(0);
            inputs.remove(0);
            list = consRecursif(inputs, list);
            list.add(threeAdresses("PARAM", param, null));
            list.add(threeAdresses("PARAM", list.get(list.size()-2).arg, null));
            list.add(threeAdresses("CALL", "Reg_"+indice, "cons"));
            indice++;
            return list;
        }
    }
    
}


