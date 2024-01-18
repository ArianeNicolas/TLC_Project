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
    private FileWriter fileWriter_h; 
    private PrintWriter printWriter_h;
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
    
    public final static String OUTPUT_FILE = "generated_code/output.c";

    /**
     * Convert code 3 adresses into C and write the result in a .c file
     * @param code3A code 3 adresses to convert into C
     * @param outputDirectory output directory
     * @throws IOException
     */
    code3AtoC(ArrayList<VisitorThreeAdresses.ThreeAdresses> code3A, ArrayList<WhileContext> symbolsTable, String outputDirectory) throws IOException {
        this.code3A = code3A;
        this.symbolsTable = symbolsTable;
        fileWriter = new FileWriter(OUTPUT_FILE);
        printWriter = new PrintWriter(fileWriter);
        System.out.println("initialisation du .h");
        printWriter_h = new PrintWriter(new FileWriter("generated_code/output.h"));
    }

    public void startConversion() throws IOException {
        printWriter.println("#include \"while_tree.h\"\n" + //
                            "#include \"output.h\"\n" + //
                            "#include <stddef.h>\n" + //
                            "#include <stdio.h>\n" + //
                            "#include <stdlib.h>\n");
        printWriter_h.println("#include <stdlib.h>\n");
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
                    break;
                case "CALL":
                    call(c3A);
                    break;
                case "GOTO":
                    gotoOp(c3A);
                    break;
                case "EQUALS":
                    printWriter.println("Tree* "+c3A.var+" = equals("+c3A.arg1+", "+c3A.arg2+");");
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
        printWriter_h.close();
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
                    printWriter.println(type(assigned.get(0))+" = "+value+";");
                    assigned.remove(0);
            }
            else if(!knownfunctions.contains(value)){
                if(value.equals("nil")) {
                    printWriter.println(type(assigned.get(0))+" = nil;");    
                }
                else {
                    if(value.equals("nil")) {
                        printWriter.println(type(assigned.get(0))+" = cons(nil, \""+value+"\", nil);");       
                    }
                }
                    
            }
            else if(value.equals("tl")||value.equals("hd")||value.equals("cons")||value.equals("equals")){
                printWriter.println(type(assigned.get(0))+" = ");
            }
                else{
                    int i = 0;
                    ArrayList<String> outputs_func = new ArrayList<>();
                    while (i < symbolsTable.size()){
                        if(symbolsTable.get(i).getName().equals(value)) {
                            outputs_func = new ArrayList<>(symbolsTable.get(i).getOutputs());
                        }
                        i++;
                    }
                    for(int j=0; j<outputs_func.size(); j++){
                        printWriter.println(type(assigned.get(0))+" = "+registres.get(value)[j]+";");
                        assigned.remove(0);
                    }
                }
                
            
            }
                assign.clear();
                assigned.clear();
            
    }

    private String type (String variable){
        if(!knownvariables.contains(variable)&&!variable.equals("nil")){
            knownvariables.add(variable);
            return ("Tree "+variable);
        } 
        else if(outputs.contains(variable)) return ("*"+variable);
        else return variable;
    }


    private void gotoOp(ThreeAdresses c3a) {
        printWriter.println("goto "+c3a.var+";");
    }

    private void call(ThreeAdresses c3a) {
        switch(c3a.var){
            case "tl":
                if(Character.isLowerCase(params.get(0).charAt(0))){
                    printWriter.println(type(c3a.arg1)+" = nil;");
                }
                else{
                    if(outputs.contains(params.get(params.size()-1))){
                        printWriter.println(type(c3a.arg1)+" = (*"+params.get(params.size()-1)+")->r;");
                    }
                    else printWriter.println(type(c3a.arg1)+" = "+params.get(params.size()-1)+"->r;");
                    params.remove(params.size()-1);
                }
            break;
            case "equals":
                printWriter.println(type(c3a.arg1)+" = equals("+type(params.get(params.size()-2))+", "+type(params.get(params.size()-1))+");");
                params.remove(params.size()-1);
                params.remove(params.size()-1);
                break;
            case "cons":
                String param1 = params.get(params.size()-2);
                String param2l = params.get(params.size()-1);
                printWriter.print(type(c3a.arg1)+" = ");
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
                            printWriter.println("cons("+type(param1)+", nilv, cons(nil, \""+param2l+"\", nil));");
                        }
                    }
                    else{
                        if(param1.equals("empty")){
                            printWriter.println(type(param2l)+";");
                        }
                        else if(Character.isLowerCase(param1.charAt(0))&&!param1.equals("nil")){
                            printWriter.println("cons(cons(nil, \""+param1+"\", nil), nilv, "+type(param2l)+");");
                        }
                        else{
                            printWriter.println("cons("+type(param1)+", nilv, "+type(param2l)+");");
                        }
                    }
                    
                }
                params.remove(params.size()-1);
                params.remove(params.size()-1);
                break;
            
            case "hd":
                if(Character.isLowerCase(params.get(0).charAt(0))){
                        printWriter.println(type(c3a.arg1)+" = nil;");
                }
                else{
                    if(outputs.contains(params.get(params.size()-1))){
                        printWriter.println(type(c3a.arg1)+" = (*"+params.get(params.size()-1)+")->l;");
                    }
                    else printWriter.println(type(c3a.arg1)+" = "+params.get(params.size()-1)+"->l;");
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
            for(int j = 0; j<reg.length-1; j++){
                printWriter.print("&"+reg[j]+", ");//on print tous les registres d'outputs en tant que paramètres
            }
            printWriter.print("&"+reg[reg.length-1]);
                
            
            if(params.size()>0){//on vérifie s'il y a des paramètres
                for(int j = 0; j<inputs_func;j++){
                    int diff = params.size()-(inputs_func-j);
                    printWriter.print(", "+type(params.get(diff)));//on print autant de paramètres qu'il faut, en partant de la fin de la liste.
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
                        outputs =  new ArrayList<>(symbolsTable.get(i).getOutputs());
                        inputs_func = new ArrayList<>(symbolsTable.get(i).getParameters());
                        indiceContext = i;
                    }
                    i++;
                }
                int j = 0;
                knownvariables.addAll(outputs);
                knownvariables.addAll(inputs_func);

                printWriter.print("void "+ c3a.arg1+"_while(");
                System.out.println("Ecriture dans le .h");
                printWriter_h.print("void "+ c3a.arg1+"_while(");
                if(inputs_func.size()>0){
                    for(int k=0; k<outputs.size(); k++){
                        if(!isParam(outputs.get(k),inputs_func)){
                            printWriter.print("Tree* "+outputs.get(k)+", ");
                            printWriter_h.print("Tree* "+outputs.get(k)+", ");
                        }
                    }
                }
                else{
                    for(int k=0; k<outputs.size()-1; k++){
                        if(!isParam(outputs.get(k),inputs_func)){
                            printWriter.print("Tree* "+outputs.get(k)+", ");
                            printWriter_h.print("Tree* "+outputs.get(k)+", ");
                        }
                    }
                    printWriter.println("Tree* "+outputs.get(outputs.size()-1)+"){");
                    printWriter_h.println("Tree* "+outputs.get(outputs.size()-1)+");");
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
            printWriter_h.print("Tree "+input+", ");
        }
        printWriter.println("Tree "+c3a.var+"){");
        printWriter_h.println("Tree "+c3a.var+");");
        inputs.clear();
    }

    /**
     * Store arg1 in register
     * @param c3a
     * @throws IOException
     */
    private void store(ThreeAdresses c3a) throws IOException {
        if(Character.isUpperCase(c3a.arg2.charAt(0))){
            printWriter.println("Tree* "+c3a.arg1+" = "+c3a.arg2+";");
        }
    }
}
