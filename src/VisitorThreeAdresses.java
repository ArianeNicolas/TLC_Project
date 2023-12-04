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

    private HashMap<CommonTree,ThreeAdresses> stock = new HashMap<CommonTree,ThreeAdresses>(); 

    private Stack<ThreeAdresses> Code3A;

    public HashMap<CommonTree,ThreeAdresses> getCode3A() {
        return stock;
    }

    public Stack<ThreeAdresses> getCode3AStack() {
        return Code3A;
    }

    public VisitorThreeAdresses(){
        Code3A = new Stack<ThreeAdresses>();
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
            stock.put(node,temp);
            Code3A.push(temp);
        }
        else{
            switch (node.getText()) {
                case "FUNCDEF":
                    break;
                case "INPUTS":
                for(CommonTree child : (List<CommonTree>) node.getChildren()) {
                        ThreeAdresses temp = new ThreeAdresses();
                        temp.op = "READ";
                        temp.var = stock.get(child).arg1;
                        Code3A.push(temp);
                        stock.put(node,temp);
                    }
                    break;
                case "VARDEF":
                    for(int i = 0; i < node.getChildCount(); i+=2) {
                            ThreeAdresses temp = new ThreeAdresses();
                            temp.op = "ASSIGN";
                            temp.arg1 = stock.get(node.getChild(i)).arg1;
                            temp.arg2 = stock.get(node.getChild(i+1)).arg1;
                            Code3A.push(temp);
                            stock.put(node,temp); 
                    }
                    break;
                case "VARIABLES":
                    ThreeAdresses temp = new ThreeAdresses();
                    temp.op = "STORE";
                    temp.arg1 = "R"+ indice;
                    temp.arg2 = stock.get(node.getChild(0)).arg1;
                    indice++;
                    stock.put(node,temp);
                    Code3A.push(temp);
                    break;
                
                case "EXPR":
                    if(node.getChildCount() == 1) {
                        switch (node.getChild(0).getText()) {
                            case "TL":
                                ThreeAdresses param = new ThreeAdresses();
                                param.op = "PARAM";
                                param.arg1 = stock.get(node.getChild(0).getChild(0)).arg1;
                                stock.put(node,param);
                                Code3A.push(param);
                                ThreeAdresses call = new ThreeAdresses();
                                call.op = "CALL";
                                call.var = "TL";
                                stock.put(node,call);
                                Code3A.push(call);
                                break;
                            default:
                                ThreeAdresses store = new ThreeAdresses();
                                store.op = "STORE";
                                store.arg1 = "R"+ indice;
                                store.arg2 = stock.get(node.getChild(0)).arg1;
                                indice++;
                                stock.put(node,store);
                                Code3A.push(store);
                                break;
                        }                           
                    }
                    
                    else {
                        }
                
                    break;
                case "FOREACH":
                    break;
                case "IN":
                    break;
                case "END":
                    break;
                case "IF":
                    break;
                case "ELSE":
                    break;
                case "WHILE":
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
