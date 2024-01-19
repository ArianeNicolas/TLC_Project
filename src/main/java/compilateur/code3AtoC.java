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
    private PrintWriter printWriter_h;
    private ArrayList<String> inputs = new ArrayList<>();
    private ArrayList<String> params = new ArrayList<>();
    private ArrayList<String> assigned = new ArrayList<>();
    private ArrayList<String> assign = new ArrayList<>();
    private ArrayList<String> outputs = new ArrayList<>();
    private ArrayList<String> knownvariables = new ArrayList<>();
    private HashMap<String,String[]> registres = new HashMap<>();
    private ArrayList<String> knownfunctions = new ArrayList<>();
    private ArrayList<String> inputs_main_while = new ArrayList<>();
    
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
            switch (c3A.op) {
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
                    params.add(c3A.arg);
                    break;
                case "CALL":
                    call(c3A);
                    break;
                case "GOTO":
                    gotoOp(c3A);
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
                case "GOTO_IF_NIL":
                    gotoIfNil(c3A);
                    break;
                case "GOTO_IF_TRUE":
                    gotoIfTrue(c3A);
                    break;
                case "ENDFUNC":
                    printWriter.println("}");
                    printWriter.println();
                break;
                default:
                    break;
            }
        }

        endProgram();
    }

    //différents goto
    private void gotoIfNotNil(ThreeAdresses c3a) {
        printWriter.println("if(!equals(nil, "+c3a.arg+")){");
        printWriter.println("goto "+c3a.var+";");
        printWriter.println("}");
    }

    private void gotoIfNil(ThreeAdresses c3a) {
        printWriter.println("if(equals(nil, "+c3a.arg+")){");
        printWriter.println("goto "+c3a.var+";");
        printWriter.println("}");
    }

    private void gotoIfNotTrue(ThreeAdresses c3a) {
        printWriter.println("if(!boolTree("+c3a.arg+")){");
        printWriter.println("goto "+c3a.var+";");
        printWriter.println("}");
    }

    private void gotoIfTrue(ThreeAdresses c3a) {
        printWriter.println("if(boolTree("+c3a.arg+")){");
        printWriter.println("goto "+c3a.var+";");
        printWriter.println("}");
    }

    private void gotoOp(ThreeAdresses c3a) {
        printWriter.println("goto "+c3a.var+";");
    }


    //création de la fonction main qui appelle le parsing d'arguments et le pp()
    private void endProgram(){
        printWriter.println("int main(int argc, char *argv[]) {");
        printWriter_h.println("int main(int argc, char *argv[]);");
        String[] regs = registres.get("main_while");
        printWriter.println("Tree t[argc];\n" + //
                "for (int i = 1; i < argc; i++)\n" + //
                "{\n" + //
                "    t[i-1] = parsArgs(argv[i]);\n" + //
                "}");
                
        for(String reg:regs){
            printWriter.println("Tree "+reg+";");
        }

        int i = 0;
            int inputs_func = 0;
            while (i < symbolsTable.size()){
                if(symbolsTable.get(i).getName().equals("main")) {
                    //on récupère le nombre d'inputs de la fonction main
                    inputs_func = symbolsTable.get(i).getParameters().size();
                }
                i++;
            }
        
        printWriter.print("main_while(");
        for(int j = 0; j<regs.length-1; j++){
            printWriter.print("&"+regs[j]+", ");//on print tous les registres d'outputs en tant que paramètres
        }
        printWriter.print("&"+regs[regs.length-1]);
        for(int j = 0; j<inputs_func;j++){
            printWriter.print(", t["+j+"]");
        }
        
        printWriter.println(");");
        for(String reg:regs){
            printWriter.println("pp("+reg+");");
        }
        printWriter.println("return 0;\n}");
        printWriter.close();
        printWriter_h.close();
    }


    /**
     * Définition de variables
     */
    private void assign() {
        for(String value : assign){
            if(Character.isUpperCase(value.charAt(0))){
                    printWriter.println(type(assigned.get(0))+" = "+value+";");
                    assigned.remove(0);
            }/*
            else if(!knownfunctions.contains(value)){
                if(value.equals("nil")) {
                    printWriter.println(type(assigned.get(0))+" = nil;");    
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
                }*/
            }
                assign.clear();
                assigned.clear();
            
    }

    /**
     * 
     * @param variable la variable à mettre de la bonne forme
     * @return Un string contenant la bonne forme de la variable en fonction de si elle est déjà connue, si c'est pointeur...
     */
    private String type (String variable){
        if(!knownvariables.contains(variable)&&!variable.equals("nil")){
            knownvariables.add(variable);
            return ("Tree "+variable);
        } 
        else if(outputs.contains(variable)) return ("*"+variable);
        else return variable;
    }


    /**
     * Traduit un appel de fonction
     * @param c3a code trois adresses du CALL
     */
    private void call(ThreeAdresses c3a) {
        switch(c3a.var){
            case "tl":
                if(Character.isLowerCase(params.get(0).charAt(0))){
                    printWriter.println(type(c3a.arg)+" = nil;");
                }
                else{
                    if(outputs.contains(params.get(params.size()-1))){
                        printWriter.println(type(c3a.arg)+" = (*"+params.get(params.size()-1)+")->r;");
                    }
                    else printWriter.println(type(c3a.arg)+" = "+params.get(params.size()-1)+"->r;");
                    params.remove(params.size()-1);
                }
            break;
            case "equals":
                printWriter.println(type(c3a.arg)+" = equals("+type(params.get(params.size()-2))+", "+type(params.get(params.size()-1))+");");
                params.remove(params.size()-1);
                params.remove(params.size()-1);
                break;
            case "cons":
                String param1 = params.get(params.size()-2);
                String param2l = params.get(params.size()-1);
                printWriter.print(type(c3a.arg)+" = ");
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
                        printWriter.println(type(c3a.arg)+" = nil;");
                }
                else{
                    if(outputs.contains(params.get(params.size()-1))){
                        printWriter.println(type(c3a.arg)+" = (*"+params.get(params.size()-1)+")->l;");
                    }
                    else printWriter.println(type(c3a.arg)+" = "+params.get(params.size()-1)+"->l;");
                    params.remove(params.size()-1);
                } 
                break;
            default :
            int i = 0;
            int inputs_func = 0;
            while (i < symbolsTable.size()){
                if(symbolsTable.get(i).getName().equals(c3a.var)) {
                    //on récupère le nombre d'inputs de la fonction appelée
                    inputs_func = symbolsTable.get(i).getParameters().size();
                }
                i++;
            }
            String[] reg = c3a.arg.split(", ");
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
    }

    /**
     * 
     * @param c3a code 3 adresses du ENTER
     */
    private void enter(ThreeAdresses c3a) {
        
        if(c3a.var=="FUNCTION"){
                int i = 0;
                knownfunctions.add(c3a.arg);
                ArrayList<String> inputs_func = new ArrayList<>();
                while (i < symbolsTable.size()){
                    if(symbolsTable.get(i).getName().equals(c3a.arg)) {
                        outputs =  new ArrayList<>(symbolsTable.get(i).getOutputs());
                        inputs_func = new ArrayList<>(symbolsTable.get(i).getParameters());
                    }
                    i++;
                }
                knownvariables.addAll(outputs);
                knownvariables.addAll(inputs_func);

                if(c3a.arg.equals("main")){
                    inputs_main_while = inputs_func;
                }

                printWriter.print("void "+ c3a.arg+"_while(");
                printWriter_h.print("void "+ c3a.arg+"_while(");
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

}
