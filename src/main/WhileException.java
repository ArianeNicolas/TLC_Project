package main;
public class WhileException extends Exception {
    public WhileException(String message) {
        System.out.println("\033[31mWhileException: " + message + "\033[0m");
        System.exit(1);
    }
}
