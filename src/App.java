import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.TreeAdaptor;

public class App {
    public static void main(String[] args) throws Exception {

        String src = "function true : read % Result := (cons nil nil) % write Result";
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        while_astParser parser = new while_astParser(new CommonTokenStream(lexer));
        
        while_astParser.startProgram_return startProgram = parser.startProgram();
        CommonTree tree = (CommonTree) startProgram.getTree();

        
    }   
}
