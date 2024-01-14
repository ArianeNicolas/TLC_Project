package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import antlrworks.while_astParser.else__return;

public class VisitorThreeAdresses extends Visitor {

    int indice = 0;
    private HashMap<String,Integer> outputs = new HashMap<>();

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
                    outputs.put(node.getChild(0).getText(), node.getChild(1).getChild(node.getChild(1).getChildCount()-1).getChildCount());
                    ArrayList<ThreeAdresses> funcdef = new ArrayList<>();
                    funcdef.add(threeAdresses("ENTER", node.getChild(0).getText(), null, "FUNCTION")); 
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(!child.getText().equals("END")&&Character.isUpperCase(child.getText().charAt(0))) {
                            funcdef.addAll(stock.get(child));
                        }
                    }
                    stock.put(node, funcdef);
                    break;
                case "FUNCTION":
                    ArrayList<ThreeAdresses> code3 = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        code3.addAll(stock.get(child));    
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
                                            System.out.println("c3a.var = "+c3a.var+"op.getText() = "+op.getText());
                                            
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
                    ThreeAdresses enterFor = new ThreeAdresses();
                    if(textFOR.equals("CALL")||textFOR.equals("TL")||textFOR.equals("HD")||textFOR.equals("CONS")||textFOR.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                        forList.addAll(c3a);
                        enterFor.arg1 = c3a.get(c3a.size()-1).arg1;
                    }
                    else enterFor.arg1 = textFOR;
                    enterFor.op = "ENTER";
                    enterFor.var = "FOR";
                    forList.add(enterFor); 
                    //On ajoute les codes trois adresses des enfants
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("DO") || child.getText().equals("END")) {
                            forList.addAll(stock.get(child));
                        }
                    }
                    stock.put(node, forList);
                    break;

                case "FOREACH":
                    ArrayList<ThreeAdresses> forEachList = new ArrayList<>();
                    ThreeAdresses foreachjump = new ThreeAdresses();
                    String textForeach = node.getChild(0).getChild(1).getChild(0).getText();
                    if(textForeach.equals("CALL")||textForeach.equals("TL")||textForeach.equals("HD")||textForeach.equals("CONS")||textForeach.equals("LIST")){
                        ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0).getChild(1).getChild(0));
                        forEachList.addAll(c3a);
                        foreachjump.arg1 = c3a.get(c3a.size()-1).arg1;
                    }
                    else foreachjump.arg1 = textForeach;
                    foreachjump.op = "ENTER";
                    foreachjump.arg2 = node.getChild(0).getChild(0).getText();
                    foreachjump.var = "FOREACH";
                    forEachList.add(foreachjump); 
                    //On ajoute les codes trois adresses des enfants
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("DO")||child.getText().equals("END")) {
                            forEachList.addAll(stock.get(child));
                        }
                    }
                    stock.put(node, forEachList); 
                    break;

                    case "WHILE":
                        ArrayList<ThreeAdresses> whileList = new ArrayList<>();
                        ThreeAdresses enterWhile = new ThreeAdresses();
                        enterWhile.op = "ENTER";
                        enterWhile.var = "WHILE";
                        String textWHILE = node.getChild(0).getChild(0).getText();
                        if(textWHILE.equals("CALL")||textWHILE.equals("TL")||textWHILE.equals("HD")||textWHILE.equals("CONS")||textWHILE.equals("LIST")){
                            ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                            whileList.addAll(c3a);
                            enterWhile.arg1 = c3a.get(c3a.size()-1).arg1;
                        }
                        else enterWhile.arg1 = textWHILE;
                        whileList.add(enterWhile);
                        //On ajoute les codes trois adresses des enfants
                        for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                            if(child.getText().equals("DO")||child.getText().equals("END")) {
                                whileList.addAll(stock.get(child));
                            }
                        }
                        stock.put(node,whileList);
                        break;
                case "DO":
                    ArrayList<ThreeAdresses> list7 = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        list7.addAll(stock.get(child));
                    }
                    stock.put(node, list7);
                    break;
                case "IF":
                    ArrayList<ThreeAdresses> ifList = new ArrayList<>(); 
                    ThreeAdresses ifjump = new ThreeAdresses();
                    ifjump.op = "ENTER";
                    ifjump.var = "IF";
                    String textIF = node.getChild(0).getChild(0).getText();
                        if(textIF.equals("CALL")||textIF.equals("TL")||textIF.equals("HD")||textIF.equals("CONS")||textIF.equals("LIST")){
                            ArrayList<ThreeAdresses> c3a = stock.get(node.getChild(0));
                            ifList.addAll(c3a);
                            ifjump.arg1 = c3a.get(c3a.size()-1).arg1;
                        }
                        else ifjump.arg1 = textIF;
                    ifList.add(ifjump);
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("THEN")||child.getText().equals("ELSE")||child.getText().equals("END")){
                            ifList.addAll(stock.get(child));
                        }
                    }
                    stock.put(node, ifList);
                    break;
                case "THEN":
                    ArrayList<ThreeAdresses> list6 = new ArrayList<>();
                    ThreeAdresses thenjump = new ThreeAdresses();
                    thenjump.op = "ENTER";
                    thenjump.var = "THEN";
                    list6.add(thenjump);
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {

                        list6.addAll(stock.get(child));
                    }
                    stock.put(node, list6);
                    break;
                case "ELSE":
                    ArrayList<ThreeAdresses> list4 = new ArrayList<>();
                    ThreeAdresses elsejump = new ThreeAdresses();
                    elsejump.op = "ENTER";
                    elsejump.var = "ELSE";
                    list4.add(elsejump);
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
                        if(parent.equals("FOR")||parent.equals("WHILE")||parent.equals("FOREACH")||parent.equals("IF")) {
                            ThreeAdresses jump = new ThreeAdresses();
                            jump.op = "END";
                            jump.arg1 = node.getParent().getText();
                            ArrayList<ThreeAdresses> list11 = new ArrayList<>();
                            list11.add(jump);
                            stock.put(node,list11);
                        }
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


