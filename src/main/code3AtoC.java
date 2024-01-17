package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import main.VisitorThreeAdresses.ThreeAdresses;

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
    private ArrayList<String> knownvariables = new ArrayList<>();
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
                case "GOTO_IF_NOT_NIL":
                    gotoIfNotNil(c3A);
                    break;
                case "GOTO_IF_NOT_TRUE":
                    gotoIfNotTrue(c3A);
                    break;
                case "RETURN":
                    break;
                case "ENDFUNC":
                    printWriter.println("}");
                    printWriter.println();
                break;
                default:
                    break;
            }
        }
        printWriter.close();
    }



    private void returnOP(ThreeAdresses c3a) {
    }

    private void gotoIfNotNil(ThreeAdresses c3a) {
        printWriter.println("if(equals(nil, "+c3a.arg1+")){");
        printWriter.println("goto "+c3a.var+";");
        printWriter.println("}");
    }

    private void gotoIfNotTrue(ThreeAdresses c3a) {
        printWriter.println("if(!boolTree("+c3a.arg1+")){");
        printWriter.println("goto "+c3a.var+";");
        printWriter.println("}");
    }

    private void assign() {

        for(String value : assign){
            if(Character.isUpperCase(value.charAt(0))){
                if(isVariable(assigned.get(0))){
                    printWriter.println("Tree "+assigned.get(0)+" = "+value+";");
                    knownvariables.add(assigned.get(0));
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
                        knownvariables.add(assigned.get(0));
                    }
                    else {
                        printWriter.println(assigned.get(0)+" = nil;");
                    }
                }
                else {
                    if(value.equals("nil")) {
                        if(isVariable(assigned.get(0))){
                            printWriter.println("Tree "+assigned.get(0)+" = cons(nil, \""+value+"\", nil);");
                            knownvariables.add(assigned.get(0));
                        }
                        else {
                            printWriter.println(assigned.get(0)+" = cons(nil, \""+value+"\", nil);");
                        }
                    }
                }
                    
            }
            else if(value.equals("tl")||value.equals("hd")||value.equals("cons")||value.equals("equals")){
                if(isVariable(assigned.get(0))){
                    printWriter.println("Tree "+assigned.get(0)+" = ");
                    knownvariables.add(assigned.get(0));
                }
                else {
                    printWriter.println(assigned.get(0)+" = ");
                }
            }
                else{
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
                            knownvariables.add(assigned.get(0));
                        }
                        else{
                            printWriter.println(assigned.get(0)+" = "+registres.get(value)[j]+";");
                        }
                        assigned.remove(0);
                    }
                }
                
            
            }
                assign.clear();
                assigned.clear();
            
    }

    private boolean isVariable(String variable){
        for(String var:knownvariables){
            if(var.equals(variable)){
                return false;
            }
        }
        return true;
    }

    private void equalsOP(ThreeAdresses c3a) {
        //TODO
    }

    private void goto_if_true(ThreeAdresses c3a) {
        //TODO
    }

    private void call(ThreeAdresses c3a) {
        boolean isVar = isVariable(c3a.arg1);
        switch(c3a.var){
            case "tl":
                if(Character.isLowerCase(params.get(0).charAt(0))){
                    if(isVar){
                        printWriter.println("Tree "+c3a.arg1+" = nil;");
                        knownvariables.add(c3a.arg1);
                    }
                    else{
                        printWriter.println(c3a.arg1+" = nil;");
                    }
                }
                else{
                    if(isVar){
                        printWriter.println("Tree "+c3a.arg1+" = "+params.get(params.size()-1)+"->r;");
                        knownvariables.add(c3a.arg1);
                    }
                    else{
                        printWriter.println(c3a.arg1+" = "+params.get(params.size()-1)+"->r;");
                    }
                    params.remove(params.size()-1);
                }
            break;
            case "equals":
                if(isVar){
                    printWriter.println("Tree "+c3a.arg1+" = equals("+params.get(params.size()-2)+", "+params.get(params.size()-1)+");");
                    knownvariables.add(c3a.arg1);
                }
                else{
                    printWriter.println(c3a.arg1+" = equals("+params.get(params.size()-2)+", "+params.get(params.size()-1)+");");
                }
                params.remove(params.size()-1);
                params.remove(params.size()-1);
                break;
            case "cons":
                String param1 = params.get(params.size()-2);
                String param2l = params.get(params.size()-1);
                if(isVar||c3a.arg1.startsWith("Reg_")){
                    printWriter.print("Tree "+c3a.arg1+" = ");
                    knownvariables.add(c3a.arg1);
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
                if(isVar){
                    printWriter.println("Tree "+c3a.arg1+" = nil;");
                    knownvariables.add(c3a.arg1);
                }
                else{
                    printWriter.println(c3a.arg1+" = nil;");
                }
            }
            else{
                if(isVar){
                    printWriter.println("Tree "+c3a.arg1+" = "+params.get(params.size()-1)+"->l;");
                    knownvariables.add(c3a.arg1);
                }
                else{
                    printWriter.println(c3a.arg1+" = "+params.get(params.size()-1)+"->l;");
                }
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
                knownvariables.add(reg[j]);
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
        
        if(c3a.var=="FUNCTION"){
                int i = 0;
                knownfunctions.add(c3a.arg1);
                ArrayList<String> inputs_func = new ArrayList<>();
                while (i < symbolsTable.size()){
                    if(symbolsTable.get(i).getName().equals(c3a.arg1)) {
                        outputs = symbolsTable.get(i).getOutputs();
                        inputs_func = symbolsTable.get(i).getParameters();
                        indiceContext = i;
                    }
                    i++;
                }
                int j = 0;
                knownvariables.addAll(outputs);
                knownvariables.addAll(inputs_func);

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
        }
        else {
            printWriter.println(c3a.var+":");
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
