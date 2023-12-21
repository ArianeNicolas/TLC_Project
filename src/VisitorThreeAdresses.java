import java.lang.reflect.Array;
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
        
        if(node.getChildren() == null&&!(node.getText().equals("END"))) {
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
                    ArrayList<ThreeAdresses> code2 = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(!child.getText().equals("END")) {
                            code2.addAll(stock.get(child));
                        }
                    }
                    stock.put(node, code2);
                    break;
                case "FUNCTION":
                    ArrayList<ThreeAdresses> code3 = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(!child.getText().equals("OUTPUT")) {
                            code3.addAll(stock.get(child));
                        }
                    }
                    stock.put(node, code3);
                    break;
                case "INPUTS":
                ArrayList<ThreeAdresses> code = new ArrayList<>();
                for(int i = 0; i < node.getChildCount(); i++) {
                        ThreeAdresses temp = new ThreeAdresses();
                        temp.op = "READ";
                        temp.var = stock.get(node.getChild(i)).get(0).arg1;
                        code.add(stock.get(node.getChild(i)).get(0));
                        code.add(temp);
                    }
                    stock.put(node,code);
                    break;
                case "VARDEF":
                    ArrayList<ThreeAdresses> listVar = new ArrayList<>();
                    for(int i = 0; i < node.getChildCount()/2; i++) {
                            ThreeAdresses temp = new ThreeAdresses();
                            temp.op = "ASSIGN";
                            temp.arg1 = stock.get(node.getChild(i)).get(0).arg1;
                            temp.arg2 = stock.get(node.getChild(i+node.getChildCount()/2)).get(0).arg1;
                            listVar = stock.get(node.getChild(i));
                            listVar.addAll(stock.get(node.getChild(i+node.getChildCount()/2)));
                            listVar.add(temp); 
                    }
                    stock.put(node,listVar);
                    break;
                case "VARIABLES":
                    ArrayList<ThreeAdresses> list = stock.get(node.getChild(0));
                    stock.put(node,list);
                    break;
                
                case "EXPR":
                    ArrayList<ThreeAdresses> list2 = new ArrayList<>();
                    if(node.getChildCount() == 1) {
                        switch (node.getChild(0).getText()) {
                            case "TL":
                                list2 = stock.get(node.getChild(0).getChild(0));
                                ThreeAdresses paramTL = new ThreeAdresses();
                                paramTL.op = "PARAM";
                                paramTL.arg1 = stock.get(node.getChild(0).getChild(0)).get(0).arg1;
                                list2.add(paramTL);
                                ThreeAdresses callTL = new ThreeAdresses();
                                callTL.op = "CALL";
                                callTL.arg1 = "R"+ indice;
                                callTL.var = "TL";
                                indice++;
                                list2.add(callTL);
                                ThreeAdresses store = new ThreeAdresses();
                                store.op = "STORE";
                                store.arg1 = "R"+ indice;
                                store.arg2 = "R"+ (indice-1);
                                indice++;
                                list2.add(store);
                                break;
                            case "HD":
                                list2 = stock.get(node.getChild(0).getChild(0));
                                ThreeAdresses paramHD = new ThreeAdresses();
                                paramHD.op = "PARAM";
                                paramHD.arg1 = stock.get(node.getChild(0).getChild(0)).get(0).arg1;
                                list2.add(paramHD);
                                ThreeAdresses callHD = new ThreeAdresses();
                                callHD.op = "CALL";
                                callHD.var = "HD";
                                callHD.arg1 = "R"+ indice;
                                indice++;
                                list2.add(callHD);
                                ThreeAdresses store2 = new ThreeAdresses();
                                store2.op = "STORE";
                                store2.arg1 = "R"+ indice;
                                store2.arg2 = "R"+ (indice-1);
                                indice++;
                                list2.add(store2);
                                break;
                            case "LIST":
                                list2 = stock.get(node.getChild(0).getChild(0));
                                ThreeAdresses paramLIST = new ThreeAdresses();
                                paramLIST.op = "PARAM";
                                paramLIST.arg1 = stock.get(node.getChild(0).getChild(0)).get(0).arg1;
                                list2.add(paramLIST);
                                ThreeAdresses callLIST = new ThreeAdresses();
                                callLIST.op = "CALL";
                                callLIST.var = "LIST";
                                callLIST.arg1 = "R"+ indice;
                                indice++;
                                list2.add(callLIST);
                                ThreeAdresses store3 = new ThreeAdresses();
                                store3.op = "STORE";
                                store3.arg1 = "R"+ indice;
                                store3.arg2 = "R"+ (indice-1);
                                indice++;
                                list2.add(store3);
                                break;
                            case "CONS":
                                list2 = stock.get(node.getChild(0).getChild(0));
                                ThreeAdresses paramCONS = new ThreeAdresses();
                                paramCONS.op = "PARAM";
                                paramCONS.arg1 = stock.get(node.getChild(0).getChild(0)).get(0).arg1;
                                list2.add(paramCONS);
                                ThreeAdresses callCONS = new ThreeAdresses();
                                callCONS.op = "CALL";
                                callCONS.var = "CONS";
                                callCONS.arg1 = "R"+ indice;
                                indice++;
                                list2.add(callCONS);
                                ThreeAdresses store4 = new ThreeAdresses();
                                store4.op = "STORE";
                                store4.arg1 = "R"+ indice;
                                store4.arg2 = "R"+ (indice-1);
                                indice++;
                                list2.add(store4);
                                break;
                            default:
                                list2 = stock.get(node.getChild(0));
                                ThreeAdresses store5 = new ThreeAdresses();
                                store5.op = "STORE";
                                store5.arg1 = "R"+ indice;
                                store5.arg2 = stock.get(node.getChild(0)).get(0).arg1;
                                indice++;
                                list2.add(store5);
                                break;
                        }                           
                    }
                    
                    else {
                        if(node.getChild(0).getText().equals("not")){
                            list2 = stock.get(node.getChild(1));
                            ThreeAdresses param = new ThreeAdresses();
                            param.op = "PARAM";
                            param.arg1 = stock.get(node.getChild(0)).get(0).arg1;
                            list2.add(param);
                            ThreeAdresses call = new ThreeAdresses();
                            call.op = "CALL";
                            call.var = "NOT";
                            call.arg1 = "R"+ indice;
                            indice++;
                            list2.add(call);
                            ThreeAdresses store = new ThreeAdresses();
                            store.op = "STORE";
                            store.arg1 = "R"+ indice;
                            store.arg2 = "R"+ (indice-1);
                            indice++;
                            list2.add(store);
                        }
                        else{
                            ThreeAdresses store1 = new ThreeAdresses();
                            list2 = stock.get(node.getChild(0));
                            store1.op = "STORE";
                            store1.arg1 = "R"+ indice;
                            store1.arg2 = stock.get(node.getChild(0)).get(0).arg1;
                            indice++;
                            list2.add(store1);
                            ThreeAdresses store2 = new ThreeAdresses();
                            store2.op = "STORE";
                            store2.arg1 = "R"+ indice;
                            store2.arg2 = stock.get(node.getChild(1)).get(0).arg1;
                            indice++;
                            list2.add(store2);
                            ThreeAdresses equals = new ThreeAdresses();
                            equals.op = "EQUALS";
                            equals.arg1 = store1.arg1;
                            equals.arg2 = store2.arg1;
                            equals.var = "R"+ indice;
                            indice++;
                            list2.add(equals);
                            ThreeAdresses store = new ThreeAdresses();
                            store.op = "STORE";
                            store.arg1 = "R"+ indice;
                            store.arg2 = list2.get(list2.size()-1).var;
                            indice++;
                            list2.add(store);
                        }
                    }
                    
                    stock.put(node,list2);
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
                    param.arg1 = forList.get(0).arg1;
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
                    //On ajoute les codes trois adresses des enfants
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("DO")) {
                            forList.addAll(stock.get(child));
                        }
                    }

                    //on décrémente l'indice
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
                    arbre.arg1 = stock.get(node.getChild(0)).get(0).arg1;
                    arbre.arg2 = "R"+ (indice-1);
                    stock.put(node, forList);
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("END")) {
                            forList.addAll(stock.get(child));
                        }
                    }
                    break;

                case "FOREACH":
                    ArrayList<ThreeAdresses> forEachList = new ArrayList<>();
                    ThreeAdresses param3 = new ThreeAdresses();
                    param3.op = "PARAM";
                    param3.arg1 = node.getChild(0).getChild(1).getChild(0).getText();
                    param3.arg2 = node.getChild(0).getChild(0).getText();
                    forEachList.add(param3);
                    ThreeAdresses verifChild = new ThreeAdresses();
                    verifChild.op = "CALL";
                    verifChild.var = "VERIFCHILD";
                    verifChild.arg1 = "R"+ indice;
                    indice++;
                    forEachList.add(verifChild);
                    ThreeAdresses jump_cond2 = new ThreeAdresses();
                    jump_cond2.op = "GOTO_IF_TRUE";
                    jump_cond2.arg1 = "R"+ (indice-1);
                    jump_cond2.arg2 = "break";
                    forEachList.add(jump_cond2);
                    //On ajoute les codes trois adresses des enfants
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("DO")) {
                            forEachList.addAll(stock.get(child));
                        }
                    }
                    ThreeAdresses param4 = new ThreeAdresses();
                    param4.op = "PARAM";
                    param4.arg1 = node.getChild(0).getChild(1).getChild(0).getText();
                    forEachList.add(param4);
                    ThreeAdresses increment2 = new ThreeAdresses();
                    increment2.op = "CALL";
                    increment2.var = "TL";
                    increment2.arg1 = "R"+ indice;
                    indice++;
                    forEachList.add(increment2);
                    ThreeAdresses sous_arbre = new ThreeAdresses();
                    sous_arbre.op = "ASSIGN";
                    sous_arbre.arg1 = node.getChild(0).getChild(0).getText();
                    sous_arbre.arg2 = forEachList.get(forEachList.size()-1).arg1;
                    forEachList.add(sous_arbre);
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        if(child.getText().equals("END")) {
                            forEachList.addAll(stock.get(child));
                        }
                    }
                    stock.put(node, forEachList); 
                    break;

                    case "WHILE":
                        ArrayList<ThreeAdresses> whileList = new ArrayList<>(); 
                        ThreeAdresses param5 = new ThreeAdresses();
                        ArrayList<ThreeAdresses> expr = stock.get(node.getChild(0));
                        param5.op = "PARAM";
                        param5.arg1 = expr.get(expr.size()-1).arg1;
                        whileList.add(param5);
                        ThreeAdresses verifTrue = new ThreeAdresses();
                        verifTrue.op = "CALL";
                        verifTrue.var = "VERIFTRUE";
                        verifTrue.arg1 = "R"+ indice;
                        indice++;
                        whileList.add(verifTrue);
                        ThreeAdresses jump_cond3 = new ThreeAdresses();
                        jump_cond3.op = "GOTO_IF_TRUE";
                        jump_cond3.arg1 = "R"+ (indice-1);
                        jump_cond3.arg2 = "break";
                        whileList.add(jump_cond3);
                        //On ajoute les codes trois adresses des enfants
                        for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                            if(child.getText().equals("DO")||child.getText().equals("END")) {
                                whileList.addAll(stock.get(child));
                            }
                        }
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
                    ThreeAdresses param6 = new ThreeAdresses();
                    ArrayList<ThreeAdresses> expr2 = stock.get(node.getChild(0));
                    param6.op = "PARAM";
                    param6.arg1 = expr2.get(expr2.size()-1).arg1;
                    ifList.add(param6);
                    ThreeAdresses verifTrueIf = new ThreeAdresses();
                    verifTrueIf.op = "CALL";
                    verifTrueIf.var = "VERIFTRUE";
                    verifTrueIf.arg1 = "R"+ indice;
                    indice++;
                    ifList.add(verifTrueIf);
                    ThreeAdresses jump_cond4 = new ThreeAdresses();
                    jump_cond4.op = "GOTO_IF_FALSE";
                    jump_cond4.arg1 = "R"+ (indice-1);
                    jump_cond4.arg2 = "ElSE";
                    ifList.add(jump_cond4);
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        
                        if(child.getText().equals("THEN")) {
                            ifList.addAll(stock.get(child));
                        }
                    }
                    stock.put(node, ifList);
                    break;
                case "THEN":
                    ArrayList<ThreeAdresses> list3 = new ArrayList<>();
                    for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        list3.addAll(stock.get(child));
                    }
                    stock.put(node, list3);
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
                    break;

                case "END":
                        String parent = node.getParent().getText();
                        if(parent.equals("FOR")||parent.equals("WHILE")||parent.equals("FOREACH")) {
                            ThreeAdresses jump = new ThreeAdresses();
                            jump.op = "GOTO";
                            jump.arg1 = "Code3A.get(Code3A.size()-1).get(0)";
                            ArrayList<ThreeAdresses> list6 = new ArrayList<>();
                            list6.add(jump);
                            stock.put(node,list6);
                        }
                default:
                    break;
            }
        }
    }
    
}
