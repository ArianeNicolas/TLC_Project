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
    private ArrayList<String> variables = new ArrayList<>();
    private HashMap<String,ArrayList<String>> registres = new HashMap<>();
    private int indiceContext = 0;

    /**
     * Convert code 3 adresses into C and write the result in a .c file
     * @param code3A code 3 adresses to convert into C
     * @param outputDirectory output directory
     * @throws IOException
     */
    code3AtoC(ArrayList<VisitorThreeAdresses.ThreeAdresses> code3A, ArrayList<WhileContext> symbolsTable, String outputDirectory) throws IOException {
        this.code3A = code3A;
        this.symbolsTable = symbolsTable;
        fileWriter = new FileWriter("src/output.c");
        printWriter = new PrintWriter(fileWriter);
    }

    public void startConversion() throws IOException {
        printWriter.println("#include <while_tree.h>\n" + //
                            "#include <stddef.h>\n" + //
                            "#include <stdio.h>\n" + //
                            "#include <stdlib.h>\n" + //
                            "#include <stdbool.h>");
        for (int i = 0; i< code3A.size(); i++){
            ThreeAdresses c3A = code3A.get(i);
            System.out.println(c3A.op);
            switch (c3A.op) {
                case "STORE":
                    if(!code3A.get(i+1).op.equals("READ")){
                        store(c3A);
                    }
                    break;
                case "READ":
                    if(code3A.get(i+2).op.equals("READ")){
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
                        call(code3A.get(i+1));
                    }
                    break;
                case "CALL":
                    break;
                case "GOTO_IF_TRUE":
                    goto_if_true(c3A);
                    break;
                case "EQUALS":
                    equalsOP(c3A);
                    break;
                case "ASSIGN":
                System.out.println(c3A.op + " " + c3A.arg1 + " " + c3A.arg2 + " " + c3A.var);
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
                default:
                    //System.err.println("Unknown operation");
                    break;
            }
        }
        printWriter.close();
    }

   /* public static void main(String[] args) throws IOException {
        ArrayList<VisitorThreeAdresses.ThreeAdresses> code3A = new ArrayList<>();
        VisitorThreeAdresses vta = new VisitorThreeAdresses();
        ThreeAdresses la = vta.new ThreeAdresses();
        la.op = "STORE";
        la.arg1 = "R1";
        la.arg2 = "Result";
        ThreeAdresses ta = vta.new ThreeAdresses();
        ta.op = "PARAM";
        ta.arg1 = "Op1";
        ThreeAdresses va = vta.new ThreeAdresses();
        va.op = "PARAM";
        va.arg1 = "R1";
        ThreeAdresses fa = vta.new ThreeAdresses();
        fa.op = "CALL";
        fa.arg1 = "R2";
        fa.var = "mirror";
        code3A.add(la);
        code3A.add(ta);
        code3A.add(va);
        code3A.add(fa);
        code3AtoC ctoc = new code3AtoC(code3A, null, null);
        ctoc.startConversion();
    }*/


    private void returnOP(ThreeAdresses c3a) {
    }

    private void gotoOP(ThreeAdresses c3a) {
        //TODO
    }

    private void assign() {

        for(String value : assign){
            System.out.println(value);
            if(Character.isUpperCase(value.charAt(0))){
                if(isVariable(assigned.get(0))){
                    System.out.println("variable = "+ assigned.get(0));
                    printWriter.println("Tree "+assigned.get(0)+" = "+value+";");
                    variables.remove(assigned.get(0));
                    assigned.remove(0);
                    
                }
                else{
                    printWriter.println(assigned.get(0)+" = "+value+";");
                    assigned.remove(0);
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
                        printWriter.println("Tree "+assigned.get(0)+" = "+registres.get(value).get(j)+";");   
                    }
                    else{
                        printWriter.println(assigned.get(0)+" = "+registres.get(value).get(j)+";");
                    }
                    assigned.remove(0);
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
        int i = 0;
        ArrayList<String> reg = new ArrayList<>();
        ArrayList<String> outputs_func = new ArrayList<>();
        while (i < symbolsTable.size()){
            if(symbolsTable.get(i).getName().equals(c3a.var)) {
                outputs_func = symbolsTable.get(i).getOutputs();
            }
            i++;
        }
        System.out.println(c3a.var +" a "+outputs_func.size()+" outputs");
        for(int j = 0; j<outputs_func.size(); j++){
            printWriter.println("Tree Reg_"+j+";");
        }
        printWriter.print(c3a.var+"(");
        if(outputs_func.size()>0){
            printWriter.print("Reg_"+0);
            reg.add("Reg_"+0);
            for(int j = 1; j<outputs_func.size();j++){
                printWriter.print(", Reg_"+j);
                reg.add("Reg_"+j);
            }
        }
        if(params.size()>0){
            if(outputs_func.size()>0){
                printWriter.print(", "+params.get(0));
            }
            else {
                printWriter.print(params.get(0));
            }
            for(int j = 1; j<params.size();j++){
                printWriter.print(", "+params.get(j));
            }
        }
        registres.put(c3a.var, reg);
        printWriter.println(");");
        params.clear();
    }

    private void enter(ThreeAdresses c3a) {
        switch(c3a.var){
            case "FUNCTION":
                
                int i = 0;
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

                System.out.println(c3a.arg1 +" a "+outputs.size()+" outputs");
                printWriter.print("void "+ c3a.arg1+"(");
                for(int k=0; k<outputs.size(); k++){
                    if(!isParam(outputs.get(k),inputs_func)){
                        System.out.println(outputs.get(k));
                        printWriter.print("Tree "+outputs.get(k)+", ");
                    }
                }
                
                break;
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
        //if(Character.isUpperCase(c3a.arg2.charAt(0))){
            //printWriter.println("Tree "+c3a.arg1+" = "+c3a.arg2+";");
        //}
    }
}
