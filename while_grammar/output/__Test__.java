import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        whileLexer lex = new whileLexer(new ANTLRFileStream("C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        whileParser g = new whileParser(tokens, 49100, null);
        try {
            g.startProgram();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}