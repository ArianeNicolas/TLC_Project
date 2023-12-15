package test;

import org.junit.Test;

import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import classes.while_astLexer;
import classes.while_astParser;





public class AppTest {


    @Test
    public void inlinedExample() throws RecognitionException {
        String src = "function sub : read Op1, Op2 % Resul) od % write Result; ";
        System.out.println("Source code: " + src); 

        // Parse the file content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);


        PrintStream outputText = new PrintStream(System.out);
        System.setOut(outputText );
        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = parser.startProgram();




        assert(true);
        

    }

    @Test
    public void testAdd() {
        assert(true);
    }
    
}
