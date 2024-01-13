package compilateur;

import static org.junit.jupiter.api.Assertions.fail;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.github.stefanbirkner.systemlambda.SystemLambda;

import antlrworks.while_astLexer;
import antlrworks.while_astParser;


/**
 * Not really unit testing, but it's a good way to check if the grammar is working
 * This program test :
 * - (1) The the compiler
 * - (2) The implementation of the while language
 */

public class AppTest {

    @BeforeEach
    public void setUp() {
        //hard reset, if not surfire doesn't work, even with App.files = new ArrayList<String>();
        App.inputFiles = null;
    }

    /**************************************************************************/
    /*                      (1) TESTING THE COMPILER                          */
    /**************************************************************************/

    /**
     * test a program in one line (can't go further than the symbol table without using files)
     */
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

    /**
     * test an invalid program in one line (can't go further than the symbol table without using files)
     */
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

    /**
     * test a program on several lines with comments (can't go further than the symbol table without using files)
     */
    @Test
    public void testFunctionWithComments() {
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


    
    /**
     * test a program from a file until type checking
     */
    @Test
    public void testTypeCheckingFromFile()
    {
        String arg = "src/test/whileTestFiles/add.while";
        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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
    
        //construct the symbol table
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while constructing symbol table");
        }
        //check the types
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

    /**
     * test a program from two files until type checking
     */
   @Test
    public void testTypeCheckingFromTwoFile()
    {
        String arg1 = "src/test/whileTestFiles/add.while";
        String arg2 = "src/test/whileTestFiles/use_add.while";
        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg1);
        App.inputFiles.add(arg2);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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
    
        //construct the symbol table
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while constructing symbol table");
        }
        //check the types
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


    /**************************************************************************/
    /*      (2) TESTING THE IMPLEMENTATION OF THE WHILE LANGUAGE              */
    /**************************************************************************/
    
    /**
     * test a program lacking a function declaration, until type checking
     * @throws Exception
     */
    @Test
    public void testTypeCheckingWithoutFunctionDeclaration() throws Exception
    {
 
        String arg = "src/test/whileTestFiles/use_add.while";

        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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
   
       //construct the symbol table
       VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
       try {
           visitorSymbolsTable.visit(treeRoot);
       } catch (Exception e) {
           fail("Error while constructing symbol table");
       }
       //check the types
       VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
       SystemLambda.catchSystemExit(() -> {
           visitorTypesChecker.visit(treeRoot);
       });
    }

    //todo tester code 3 adresses et traduction en c
    //todo tester pour toutes les fonctions exemples


    /**
     * Test the add function
     */
    @Test
    public void testWhileAdd()
    {
        String arg = "src/test/whileTestFiles/add.while";
        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();
    
        //construct the symbol table
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while constructing symbol table");
        }
        ArrayList<WhileContext> symbolTable = visitorSymbolsTable.getSymbolsTable();

        //check the types
        VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
        try {
            visitorTypesChecker.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while checking types");
        }

        //Testing the AST
        assert(nbErrors == 0);
        
        //Testing the symbol table
        assert(symbolTable.size() == 1);
        assert(symbolTable.get(0).getName().equals("add"));
        assert(symbolTable.get(0).getParameters().size() == 2);
        assert(symbolTable.get(0).getParameters().get(0).equals("Op1"));
        assert(symbolTable.get(0).getParameters().get(1).equals("Op2"));
        assert(symbolTable.get(0).getVariables().size() == 2);
        assert(symbolTable.get(0).getVariables().get(0).equals("Result"));
        assert(symbolTable.get(0).getVariables().get(1).equals("Result"));
        assert(symbolTable.get(0).getOutputs().size() == 1);
        assert(symbolTable.get(0).getOutputs().get(0).equals("Result"));
        
        //Testing the types
        //nothing to test here, the visitorTypesChecker throws an exception if there is a type error

        //Testing 3 Adresses code
        //TODO


        //Testing c code
        //TODO
    }


    /**
     * Test a comparison 
     */
    @Test
    public void testWhilCompare()
    {
        String arg = "src/test/whileTestFiles/compare.while";
        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();
    
        //construct the symbol table
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while constructing symbol table");
        }
        ArrayList<WhileContext> symbolTable = visitorSymbolsTable.getSymbolsTable();

        //check the types
        VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
        try {
            visitorTypesChecker.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while checking types");
        }

        //Testing the AST
        assert(nbErrors == 0);
        
        //Testing the symbol table
        assert(symbolTable.size() == 1);
        assert(symbolTable.get(0).getName().equals("compare"));
        assert(symbolTable.get(0).getParameters().size() == 2);
        assert(symbolTable.get(0).getParameters().get(0).equals("Op1"));
        assert(symbolTable.get(0).getParameters().get(1).equals("Op2"));
        assert(symbolTable.get(0).getVariables().size() == 1);
        assert(symbolTable.get(0).getVariables().get(0).equals("Result"));
        assert(symbolTable.get(0).getOutputs().size() == 1);
        assert(symbolTable.get(0).getOutputs().get(0).equals("Result"));
        
        //Testing the types
        //nothing to test here, the visitorTypesChecker throws an exception if there is a type error

        //Testing 3 Adresses code
        //TODO


        //Testing c code
        //TODO
    }

    /**
     * Test a function with a if statement
     */
    @Test
    public void testWhileOneIf()
    {
        String arg = "src/test/whileTestFiles/oneIf.while";
        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();
    
        //construct the symbol table
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while constructing symbol table");
        }
        ArrayList<WhileContext> symbolTable = visitorSymbolsTable.getSymbolsTable();

        //check the types
        VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
        try {
            visitorTypesChecker.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while checking types");
        }

        //Testing the AST
        assert(nbErrors == 0);
        
        //Testing the symbol table
        assert(symbolTable.size() == 1);
        assert(symbolTable.get(0).getName().equals("oneIf"));
        assert(symbolTable.get(0).getParameters().size() == 2);
        assert(symbolTable.get(0).getParameters().get(0).equals("Op1"));
        assert(symbolTable.get(0).getParameters().get(1).equals("Op2"));
        assert(symbolTable.get(0).getVariables().size() == 2);
        assert(symbolTable.get(0).getVariables().get(0).equals("Result"));
        assert(symbolTable.get(0).getVariables().get(1).equals("Result"));
        assert(symbolTable.get(0).getOutputs().size() == 1);
        assert(symbolTable.get(0).getOutputs().get(0).equals("Result"));
        
        //Testing the types
        //nothing to test here, the visitorTypesChecker throws an exception if there is a type error

        //Testing 3 Adresses code
        //TODO


        //Testing c code
        //TODO
    }


     /**
     * Test a function with a if statement
     */
    @Test
    public void testWhileOneWhile()
    {
        String arg = "src/test/whileTestFiles/oneWhile.while";
        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();
    
        //construct the symbol table
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while constructing symbol table");
        }
        ArrayList<WhileContext> symbolTable = visitorSymbolsTable.getSymbolsTable();

        //check the types
        VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
        try {
            visitorTypesChecker.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while checking types");
        }

        //Testing the AST
        assert(nbErrors == 0);
        
        //Testing the symbol table
        assert(symbolTable.size() == 1);
        assert(symbolTable.get(0).getName().equals("oneWhile"));
        assert(symbolTable.get(0).getParameters().size() == 2);
        assert(symbolTable.get(0).getParameters().get(0).equals("Op1"));
        assert(symbolTable.get(0).getParameters().get(1).equals("Op2"));
        assert(symbolTable.get(0).getVariables().size() == 1);
        assert(symbolTable.get(0).getVariables().get(0).equals("Result"));
        assert(symbolTable.get(0).getOutputs().size() == 1);
        assert(symbolTable.get(0).getOutputs().get(0).equals("Result"));
        
        //Testing the types
        //nothing to test here, the visitorTypesChecker throws an exception if there is a type error

        //Testing 3 Adresses code
        //TODO


        //Testing c code
        //TODO
    }


    /**
     * Test a function with a if statement
     */
    @Test
    public void testWhileOneForeach()
    {
        String arg = "src/test/whileTestFiles/oneForeach.while";
        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();
    
        //construct the symbol table
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while constructing symbol table");
        }
        ArrayList<WhileContext> symbolTable = visitorSymbolsTable.getSymbolsTable();

        //check the types
        VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
        try {
            visitorTypesChecker.visit(treeRoot);
        } catch (Exception e) {
            fail("Error while checking types");
        }

        //Testing the AST
        assert(nbErrors == 0);
        
        //Testing the symbol table
        assert(symbolTable.size() == 1);
        assert(symbolTable.get(0).getName().equals("oneForeach"));
        assert(symbolTable.get(0).getParameters().size() == 2);
        assert(symbolTable.get(0).getParameters().get(0).equals("Op1"));
        assert(symbolTable.get(0).getParameters().get(1).equals("Op2"));
        assert(symbolTable.get(0).getVariables().size() == 1);
        assert(symbolTable.get(0).getVariables().get(0).equals("Result"));
        assert(symbolTable.get(0).getOutputs().size() == 1);
        assert(symbolTable.get(0).getOutputs().get(0).equals("Result"));
        
        //Testing the types
        //nothing to test here, the visitorTypesChecker throws an exception if there is a type error

        //Testing 3 Adresses code
        //TODO


        //Testing c code
        //TODO
    }


    /**
     * Commands correctly separated by ;
     */
    @Test
    public void testCommandsCorrectlySeparated()
    {
        String arg = "src/test/whileTestFiles/commandsCorrectlySeparated.while";
        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();

        //Testing the AST
        assert(nbErrors == 0);
    }


    /**
     * Commands without ; between them
     */
    @Test
    public void testCommandsWronglySeparated()
    {
        String arg = "src/test/whileTestFiles/commandsWronglySeparated.while";
        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();

        //Testing the AST
        assert(nbErrors > 0);
    }


    /**
     * Last command should not be followed by ;
     */
    @Test
    public void testCommandsUselessSemiColon()
    {
        String arg = "src/test/whileTestFiles/uselessCommandSeparator.while";
        App.inputFiles = new ArrayList<String>();
        App.inputFiles.add(arg);
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : App.inputFiles) {
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

        // count the number of errors
        int nbErrors = parser.getNumberOfSyntaxErrors();

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();

        //Testing the AST
        assert(nbErrors > 0);
    }





    //todo test :
    //les espaces
    //les tabulations
    //for 
    //while
    //foreach
    //test if and for in one function
    //test cons
    //test tl
    //test nil
    //test function call
    //test les commentaires, partout

    //test les fonctions exemples
    
}
