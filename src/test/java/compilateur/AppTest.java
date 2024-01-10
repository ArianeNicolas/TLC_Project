package compilateur;

import static org.junit.jupiter.api.Assertions.fail;

import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.junit.jupiter.api.Test;

import antlrworks.while_astLexer;
import antlrworks.while_astParser;

/**
 * Not really unit testing, but it's a good way to check if the grammar is working
 */

public class AppTest {

    @Test
    public void testInlinedCodeWorkingAST() {
        String src = "function add : read Op1, Op2 % Result := Op1; foreach Op in Op2 do Result := (tl Result) od % write Result;";

        // Parse the function content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        try {
            while_astParser.startProgram_return startProgram = parser.startProgram();
        } catch (RecognitionException e) {
            fail("Error while parsing");
        }

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        assert(nbErrors == 0);
    }

    @Test
    public void testInlinedCodeInvalidAST() {
        String src = "function sub do  Result := (tl Result) od % write Result;";

        // Parse the function content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        try {
            while_astParser.startProgram_return startProgram = parser.startProgram();
        } catch (RecognitionException e) {
            fail("Error while parsing");
        }

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        assert(nbErrors > 0);
    }

    @Test
    public void testAddFunctionWithComments() {
        String src = """
            // Add function
            function add :
            read Op1, Op2
            %
             Result := Op1 ;
            for Op2 do
             Result := ( cons nil Result )
            od
            %
            write Result""";

        // Parse the function content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        try {
            while_astParser.startProgram_return startProgram = parser.startProgram();
        } catch (RecognitionException e) {
            fail("Error while parsing");
        }

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        assert(nbErrors == 0);
    }

    @Test
    public void testTypeCheckingFromFile()
    {
        String arg = "src/test/whileTestFiles/add.while";
        App.files = new String[]{arg};
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.files) {
                src += Files.readString(Path.of(file)) + "\n";
            }
        } catch (Exception e) {
            fail("Error while reading file");
        }

        // Parse the function content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = null;
        try {
            startProgram = parser.startProgram();
        } catch (RecognitionException e) {
            fail("Error while parsing");
        }

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();
        System.out.println("Tree: " + treeRoot.toStringTree());
    
        //construct the symbol table
        System.out.println("===========Constructing symbol table===========");
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while constructing symbol table");
        }
        //check the types
        System.out.println("===========Checking types===========");
        VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
        try {
            visitorTypesChecker.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while checking types");
        }

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();
        assert(nbErrors == 0);

        assert(src.length() > 0);
    }

   @Test
    public void testTypeCheckingFromTwoFile()
    {
        String arg1 = "src/test/whileTestFiles/add.while";
        String arg2 = "src/test/whileTestFiles/use_add.while";
        App.files = new String[]{arg1,arg2};
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.files) {
                src += Files.readString(Path.of(file)) + "\n";
            }
        } catch (Exception e) {
            fail("Error while reading file");
        }

        // Parse the function content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = null;
        try {
            startProgram = parser.startProgram();
        } catch (RecognitionException e) {
            fail("Error while parsing");
        }

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();
        System.out.println("Tree: " + treeRoot.toStringTree());
    
        //construct the symbol table
        System.out.println("===========Constructing symbol table===========");
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while constructing symbol table");
        }
        //check the types
        System.out.println("===========Checking types===========");
        VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
        try {
            visitorTypesChecker.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while checking types");
        }

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();
        assert(nbErrors == 0);

        assert(src.length() > 0);
    }
    
    @Test
    public void testTypeCheckingWithoutFunctionDeclaration()
    {
        String src = """
                function useAdd :
                read Op1, Op2
                %
                for Op1 do
                Result := (add Result (add Result Op2))
                od
                %
                write Result
                """;
                
        // Parse the function content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = null;
        try {
            startProgram = parser.startProgram();
        } catch (RecognitionException e) {
            fail("Error while parsing");
        }

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();
        System.out.println("Tree: " + treeRoot.toStringTree());
    
        //construct the symbol table
        System.out.println("===========Constructing symbol table===========");
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while constructing symbol table");
        }
        //check the types
        System.out.println("===========Checking types===========");
        VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
        boolean failed = false;
        try {
            visitorTypesChecker.visit(treeRoot);
        } catch (Exception e) {
            failed = true;
        }

        assert(src.length() > 0);
        assert(nbErrors == 0);
        assert(failed);
    }

    //todo tester code 3 adresses et traduction en c
    //todo tester pour toutes les fonctions exemples
    
}
