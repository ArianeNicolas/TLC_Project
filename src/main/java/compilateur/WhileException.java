package compilateur;

/**
 * Exception that can be raised when compiling a While program (should print the error line in the while program 
 * and not the line in the compiler)
 */
public class WhileException extends Exception {
    public WhileException(String message) {
        System.err.println("\033[31mWhileException: " + message + "\033[0m");
        System.exit(1);
    }
}
