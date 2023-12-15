import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import org.antlr.runtime.tree.CommonTree;

public class VisitorThreeAdresses extends Visitor {

    int indice = 0;

    class ThreeAdresses {
        String op;
        String arg1;
        String arg2;
        String var;
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
        System.out.println("exit : " + node.getText());
        if(node.getChildren() == null) {
            ThreeAdresses temp = new ThreeAdresses();
            temp.op = "STORE";
            temp.arg1 = "R"+ indice;
            temp.arg2 = node.getText();
            indice++;
            ArrayList<ThreeAdresses> list = new ArrayList<>();
            list.add(temp);
            stock.put(node,list);
        }
        else{
            switch (node.getText()) {
                case "FUNCDEF":
                    break;
                case "INPUTS":
                ArrayList<ThreeAdresses> code = stock.get(node.getChild(0));
                for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        ThreeAdresses temp = new ThreeAdresses();
                        temp.op = "READ";
                        temp.var = stock.get(child).get(0).arg1;
                        code.add(stock.get(child).get(0));
                        code.add(temp);
                    }
                    stock.put(node,code);
                    break;
                case "VARDEF":
                    for(int i = 0; i < node.getChildCount(); i+=2) {
                            ThreeAdresses temp = new ThreeAdresses();
                            temp.op = "ASSIGN";
                            temp.arg1 = stock.get(node.getChild(i)).get(0).arg1;
                            temp.arg2 = stock.get(node.getChild(i+1)).get(0).arg1;
                            ArrayList<ThreeAdresses> list = stock.get(node.getChild(i));
                            list.add(stock.get(node.getChild(i+1)).get(0));
                            list.add(temp);
                            stock.put(node,list); 
                    }
                    break;
                case "VARIABLES":
                    ThreeAdresses temp = new ThreeAdresses();
                    temp.op = "STORE";
                    temp.arg1 = "R"+ indice;
                    temp.arg2 = stock.get(node.getChild(0)).get(0).arg1;
                    indice++;
                    ArrayList<ThreeAdresses> list = stock.get(node.getChild(0));
                    list.add(temp);
                    stock.put(node,list);
                    break;
                
                case "EXPR":
                    if(node.getChildCount() == 1) {
                        switch (node.getChild(0).getText()) {
                            case "TL":
                                ArrayList<ThreeAdresses> list2 = stock.get(node.getChild(0));
                                ThreeAdresses paramTL = new ThreeAdresses();
                                paramTL.op = "PARAM";
                                paramTL.arg1 = stock.get(node.getChild(0).getChild(0)).get(0).arg1;
                                list2.add(paramTL);
                                ThreeAdresses callTL = new ThreeAdresses();
                                callTL.op = "CALL";
                                callTL.var = "TL";
                                list2.add(callTL);
                                stock.put(node,list2);
                                break;
                            case "HD":
                                ArrayList<ThreeAdresses> list3 = stock.get(node.getChild(0));
                                ThreeAdresses paramHD = new ThreeAdresses();
                                paramHD.op = "PARAM";
                                paramHD.arg1 = stock.get(node.getChild(0).getChild(0)).get(0).arg1;
                                list3.add(paramHD);
                                ThreeAdresses callHD = new ThreeAdresses();
                                callHD.op = "CALL";
                                callHD.var = "TL";
                                list3.add(callHD);
                                stock.put(node,list3);
                                break;
                            case "LIST":
                                ArrayList<ThreeAdresses> list4 = stock.get(node.getChild(0));
                                ThreeAdresses paramLIST = new ThreeAdresses();
                                paramLIST.op = "PARAM";
                                paramLIST.arg1 = stock.get(node.getChild(0).getChild(0)).get(0).arg1;
                                list4.add(paramLIST);
                                ThreeAdresses callLIST = new ThreeAdresses();
                                callLIST.op = "CALL";
                                callLIST.var = "TL";
                                list4.add(callLIST);
                                stock.put(node,list4);
                                break;
                            case "CONS":
                                ArrayList<ThreeAdresses> list5 = stock.get(node.getChild(0));
                                ThreeAdresses paramCONS = new ThreeAdresses();
                                paramCONS.op = "PARAM";
                                paramCONS.arg1 = stock.get(node.getChild(0).getChild(0)).get(0).arg1;
                                list5.add(paramCONS);
                                ThreeAdresses callCONS = new ThreeAdresses();
                                callCONS.op = "CALL";
                                callCONS.var = "TL";
                                list5.add(callCONS);
                                stock.put(node,list5);
                                break;
                            default:
                                break;
                        }                           
                    }
                    
                    else {
                        ThreeAdresses store1 = new ThreeAdresses();
                        ArrayList<ThreeAdresses> list5 = stock.get(node.getChild(0));
                        store1.op = "STORE";
                        store1.arg1 = "R"+ indice;
                        store1.arg2 = stock.get(node.getChild(0)).get(0).arg1;
                        indice++;
                        list5.add(store1);
                        ThreeAdresses store2 = new ThreeAdresses();
                        store2.op = "STORE";
                        store2.arg1 = "R"+ indice;
                        store2.arg2 = stock.get(node.getChild(1)).get(0).arg1;
                        indice++;
                        list5.add(store2);
                        ThreeAdresses equals = new ThreeAdresses();
                        equals.op = "EQUALS";
                        equals.arg1 = store1.arg1;
                        equals.arg2 = store2.arg1;
                        indice++;
                        list5.add(equals);
                        stock.put(node,list5);
                        }      
                    break;
                case "FOR":
                    ArrayList<ThreeAdresses> forList = new ArrayList<>();   
                    ThreeAdresses store = new ThreeAdresses();
                    store.op = "STORE";
                    store.arg1 = "R"+ indice;
                    store.arg2 = node.getChild(0).getText();
                    indice++;
                    forList.add(store);
                    ThreeAdresses param = new ThreeAdresses();
                    param.op = "PARAM";
                    param.arg1 = node.getChild(0).getText();
                    forList.add(param);
                    ThreeAdresses verifNil = new ThreeAdresses();
                    verifNil.op = "CALL";
                    verifNil.var = "VERIFNIL";
                    verifNil.arg1 = "R"+ indice;
                    indice++;
                    forList.add(verifNil);
                    ThreeAdresses jump_cond = new ThreeAdresses();
                    jump_cond.op = "GOTO_IF_TRUE";
                    jump_cond.arg1 = "R"+ (indice-1);
                    jump_cond.arg2 = "break";
                    forList.add(jump_cond);
                    ThreeAdresses param2 = new ThreeAdresses();
                    param2.op = "PARAM";
                    param2.arg1 = node.getChild(0).getText();
                    forList.add(param2);
                    ThreeAdresses increment = new ThreeAdresses();
                    increment.op = "CALL";
                    increment.var = "TL";
                    increment.arg1 = "R"+ indice;
                    indice++;
                    forList.add(increment);
                    ThreeAdresses arbre = new ThreeAdresses();
                    arbre.op = "ASSIGN";
                    arbre.arg1 = stock.get(node.getChild(0)).arg1;
                    arbre.arg2 = "R"+ (indice-1);
                    stock.put(node,arbre);
                    break;

                case "END":
                        String parent = node.getParent().getText();
                        if(parent.equals("FOR")||parent.equals("WHILE")||parent.equals("FOREACH")) {
                            ThreeAdresses jump = new ThreeAdresses();
                            jump.op = "GOTO";
                            jump.arg1 = "Code3A.get(Code3A.size()-1).get(0)";
                        }
                    

                case "FOREACH":
                    int enfant = 0;
                    ThreeAdresses param2 = new ThreeAdresses();
                    param2.op = "PARAM";
                    param2.arg1 = node.getChild(0).getChild(1).getChild(0).getText();
                    param2.arg2 = ""+ enfant;
                    ThreeAdresses verifChild = new ThreeAdresses();
                    verifChild.op = "CALL";
                    verifChild.var = "VERIFCHILD";
                    verifChild.arg1 = "R"+ indice;
                    indice++;
                    ThreeAdresses jump_cond2 = new ThreeAdresses();
                    jump_cond2.op = "GOTO_IF_TRUE";
                    jump_cond2.arg1 = "R"+ (indice-1);
                    jump_cond2.arg2 = "break";
                    enfant++;      
                    break;

                    case "WHILE":
                        ThreeAdresses param3 = new ThreeAdresses();
                        param3.op = "PARAM";
                        param3.arg1 = node.getChild(0).getText();
                        ThreeAdresses verifTrue = new ThreeAdresses();
                        verifTrue.op = "CALL";
                        verifTrue.var = "VERIFTRUE";
                        verifTrue.arg1 = "R"+ indice;
                        indice++;
                        ThreeAdresses jump_cond3 = new ThreeAdresses();
                        jump_cond3.op = "GOTO_IF_TRUE";
                        jump_cond3.arg1 = "R"+ (indice-1);
                        jump_cond3.arg2 = "break";
                        break;
                case "IF":
                    break;
                case "ELSE":
                    break;
                case "TL":
                    break;
                case "DO":
                    break;
                case "OUTPUT":
                    break; 
                default:
                    break;
            }
        }
    }
    
}
