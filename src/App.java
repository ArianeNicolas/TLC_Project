import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

public class App {
    public static void main(String[] args) throws Exception {

        // Check if a file name is provided as argument
        if(args == null || args.length != 1) {
            System.out.println("Please provide a file name as argument");
            //System.exit(1); 
        }

        // Read the file // todo put it in src
        try {
            Path path = Path.of(args[0]);
            String src = Files.readString(path);
            System.out.println(src);
        } catch (Exception e) {
            System.out.println("Error while reading file");
            //System.exit(1);
        }

        // temp test
        String src = "function sub : read Op1, Op2 % Result := Op1; foreach Op in Op2 do  Result := (tl Result) od % write Result ";

        // Parse the file content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = parser.startProgram();

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();

        CommonTree currentNode = (CommonTree) treeRoot;

        System.out.println("Tree: " + treeRoot.toStringTree());

        VisitorSymbolsTable visitor = new VisitorSymbolsTable();
        visitor.visit(treeRoot);
        
    }   
}
