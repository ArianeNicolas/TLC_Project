package compilateur;

import java.util.ArrayList;

import compilateur.VisitorThreeAdresses.ThreeAdresses;


public class code3AtoC {
    private ArrayList<VisitorThreeAdresses.ThreeAdresses> code3A;
    private String outputDirectory;
    private ArrayList<WhileContext> symbolsTable;

    /**
     * Convert code 3 adresses into C and write the result in a .c file
     * @param code3A code 3 adresses to convert into C
     * @param outputDirectory output directory
     */
    code3AtoC(ArrayList<VisitorThreeAdresses.ThreeAdresses> code3A, ArrayList<WhileContext> symbolsTable, String outputDirectory) {
        this.code3A = code3A;
        this.outputDirectory = outputDirectory;
        this.symbolsTable = symbolsTable;
    }

    public void startConversion() {
        for (ThreeAdresses c3A : code3A) {
            switch (c3A.op) {
                case "STORE":
                    store(c3A);
                    break;
                case "READ":
                    read(c3A);
                    break;
                case "ENTER":
                    enter(c3A);
                    break;
                case "PARAM":
                    param(c3A);
                    break;
                case "CALL":
                    call(c3A);
                    break;
                case "GOTO_IF_TRUE":
                    goto_if_true(c3A);
                    break;
                case "EQUALS":
                    equalsOP(c3A);
                    break;
                case "ASSIGN":
                    asign(c3A);
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
    }


    private void returnOP(ThreeAdresses c3a) {
        //TODO
    }

    private void gotoOP(ThreeAdresses c3a) {
        //TODO
    }

    private void asign(ThreeAdresses c3a) {
        //TODO
    }

    private void equalsOP(ThreeAdresses c3a) {
        //TODO
    }

    private void goto_if_true(ThreeAdresses c3a) {
        //TODO
    }

    private void call(ThreeAdresses c3a) {
        //TODO
    }

    private void param(ThreeAdresses c3a) {
        //TODO
    }

    private void enter(ThreeAdresses c3a) {
        //TODO
    }

    private void read(ThreeAdresses c3a) {
        //TODO
    }

    /**
     * Store arg1 in register
     * @param c3a
     */
    private void store(ThreeAdresses c3a) {
        //TODO
    }
}
