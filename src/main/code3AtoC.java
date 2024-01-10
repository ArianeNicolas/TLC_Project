package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import main.VisitorThreeAdresses.ThreeAdresses;

public class code3AtoC {
    private ArrayList<VisitorThreeAdresses.ThreeAdresses> code3A;
    private String outputDirectory;
    private String output;
    private ArrayList<WhileContext> symbolsTable;
    private FileWriter fileWriter; 
    private PrintWriter printWriter;
    private ArrayList<String> inputs = new ArrayList<>();
    private ArrayList<String> params = new ArrayList<>();
    private ArrayList<String> assigned = new ArrayList<>();
    private ArrayList<String> assign = new ArrayList<>();

    /**
     * Convert code 3 adresses into C and write the result in a .c file
     * @param code3A code 3 adresses to convert into C
     * @param outputDirectory output directory
     * @throws IOException
     */
    code3AtoC(ArrayList<VisitorThreeAdresses.ThreeAdresses> code3A, ArrayList<WhileContext> symbolsTable, String outputDirectory) throws IOException {
        this.code3A = code3A;
        this.outputDirectory = outputDirectory;
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
                        inputs.add(code3A.get(i-1).arg2);
                    }
                    else{
                        read(code3A.get(i-1));
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
                    assign.add(c3A.arg1);
                    if(!code3A.get(i+1).op.equals("ASSIGN")){
                        assign(c3A);
                    }
                    break;
                case "ASSIGNED":
                    assigned.add(c3A.arg1);
                    break;
                case "GOTO":
                    gotoOP(c3A);
                    break;
                case "RETURN":
                    returnOP(c3A);
                    break;
                default:
                    System.err.println("Unknown operation");
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
        printWriter.println("}");
    }

    private void gotoOP(ThreeAdresses c3a) {
        //TODO
    }

    private void assign(ThreeAdresses c3a) {

        printWriter.println("Tree* "+c3a.arg1+" = "+c3a.arg2+";");
    }

    private void equalsOP(ThreeAdresses c3a) {
        //TODO
    }

    private void goto_if_true(ThreeAdresses c3a) {
        //TODO
    }

    private void call(ThreeAdresses c3a) {
        int i = 0;
        int outputs = 0;
        while (i < symbolsTable.size()){
            if(symbolsTable.get(i).getName().equals(c3a.var)) {
                outputs = symbolsTable.get(i).getOutputs().size();
            }
            i++;
        }
        for(int j = 0; j<outputs; j++){
            printWriter.println("Tree* Result"+j+";");
        }
        printWriter.print(c3a.var+"(");
        if(params.size()>0){
            printWriter.print(params.get(0));
            for(int j = 1; j<params.size();j++){
                printWriter.print(", "+params.get(j));
            }
        }
        if(outputs>0){
            printWriter.print("Result0");
            for(int j = 1; j<params.size();j++){
                printWriter.print(", "+"Result"+j);
            }
        }
        printWriter.println(");");
        params.clear();
    }

    private void enter(ThreeAdresses c3a) {
        switch(c3a.var){
            case "FUNCTION":

                printWriter.print("void "+ c3a.arg1+"(");
                break;
            default:
                break;
        }
    }

    private void read(ThreeAdresses c3a) {
        for(String input:inputs){
            printWriter.print("Tree* "+input+", ");
        }
        printWriter.println("Tree* "+c3a.arg2+") {");
    }

    /**
     * Store arg1 in register
     * @param c3a
     * @throws IOException
     */
    private void store(ThreeAdresses c3a) throws IOException {
        //if(Character.isUpperCase(c3a.arg2.charAt(0))){
            printWriter.println("Tree* "+c3a.arg1+" = "+c3a.arg2+";");
        //}
    }
}
