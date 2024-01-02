package main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import antlrworks.while_astLexer;
import antlrworks.while_astParser;

public class App {
    public static String[] files;
    public static void main(String[] args) throws Exception {
        App.files = args;
        // Check if a file name is provided as argument
        if(args == null || args.length < 1) {
            System.out.println("Please provide at least a file name as argument");
            System.exit(1); 
        }

        //todo concatener si plusieurs arguments
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String arg : args) {
                src += Files.readString(Path.of(arg)) + "\n";
            }
        } catch (Exception e) {
            System.out.println("Error while reading file");
            System.exit(1);
        }

        // temp test
        if(src == null || src.isEmpty()) {
            src = "function sub : read Op1, Op2 % Result := Op1; foreach Op in Op2 do  Result := (tl Result) od % write Result; ";
        }
        System.out.println("Source code: " + src); 

        // Parse the file content
        while_astLexer lexer = new while_astLexer(new ANTLRStringStream(src));
        // Get the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        while_astParser parser = new while_astParser(tokens);

        // Call the start rule, which is the entry point of the grammar
        while_astParser.startProgram_return startProgram = parser.startProgram();

        // Check if there is no syntax error and raise an exception if needed
        System.out.println("===========Checking syntax errors===========");
        int nbErrors = parser.getNumberOfSyntaxErrors();
        if(nbErrors > 0) {
            throw new WhileException(nbErrors + " syntax error" + (nbErrors > 1 ? "s" : ""));
        }

        // The root of the AST
        final CommonTree treeRoot = (CommonTree) startProgram.getTree();
        System.out.println("Tree: " + treeRoot.toStringTree());
    
        //construct the symbol table
        System.out.println("===========Constructing symbol table===========");
        VisitorSymbolsTable visitorSymbolsTable = new VisitorSymbolsTable();
        visitorSymbolsTable.visit(treeRoot);

        //check the types
        System.out.println("===========Checking types===========");
        VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
        visitorTypesChecker.visit(treeRoot);

        //generate the 3A code
        System.out.println("===========Generating 3A code===========");
        VisitorThreeAdresses visitorThreeAdresses = new VisitorThreeAdresses();
        visitorThreeAdresses.visit(treeRoot);

        HashMap<CommonTree,ArrayList<VisitorThreeAdresses.ThreeAdresses>> code3A = visitorThreeAdresses.getCode3A();
        ArrayList<VisitorThreeAdresses.ThreeAdresses> lastCode3A = code3A.get(treeRoot.getChild(0).getChild(0));
        for(VisitorThreeAdresses.ThreeAdresses c3A : lastCode3A){
            System.out.println(c3A.op + " " + c3A.arg1 + " " + c3A.arg2 + " " + c3A.var);
        }
    }   

    //get file name and line number
    public static String getFileNameAndLineNumber(CommonTree node) {
        //get the line count of each file
        ArrayList<Integer> lineCounts = new ArrayList<Integer>();
        for (String arg : files) {
            try {
                lineCounts.add(Files.readAllLines(Path.of(arg)).size());
            } catch (IOException e) {
                System.out.println("Error while reading file");
                //System.exit(1);
            }
        }
        //get real file and line number
        int fileIndex = 0;
        int line = node.getLine();
        for (int i = 0; i < lineCounts.size(); i++) {
            if(line > lineCounts.get(i)) {
                line -= lineCounts.get(i);
                // handle the add of a \n between files
                line--;
                fileIndex++;
            } else {
                break;
            }
        }
        return "File: " + files[fileIndex] + " at Line: " + line;
    } 
}
