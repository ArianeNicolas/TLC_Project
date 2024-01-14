package compilateur;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import compilateur.VisitorThreeAdresses.ThreeAdresses;


public class code3AtoC {
    private ArrayList<VisitorThreeAdresses.ThreeAdresses> code3A;
    private ArrayList<WhileContext> symbolsTable;
    private FileWriter fileWriter; 
    private PrintWriter printWriter;
    private ArrayList<String> inputs = new ArrayList<>();
    private ArrayList<String> params = new ArrayList<>();
    private ArrayList<String> assigned = new ArrayList<>();
    private ArrayList<String> assign = new ArrayList<>();
    private ArrayList<String> outputs = new ArrayList<>();
    private ArrayList<String> variables = new ArrayList<>();
    private HashMap<String,String[]> registres = new HashMap<>();
    private int indiceContext = 0;
    private ArrayList<String> knownfunctions = new ArrayList<>();
    private int indice = 0;
    private int indiceRegistres = 0;

    /**
     * Convert code 3 adresses into C and write the result in a .c file
     * @param code3A code 3 adresses to convert into C
     * @param outputDirectory output directory
     * @throws IOException
     */
    code3AtoC(ArrayList<VisitorThreeAdresses.ThreeAdresses> code3A, ArrayList<WhileContext> symbolsTable, String outputDirectory) throws IOException {
        this.code3A = code3A;
        this.symbolsTable = symbolsTable;
        fileWriter = new FileWriter("generated_code/output.c");
        printWriter = new PrintWriter(fileWriter);
    }

    public void startConversion() throws IOException {
        printWriter.println("#include \"while_tree.h\"\n" + //
                            "#include <stddef.h>\n" + //
                            "#include <stdio.h>\n" + //
                            "#include <stdlib.h>\n" + //
                            "#include <stdbool.h>");
        for (int i = 0; i< code3A.size(); i++){
            ThreeAdresses c3A = code3A.get(i);
            //System.out.println(c3A.op);
            switch (c3A.op) {
                case "STORE":
                    if(!code3A.get(i+1).op.equals("READ")){
                        store(c3A);
                    }
                    break;
                case "READ":
                    if(code3A.get(i+1).op.equals("READ")){
                        inputs.add(c3A.var);
                    }
                    else{
                        read(c3A);
                    }
                    break;
                case "ENTER":
                    enter(c3A);
                    break;
                case "PARAM":
                    params.add(c3A.arg1);
                    if(code3A.get(i+1).op.equals("CALL")){
                        
                    }
                    break;
                case "CALL":
                    call(c3A);
                    break;
                case "GOTO_IF_TRUE":
                    goto_if_true(c3A);
                    break;
                case "EQUALS":
                    printWriter.println("Tree "+c3A.var+" = equals("+c3A.arg1+", "+c3A.arg2+");");
                    break;
                case "ASSIGN":
                    assign.add(c3A.var);
                    if(!code3A.get(i+1).op.equals("ASSIGN")){
                        assign();
                    }
                    break;
                case "ASSIGNED":
                    assigned.add(c3A.var);
                    break;
                case "GOTO":
                    gotoOP(c3A);
                    break;
                case "RETURN":
                    returnOP(c3A);
                    if(i==code3A.size()-1||!code3A.get(i+1).op.equals("RETURN")){
                        printWriter.println("}");
                        printWriter.println();
                    }
                    break;
                case "END":
                    printWriter.println("}");
                break;
                default:
                    break;
            }
        }
        printWriter.close();
    }



    private void returnOP(ThreeAdresses c3a) {
    }

    private void gotoOP(ThreeAdresses c3a) {
        //TODO
    }

    private void assign() {

        for(String value : assign){
            if(Character.isUpperCase(value.charAt(0))){
                if(isVariable(assigned.get(0))){
                    printWriter.println("Tree "+assigned.get(0)+" = "+value+";");
                    variables.remove(assigned.get(0));
                    assigned.remove(0);
                    
                }
                else{
                    printWriter.println(assigned.get(0)+" = "+value+";");
                    assigned.remove(0);
                }
            }

            else if(!knownfunctions.contains(value)){
                if(value.equals("nil")) {
                    if(isVariable(assigned.get(0))){
                        printWriter.println("Tree "+assigned.get(0)+" = nil;");
                        variables.remove(assigned.get(0));
                    }
                    else {
                        printWriter.println(assigned.get(0)+" = nil;");
                    }
                }
                else {
                    if(value.equals("nil")) {
                        if(isVariable(assigned.get(0))){
                            printWriter.println("Tree "+assigned.get(0)+" = cons(nil, \""+value+"\", nil);");
                            variables.remove(assigned.get(0));
                        }
                        else {
                            printWriter.println(assigned.get(0)+" = cons(nil, \""+value+"\", nil);");
                        }
                    }
                }
                    
            }
            else{
                switch(value){
                    case "tl":
                        printWriter.println(assigned.get(0)+" = ");
                        break;
                    case "cons":
                        printWriter.println(assigned.get(0)+" = ");
                        break;
                    case "hd":
                        printWriter.println(assigned.get(0)+" = ");
                        break;
                    case "equals":
                        printWriter.println(assigned.get(0)+" = ");
                        break;
                    default :
                        int i = 0;
                        ArrayList<String> outputs_func = new ArrayList<>();
                        while (i < symbolsTable.size()){
                            if(symbolsTable.get(i).getName().equals(value)) {
                                outputs_func = symbolsTable.get(i).getOutputs();
                            }
                            i++;
                        }
                        for(int j=0; j<outputs_func.size(); j++){
                            if(isVariable(assigned.get(0))){
                                printWriter.println("Tree "+assigned.get(0)+" = "+registres.get(value)[j]+";");   
                                variables.remove(assigned.get(0));
                            }
                            else{
                                printWriter.println(assigned.get(0)+" = "+registres.get(value)[j]+";");
                            }
                            assigned.remove(0);
                        }
                    }
                    
                }
            }
                assign.clear();
                assigned.clear();
            
    }

    private boolean isVariable(String variable){
        for(String var:variables){
            if(var.equals(variable)){
                return true;
            }
        }
        return false;
    }

    private void equalsOP(ThreeAdresses c3a) {
        //TODO
    }

    private void goto_if_true(ThreeAdresses c3a) {
        //TODO
    }

    private void call(ThreeAdresses c3a) {
        switch(c3a.var){
            case "tl":
                if(Character.isLowerCase(params.get(0).charAt(0))){
                    printWriter.println("Tree "+c3a.arg1+" = nil;");
                }
                else{
                    printWriter.println("Tree "+c3a.arg1+" = "+params.get(params.size()-1)+"->r;");
                    params.remove(params.size()-1);
                }
            break;
            case "equals":
                printWriter.println("Tree "+c3a.arg1+" = equals("+params.get(params.size()-2)+", "+params.get(params.size()-1)+");");
                params.remove(params.size()-1);
                params.remove(params.size()-1);
                break;
            case "cons":
                String param1 = params.get(params.size()-2);
                String param2l = params.get(params.size()-1);
                if(isVariable(c3a.arg1)||c3a.arg1.startsWith("Reg_")){
                    printWriter.print("Tree "+c3a.arg1+" = ");
                    variables.remove(c3a.arg1);
                }
                else{
                    printWriter.print(c3a.arg1+" = ");
                }
                if(param1.equals("empty")&&param2l.equals("empty")){
                    printWriter.println("nil;");
                }
                else {
                    if(Character.isLowerCase(param2l.charAt(0))&&!param2l.equals("nil")){
                        if(param1.equals("empty")){
                            printWriter.println("cons(nil, \""+param2l+"\", nil);");
                        }
                        else if(Character.isLowerCase(param1.charAt(0))&&!param1.equals("nil")){
                            printWriter.println("cons(cons(nil, \""+param1+",\" nil), nilv, cons(nil, \""+param2l+"\", nil));");
                        }
                        else{
                            printWriter.println("cons("+param1+", nilv, cons(nil, \""+param2l+"\", nil));");
                        }
                    }
                    else{
                        if(param1.equals("empty")){
                            printWriter.println(param2l+";");
                        }
                        else if(Character.isLowerCase(param1.charAt(0))&&!param1.equals("nil")){
                            printWriter.println("cons(cons(nil, \""+param1+"\", nil), nilv, "+param2l+");");
                        }
                        else{
                            printWriter.println("cons("+param1+", nilv, "+param2l+");");
                        }
                    }
                    
                }
                params.remove(params.size()-1);
                params.remove(params.size()-1);
                break;
            
            case "hd":
                if(Character.isLowerCase(params.get(0).charAt(0))){
                    printWriter.println("Tree "+c3a.arg1+" = nil;");
                }
                else{
                    printWriter.println("Tree "+c3a.arg1+" = "+params.get(params.size()-1)+"->l;");
                    params.remove(params.size()-1);
                } 
                break;
            default :
            int i = 0;
            //ArrayList<String> reg = new ArrayList<>();
            int outputs_func = 0;
            int inputs_func = 0;
            while (i < symbolsTable.size()){
                if(symbolsTable.get(i).getName().equals(c3a.var)) {
                    outputs_func = symbolsTable.get(i).getOutputs().size();//on récupère le nombre d'outputs et d'inputs de la fonction appelée
                    inputs_func = symbolsTable.get(i).getParameters().size();
                }
                i++;
            }
            String[] reg = c3a.arg1.split(", ");
            for(int j = 0; j<reg.length; j++){
                printWriter.println("Tree "+reg[j]+";");
            }
            printWriter.print(c3a.var+"_while(");
            if(outputs_func>0){
                printWriter.print(c3a.arg1);//on print tous les registres d'outputs en tant que paramètres
            }
            if(params.size()>0){//on vérifie s'il y a des paramètres
                for(int j = 0; j<inputs_func;j++){
                    int diff = params.size()-(inputs_func-j);
                    printWriter.print(", "+params.get(diff));//on print autant de paramètres qu'il faut, en partant de la fin de la liste.
                    params.remove(diff);
                }
            }
            registres.put(c3a.var, reg);
            printWriter.println(");");
            
        }
        //params.clear();
    }

    private void enter(ThreeAdresses c3a) {
        switch(c3a.var){
            case "FUNCTION":
                int i = 0;
                knownfunctions.add(c3a.arg1);
                ArrayList<String> inputs_func = new ArrayList<>();
                while (i < symbolsTable.size()){
                    if(symbolsTable.get(i).getName().equals(c3a.arg1)) {
                        outputs = symbolsTable.get(i).getOutputs();
                        inputs_func = symbolsTable.get(i).getParameters();
                        variables = symbolsTable.get(i).getVariables();
                        indiceContext = i;
                    }
                    i++;
                }
                int j = 0;
                while(j<variables.size()){
                    if(isOutput(variables.get(j))||isParam(variables.get(j), inputs_func)){
                        variables.remove(variables.get(j));
                        j--;
                    }
                    j++;
                }

                printWriter.print("void "+ c3a.arg1+"_while(");
                if(inputs_func.size()>0){
                    for(int k=0; k<outputs.size(); k++){
                        if(!isParam(outputs.get(k),inputs_func)){
                            printWriter.print("Tree "+outputs.get(k)+", ");
                        }
                    }
                }
                else{
                    for(int k=0; k<outputs.size()-1; k++){
                        if(!isParam(outputs.get(k),inputs_func)){
                            printWriter.print("Tree "+outputs.get(k)+", ");
                        }
                    }
                    printWriter.println("Tree "+outputs.get(outputs.size()-1)+"){");
                }
                
                break;
            case "FOR":
                if(isVariable(c3a.arg1)){
                    printWriter.println("Tree "+c3a.arg1+" = nil;");
                    variables.remove(c3a.arg1);
                }
                printWriter.println("int i"+indice+";");
                printWriter.println("for(i"+indice+"=0; i"+indice+"<intTree("+c3a.arg1+"); i"+indice+"++){");
                indice++;
                break;
            case "FOREACH":
                printWriter.println("int i"+indice+";");             
                printWriter.println("Tree V" +indice+  " = " + c3a.arg1+";");
                printWriter.println("Tree " +c3a.arg2+  " = " + c3a.arg1+";");
                printWriter.println("for(i"+indice+"=0; i"+indice+"<intTree("+c3a.arg1+"); i"+indice+"++){");
                printWriter.println("V" +indice+  " = " + c3a.arg1+"->r;");
                printWriter.println(c3a.arg2+  " = " + c3a.arg1+"->l;");
                indice++;
                break;
            case "WHILE":
                printWriter.println("while(boolTree("+c3a.arg1+")){");
                break;
            case "IF":
                printWriter.println("if(boolTree("+c3a.arg1+")){");
                break;
            case "ELSE":
            printWriter.println("}");
            printWriter.println("else{");
            default:
                break;
        }

    }

    private boolean isParam(String output, ArrayList<String> inputs){
        for(String param:inputs){
            if(param.equals(output)){
                return true;
            }
        }
        return false;
    }
    private boolean isOutput(String variable){
        for(String var:outputs){
            if(var.equals(variable)){
                return true;
            }
        }
        return false;
    }

    private void read(ThreeAdresses c3a) {
        for(String input:inputs){
            printWriter.print("Tree "+input+", ");
        }
        printWriter.println("Tree "+c3a.var+") {");
        inputs.clear();
    }

    /**
     * Store arg1 in register
     * @param c3a
     * @throws IOException
     */
    private void store(ThreeAdresses c3a) throws IOException {
        if(Character.isUpperCase(c3a.arg2.charAt(0))){
            printWriter.println("Tree "+c3a.arg1+" = "+c3a.arg2+";");
        }
    }
}
