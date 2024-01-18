package compilateur;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

import antlrworks.while_astParser.else__return;

public class VisitorThreeAdresses extends Visitor {

    int indice = 0;
    private HashMap<String,Integer> outputs = new HashMap<>();
    private HashMap<String,ArrayList<ThreeAdresses>> blocks = new HashMap<>();
    private int indiceBlock = 0;

    public class ThreeAdresses {
        public String op;
        public String arg1;
        public String arg2;
        public String var;
    };

    private HashMap<CommonTree,ArrayList<ThreeAdresses>> stock = new HashMap<CommonTree,ArrayList<ThreeAdresses>>(); 

    public HashMap<CommonTree,ArrayList<ThreeAdresses>> getCode3A() {
        return stock;
    }


    public HashMap<String,ArrayList<ThreeAdresses>> getBlocks() {
        return blocks;
    }


    public VisitorThreeAdresses(){
    }

    @Override
    protected void entry(CommonTree node) {
    }

    @Override
    protected void exit(CommonTree node) {
        
        if(node.getChildren() == null&&!(node.getText().equals("END"))&&!(node.getText().equals("CONS"))&&!(node.getText().equals("LIST"))) {
            ArrayList<ThreeAdresses> list = new ArrayList<>();
            list.add(threeAdresses("IGNORE", null, null, null));
            stock.put(node,list);
        }
        else{
            switch (node.getText()) {
                case "COMMENT":
                    ArrayList<ThreeAdresses> comment = new ArrayList<>();
                    comment.add(threeAdresses("IGNORE", null, null, null));
                case "START":
                    ArrayList<ThreeAdresses> start = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                            start.addAll(stock.get(child));    
                    }
                    stock.put(node, start);
                    break;
                case "PROGRAM":
                    ArrayList<ThreeAdresses> program = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                            program.addAll(stock.get(child));    
                    }
                    stock.put(node, program);
                    break;
                case "FUNCDEF":
                    CommonTree outputNode = (CommonTree) node.getChild(1).getChild(node.getChild(1).getChildCount()-1);
                    int outputNumber = 1;
                    while(outputNode.getChild(1) != null) {
                        outputNumber++;
                        outputNode = (CommonTree) outputNode.getChild(1);
                    }

                    outputs.put(node.getChild(0).getText(), outputNumber);
                    ArrayList<ThreeAdresses> funcdef = new ArrayList<>();
                    funcdef.add(threeAdresses("ENTER", node.getChild(0).getText(), null, "FUNCTION")); 
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        
                        if(Character.isUpperCase(child.getText().charAt(0))) {
                            funcdef.addAll(stock.get(child));
                        }
                    }
                    stock.put(node, funcdef);
                    break;
                case "FUNCTION":
                    ArrayList<ThreeAdresses> code3 = new ArrayList<>();
                    int i0 = 0;
                    while(i0<node.getChildCount()){
                        code3.addAll(stock.get(node.getChild(i0)));
                        i0++;
                    }
                    stock.put(node, code3);
                    break;
                case "INPUTS":
                    ArrayList<ThreeAdresses> code = new ArrayList<>();
                    for(int i = 0; i < node.getChildCount(); i++) {
                        code.add(threeAdresses("READ", null, null, node.getChild(i).getText()));
                    }
                    stock.put(node,code);
                    break;
                case "VARDEF":
                    ArrayList<ThreeAdresses> listVar = new ArrayList<>();
                    //On récupère les codes 3 adresses de chacun des enfants
                    for(int i = 0; i < node.getChildCount(); i++) {
                        listVar.addAll(stock.get(node.getChild(i)));
                    }
                    
                    for(int i = 0; i < node.getChildCount(); i++) {//On parcourt tous les noeuds fils
                        CommonTree nodei = (CommonTree) node.getChild(i);
                        if(nodei.getText().equals("EXPR")){//Si le noeud fils est une EXPR
                            if(nodei.getChildCount()>1){//si l'expression a deux enfants, il s'agit d'une égalité
                                ArrayList<ThreeAdresses> stockChildren = stock.get(node.getChild(i));
                                boolean assign = false;
                                int j = stockChildren.size();
                                while(j>0&&!assign){//On parcourt tous les code 3 adresses associé au noeud EXPR
                                    j--;
                                    ThreeAdresses c3a = stockChildren.get(j);
                                    if(c3a.op.equals("CALL")&&c3a.var.equals("equals")){//Si on trouve un CALL à equals
                                        listVar.add(threeAdresses("ASSIGN", null, null, c3a.arg1));//on assigne le registre correspondant au retour
                                        assign=true;
                                    }
                                }   
                            }
                            else{//sinon il s'agit d'une variable ou d'une fonction
                                CommonTree op = (CommonTree) nodei.getChild(0); //on récupère le noeud (variable, TL, HD, CALL...)
                                if(op.getText().equals("CALL")||op.getText().equals("CONS")||op.getText().equals("HD")||op.getText().equals("TL")||op.getText().equals("LIST")){
                                    ArrayList<ThreeAdresses> stockChildren = stock.get(node.getChild(i));
                                    boolean assign = false;
                                    int j = stockChildren.size();
                                    while(j>0&&!assign){//On parcourt tous le code 3 adresses associé au noeud EXPR
                                        j--;
                                        ThreeAdresses c3a = stockChildren.get(j);
                                        if(c3a.op.equals("CALL")){//Si on trouve un CALL
                                            
                                            if(op.getText().equals("CALL")&&c3a.var.equals(op.getChild(0).getText())){//On regarde si notre noeud est un CALL et si sa fonction est la même que celle du code3a
                                                listVar.add(threeAdresses("ASSIGN", null, null, c3a.var));
                                                assign=true;
                                            }
                                            else if(c3a.var.equals(op.getText().toLowerCase())||(c3a.var.equals("cons")&&op.getText().equals("LIST"))){
                                                listVar.add(threeAdresses("ASSIGN", null, null, c3a.arg1));
                                                assign=true;
                                            }
                                        }
                                    }
                                }                            
                                else{
                                    listVar.add(threeAdresses("ASSIGN", null, null, op.getText()));
                                }
                            }
                        }
                        else{
                            listVar.add(threeAdresses("ASSIGNED", null, null, node.getChild(i).getText()));
                        }
                    }
                    
                    stock.put(node,listVar);
                    break;

                case "EXPR":
                    ArrayList<ThreeAdresses> list2 = new ArrayList<>();
                    if(node.getChildCount() == 1) {
                        list2 = stock.get(node.getChild(0));
                    }
                    else { //On sait pas ce que c'est
                    list2 = new ArrayList<>();
                    for(int i = 0; i<2; i++){
                        String text = node.getChild(i).getText();
                        if(text.equals("CALL")||text.equals("TL")||text.equals("HD")||text.equals("CONS")||text.equals("LIST")){
                            ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(i));
                            list2.addAll(c3a);
                            list2.add(threeAdresses("PARAM", c3a.get(c3a.size()-1).arg1, null, null));
                        }
                        else {
                            list2.add(threeAdresses("PARAM", text, null, null));
                        }
                    }
                    list2.add(threeAdresses("CALL", "Reg_"+indice, null, "equals"));   
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
                        paramTL.arg1 = c3a.get(c3a.size()-1).arg1;
                    }
                    else {
                        paramTL.arg1 = node.getChild(0).getText();
                    }
                    list2.add(paramTL);
                    ThreeAdresses callTL = new ThreeAdresses();
                    callTL.op = "CALL";
                    callTL.var = "tl";
                    callTL.arg1 = "Reg_"+ indice;
                    indice++;
                    list2.add(callTL);
                    stock.put(node,list2);
                    break;
                case "HD":
                    list2 = stock.get(node.getChild(0));
                    ThreeAdresses paramHD = new ThreeAdresses();
                    paramHD.op = "PARAM";
                    String textHD = node.getChild(0).getText();
                    if(textHD.equals("CALL")||textHD.equals("TL")||textHD.equals("HD")||textHD.equals("CONS")||textHD.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                        paramHD.arg1 = c3a.get(c3a.size()-1).arg1;
                    }
                    else {
                        paramHD.arg1 = node.getChild(0).getText();
                    }
                    list2.add(paramHD);
                    ThreeAdresses callHD = new ThreeAdresses();
                    callHD.op = "CALL";
                    callHD.var = "hd";
                    callHD.arg1 = "Reg_"+ indice;
                    indice++;
                    list2.add(callHD);
                    stock.put(node,list2);
                    break;
                case "LIST":
                    list2 = new ArrayList<>();
                    if(node.getChildCount()==0){
                        list2.add(threeAdresses("PARAM", "empty", null, null));
                        list2.add(threeAdresses("PARAM", "empty", null, null));
                        list2.add(threeAdresses("CALL", "Reg_"+indice, null, "list"));
                        indice++;
                    }
                    else {    
                        ArrayList<String> paramCons = new ArrayList<>();
                        for(CommonTree child: (List<CommonTree>) node.getChildren()){
                            String text = child.getText();
                            if(text.equals("CALL")||text.equals("TL")||text.equals("HD")||text.equals("CONS")||text.equals("LIST")){
                                list2.addAll(stock.get(child));
                                String[] outputs_func = stock.get(child).get(stock.get(child).size()-1).arg1.split(", ");
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
                        list2.add(threeAdresses("PARAM", "empty", null, null));
                        list2.add(threeAdresses("PARAM", "empty", null, null));
                        list2.add(threeAdresses("CALL", "Reg_"+indice, null, "cons"));
                        indice++;
                    }
                    else {    
                        ArrayList<String> paramCons = new ArrayList<>();
                        for(CommonTree child: (List<CommonTree>) node.getChildren()){
                            String text = child.getText();
                            if(text.equals("CALL")||text.equals("TL")||text.equals("HD")||text.equals("CONS")||text.equals("LIST")){
                                list2.addAll(stock.get(child));
                                String[] outputs_func = stock.get(child).get(stock.get(child).size()-1).arg1.split(", ");
                                for(String output : outputs_func){
                                    paramCons.add(output);
                                }
                            }
                            else{
                                paramCons.add(child.getText());
                            }
                        }
                        if (paramCons.size()==1){
                            list2.add(threeAdresses("PARAM", "empty", null, null));
                            list2.add(threeAdresses("PARAM", paramCons.get(0), null, null));
                            list2.add(threeAdresses("CALL", "Reg_"+indice, null, "cons"));
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
                            param.arg1 = c3a.get(c3a.size()-1).arg1;
                        }
                        else {
                            param.arg1 = node.getChild(i).getText();
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
                    ThreeAdresses call = new ThreeAdresses();
                    call.op = "CALL";
                    call.var = node.getChild(0).getText();
                    call.arg1 = output;
                    list2.add(call);
                    stock.put(node,list2);
                    break;            

                case "FOR":
                    ArrayList<ThreeAdresses> forList = new ArrayList<>();
                    String textFOR = node.getChild(0).getChild(0).getText();
                    String indiceFor = "";
                    if(textFOR.equals("CALL")||textFOR.equals("TL")||textFOR.equals("HD")||textFOR.equals("CONS")||textFOR.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                        forList.addAll(c3a);
                        indiceFor = c3a.get(c3a.size()-1).arg1;
                    }
                    else indiceFor = textFOR;
                    forList.add(threeAdresses("ENTER", null, null, "block"+indiceBlock));
                    
                    //On ajoute les codes trois adresses des enfants
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("DO")) {
                            forList.addAll(stock.get(child));
                        }
                    }
                    forList.add(threeAdresses("PARAM", indiceFor, null, null));
                    forList.add(threeAdresses("CALL", indiceFor, null, "tl"));
                    forList.add(threeAdresses("GOTO_IF_NOT_NIL", indiceFor, null, "block"+indiceBlock));
                    stock.put(node, forList);
                    indiceBlock++;
                    break;

                case "FOREACH":
                    ArrayList<ThreeAdresses> foreachList = new ArrayList<>();
                    String textForeach = node.getChild(0).getChild(1).getChild(0).getText();
                    String indiceForeach = "";
                    if(textForeach.equals("CALL")||textForeach.equals("TL")||textForeach.equals("HD")||textForeach.equals("CONS")||textForeach.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0).getChild(1));
                        foreachList.addAll(c3a);
                        indiceForeach = c3a.get(c3a.size()-1).arg1;
                    }
                    else indiceForeach = textForeach;      
                    foreachList.add(threeAdresses("ASSIGNED", null, null, "Reg_"+indice)); 
                    foreachList.add(threeAdresses("ASSIGN", null, null, indiceForeach));
                    foreachList.add(threeAdresses("ASSIGNED", null, null, node.getChild(0).getChild(0).getText())); 
                    foreachList.add(threeAdresses("ASSIGN", null, null, indiceForeach)); 
                    foreachList.add(threeAdresses("ENTER", null, null, "block"+indiceBlock));
                    
                    foreachList.add(threeAdresses("PARAM", "Reg_"+indice, null, null));
                    foreachList.add(threeAdresses("CALL", node.getChild(0).getChild(0).getText(), null, "tl"));
                    //On ajoute les codes trois adresses des enfants
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("DO")) {
                            foreachList.addAll(stock.get(child));
                        }
                    }
                    foreachList.add(threeAdresses("PARAM", "Reg_"+indice, null, null));
                    foreachList.add(threeAdresses("CALL", "Reg_"+indice, null, "hd"));
                    foreachList.add(threeAdresses("GOTO_IF_NOT_NIL", "Reg_"+indice, null, "block"+indiceBlock));
                    stock.put(node, foreachList);
                    indice++;
                    indiceBlock++;
                    break;

                    case "WHILE":
                    System.out.println("JENTRE DANS LE WHILE");
                    ArrayList<ThreeAdresses> whileList = new ArrayList<>();
                    String textWhile = node.getChild(0).getChild(0).getText();
                    String indiceWhile = "";
                    if(textWhile.equals("CALL")||textWhile.equals("TL")||textWhile.equals("HD")||textWhile.equals("CONS")||textWhile.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                        whileList.addAll(c3a);
                        indiceWhile = c3a.get(c3a.size()-1).arg1;
                    }
                    else indiceWhile = textWhile;
                    whileList.add(threeAdresses("ENTER", null, null, "block"+indiceBlock));
                    
                    //On ajoute les codes trois adresses des enfants
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("DO")) {
                            whileList.addAll(stock.get(child));
                        }
                    }
                    whileList.add(threeAdresses("PARAM", indiceWhile, null, null));
                    whileList.add(threeAdresses("CALL", indiceWhile, null, "tl"));
                    whileList.add(threeAdresses("GOTO_IF_NOT_TRUE", indiceWhile, null, "block"+indiceBlock));
                    stock.put(node, whileList);
                    indiceBlock++;
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
                        indiceIf = c3a.get(c3a.size()-1).arg1;
                    }
                    else indiceIf = textIf;
                    ifList.add(threeAdresses("PARAM", indiceIf, null, null));
                    ifList.add(threeAdresses("CALL", indiceIf, null, "tl"));
                    ifList.add(threeAdresses("GOTO_IF_NOT_TRUE", indiceIf, null, "block"+indiceBlock));
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("THEN")){
                            ifList.addAll(stock.get(child));
                        }
                    }
                    ifList.add(threeAdresses("GOTO", indiceIf, null, "block"+(indiceBlock+1)));
                    
                    ifList.add(threeAdresses("ENTER", null, null, "block"+indiceBlock));
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("ELSE")){
                            ifList.addAll(stock.get(child));
                        }
                    }
                    ifList.add(threeAdresses("ENTER", null, null, "block"+(indiceBlock+1)));
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
                
                case "OUTPUT":
                    ArrayList<ThreeAdresses> list5 = new ArrayList<>();
                    if(node.getChildCount()>1){
                        list5.addAll(stock.get(node.getChild(1)));
                    }
                    ThreeAdresses returns = new ThreeAdresses();
                    returns.op = "RETURN";
                    returns.var = node.getChild(0).getText();
                    list5.add(returns);
                    stock.put(node,list5);
                    break;

                case "END":
                        String parent = node.getParent().getText();
                        ArrayList<ThreeAdresses> endCode = new ArrayList<>();
                        if(parent.equals("FUNCDEF")) {
                            endCode.add(threeAdresses("ENDFUNC", null, null, null));
                            
                        }
                        else endCode.add(threeAdresses("END", null, null, null)); 
                        stock.put(node, endCode);
                            blocks.clear();
                default:
                    break;
            }

            
        }
    }
    public ThreeAdresses threeAdresses(String op, String arg1, String arg2, String var){
        ThreeAdresses c3a = new ThreeAdresses();
        c3a.op = op;
        c3a.arg1 = arg1;
        c3a.arg2 = arg2;
        c3a.var = var;
        return c3a;
    }

    public ArrayList<ThreeAdresses> consRecursif(ArrayList<String> inputs, ArrayList<ThreeAdresses> list){
        if(inputs.size()==2){
            list.add(threeAdresses("PARAM", inputs.get(0), null, null));
            list.add(threeAdresses("PARAM", inputs.get(1), null, null));
            list.add(threeAdresses("CALL", "Reg_"+indice, null, "cons"));
            indice++;
            return list;
        }
        else{
            String param = inputs.get(0);
            inputs.remove(0);
            list = consRecursif(inputs, list);
            list.add(threeAdresses("PARAM", param, null, null));
            list.add(threeAdresses("PARAM", list.get(list.size()-2).arg1, null, null));
            list.add(threeAdresses("CALL", "Reg_"+indice, null, "cons"));
            indice++;
            return list;
        }
    }
    
}


