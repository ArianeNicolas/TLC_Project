package compilateur;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import antlrworks.while_astLexer;
import antlrworks.while_astParser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.junit.jupiter.api.BeforeAll;
public class VisitorSymbolsTableTest {

    private static CommonTree treeRoot = null;

    @BeforeAll
    public static void setUp() {
        String src = "function add : read Op1, Op2 % Result := Op1; foreach Op in Op2 do Result := (tl Result) od % write Result";
        src+= "\n";
        src+= """
                function useAdd :
                read Op1, Op2
                %
                for Op1 do
                Result := (add Result (add Result Op2))
                od
                %
                write Result
                """;
        // Parse the file content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Create the parser
        while_astParser parser = new while_astParser(tokens);
        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = null;
        try {
             startProgram = parser.startProgram();
        } catch (Exception e) {}
        

        // The root of the AST
        VisitorSymbolsTableTest.treeRoot = (CommonTree) startProgram.getTree();
       
    }

    @Test 
    public void testNoASTVisit()
    {
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        ArrayList<WhileContext> whileContexts = visitorSymbolsTable.getSymbolsTable();
        visitorSymbolsTable.getSymbolsTable();

        assert(whileContexts.size() == 0);
    }

    @Test
    public void testTreeNull() throws Exception {
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        visitorSymbolsTable.visit(null);
        ArrayList<WhileContext> whileContexts = visitorSymbolsTable.getSymbolsTable();
        assert(whileContexts.size() == 0);
    }

    @Test
    public void testGetSymbolsTableSuccess() throws Exception {
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        visitorSymbolsTable.visit(treeRoot);
        ArrayList<WhileContext> whileContexts = visitorSymbolsTable.getSymbolsTable();

        assert(whileContexts.size() == 2);
    }

    @Test
    public void testTwoTimeSameContext() throws Exception {
        String src = "function add : read Op1, Op2 % Result := Op1; foreach Op in Op2 do Result := (tl Result) od % write Result";
        src += "\n";
        src += "function add : read Op1, Op2 % Result := Op1; foreach Op in Op2 do Result := (tl Result) od % write Result";

        // Parse the file content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Create the parser
        while_astParser parser = new while_astParser(tokens);
        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = null;
        startProgram = parser.startProgram();

        // The root of the AST
        CommonTree invalidTreeRoot = (CommonTree) startProgram.getTree();


        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        try {
            visitorSymbolsTable.visit(invalidTreeRoot);
            fail("Should throw an exception");
        } catch (Exception e) {
           
        }
        ArrayList<WhileContext> whileContexts = visitorSymbolsTable.getSymbolsTable();

        assert(whileContexts.size() == 1);
    }

    
}
