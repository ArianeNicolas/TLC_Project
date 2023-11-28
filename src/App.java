import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

public class App {
    public static void main(String[] args) throws Exception {

        String src = "function true : read % Result := (cons nil nil) % write Result";
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        while_astParser parser = new while_astParser(tokens);

        while_astParser.startProgram_return startProgram = parser.startProgram();
        CommonTree tree = (CommonTree) startProgram.getTree();
        System.out.println(tree.toStringTree());
        
    }   
}
