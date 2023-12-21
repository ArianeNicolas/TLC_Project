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
    public void testInlinedWorkingExample() throws RecognitionException {
        String src = "function sub : read Op1, Op2 % Result := Op1; foreach Op in Op2 do  Result := (tl Result) od % write Result;";

        // Parse the file content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = parser.startProgram();

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        assert(nbErrors == 0);
    }

    @Test
    public void testInlinedInvalidExample() throws RecognitionException {
        String src = "function sub do  Result := (tl Result) od % write Result;";

        // Parse the file content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = parser.startProgram();

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        assert(nbErrors > 0);
    }

    @Test
    public void testAddFunction() throws RecognitionException {
        String src = "AAAAAAAA";
        // Read the file // todo put it in src
        try {
            Path path = Path.of("while_exemples/add.while"); 
            src = Files.readString(path); 
        } catch (Exception e) {
            System.out.println("Error while reading file");
        }

        // Parse the file content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = parser.startProgram();

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        assert(nbErrors == 0);
    }
    
}
