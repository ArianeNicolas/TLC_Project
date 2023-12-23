package main;
public class WhileException extends Exception {
    public WhileException(String message, Integer line) {
        if(line != null) {
            System.out.println("\033[31mWhileException: " + message + " at line " + line + "\033[0m");
        } else {
            System.out.println("\033[31mWhileException: " + message + "\033[0m");
        }
        System.exit(1);
    }
}
