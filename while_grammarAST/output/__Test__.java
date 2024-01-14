import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import antlrworks.while_astLexer;
import antlrworks.while_astParser;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        while_astLexer lex = new while_astLexer(new ANTLRFileStream("C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        while_astParser g = new while_astParser(tokens, 49100, null);
        try {
            g.startProgram();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}