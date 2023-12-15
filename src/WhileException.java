public class WhileException extends Exception {
    public WhileException(String message, int line) {
        System.out.println("\033[31mWhileException: " + message + " at line " + line + "\033[0m");
        System.exit(1);
    }
}
