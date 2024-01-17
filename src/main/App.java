package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import antlrworks.while_astLexer;
import antlrworks.while_astParser;
import main.VisitorThreeAdresses.ThreeAdresses;

public class App {
    public static String[] files;
    public static void main(String[] args) throws Exception {
        App.files = args;
        // Check if a file name is provided as argument
        /*if(args == null || args.length < 1) {
            System.out.println("Please provide at least a file name as argument");
            System.exit(1); 
        }*/

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
             src = "function add :\r\n" + //
                     "read Op1, Op2\r\n" + //
                     "%\r\n" + //
                     "    Result := Op1 ;\r\n" + //
                     "    for Op2 do\r\n" + //
                     "        Result := ( cons nil Result )\r\n" + //
                     "    od\r\n" + //
                     "%\r\n" + //
                     "write Result\r\n" + //
                     "\r\n" + //
                     "function test:\r\n" + //
                     "read Op1, Op2\r\n" + //
                     "%\r\n" + //
                     "    nop;\r\n" + //
                     "    Result := (cons);\r\n" + //
                     "    Result := (add Result (cons));\r\n" + //
                     "    Result := (add Result (cons));\r\n" + //
                     "    Result := (add Result (cons));\r\n" + //
                     "    Result := (add Result (cons));\r\n" + //
                     "    Result := (tl Result);\r\n" + //
                     "    Result := (hd Result);\r\n" + //
                     "    Result := (list Result Result Result Result);\r\n" + //
                     "    Result := (cons Result Result Result (cons Result));\r\n" + //
                     "\r\n" + //
                     "    while Op2\r\n" + //
                     "    do\r\n" + //
                     "        Result := (list Result);\r\n" + //
                     "        Test := (cons)\r\n" + //
                     "    od;\r\n" + //
                     "\r\n" + //
                     "    while (cons Result (add Result(cons)))\r\n" + //
                     "    do\r\n" + //
                     "        Result := (cons)\r\n" + //
                     "    od;\r\n" + //
                     "\r\n" + //
                     "    Test := (cons)\r\n" + //
                     "%\r\n" + //
                     "write Result\r\n" + //
                     "\r\n" + //
                     "function sub :\r\n" + //
                     "read Op1, Op2\r\n" + //
                     "%\r\n" + //
                     "    Result := Op1;\r\n" + //
                     "    for Op2 do\r\n" + //
                     "        Result := (tl Result)\r\n" + //
                     "    od\r\n" + //
                     "%\r\n" + //
                     "write Result\r\n" + //
                     "\r\n" + //
                     "function mul :\r\n" + //
                     "read Op1, Op2\r\n" + //
                     "%\r\n" + //
                     "    for Op1 do\r\n" + //
                     "        Result := (add Result Op2)\r\n" + //
                     "    od\r\n" + //
                     "%\r\n" + //
                     "write Result\r\n" + //
                     "\r\n" + //
                     "function test2:\r\n" + //
                     "read Op1, Op2\r\n" + //
                     "%\r\n" + //
                     "    Result := (cons);\r\n" + //
                     "    Result := (add Result (cons));\r\n" + //
                     "    Result := (add Result (cons));\r\n" + //
                     "    Result := (add Result (cons));\r\n" + //
                     "    Result := (add Result (cons))\r\n" + //
                     "%\r\n" + //
                     "write Result\r\n" + //
                     "\r\n" + //
                     "function true :\r\n" + //
                     "read\r\n" + //
                     "%\r\n" + //
                     "    Result := (cons nil nil)\r\n" + //
                     "%\r\n" + //
                     "write Result\r\n" + //
                     "\r\n" + //
                     "function false :\r\n" + //
                     "read\r\n" + //
                     "%\r\n" + //
                     "    Result := nil\r\n" + //
                     "%\r\n" + //
                     "write Result\r\n" + //
                     "\r\n" + //
                     "function not :\r\n" + //
                     "read Op1\r\n" + //
                     "%\r\n" + //
                     "    if Op1 then Result := (false) else Result := (true) fi\r\n" + //
                     "%\r\n" + //
                     "write Result\r\n" + //
                     "\r\n" + //
                     "function and :\r\n" + //
                     "read Op1, Op2\r\n" + //
                     "%\r\n" + //
                     "    if (not Op1) then\r\n" + //
                     "        Result := (false)\r\n" + //
                     "    else\r\n" + //
                     "        if (not Op2) then\r\n" + //
                     "            Result := (false)\r\n" + //
                     "        else\r\n" + //
                     "            Result := (true)\r\n" + //
                     "        fi\r\n" + //
                     "    fi\r\n" + //
                     "%\r\n" + //
                     "write Result\r\n" + //
                     "\r\n" + //
                     "function testRetourMultiple :\r\n" + //
                     "read Op1, Op2\r\n" + //
                     "%\r\n" + //
                     "    V1, V2 := Op1, Op2\r\n" + //
                     "%\r\n" + //
                     "write V1, V2\r\n" + //
                     "\r\n" + //
                     "function jeVeuxMourir:\r\n" + //
                     "read Op1, Op2\r\n" + //
                     "%\r\n" + //
                     "    Test1, Test2, Test3 := (testRetourMultiple Op1 Op2), (cons);\r\n" + //
                     "    Test4 := (cons a (cons b nil))\r\n" + //
                     "%\r\n" + //
                     "write Test1, Test2\r\n" + //
                     "\r\n" + //
                     "function testForeachetComm:\r\n" + //
                     "read Op1, Op2, Op3\r\n" + //
                     "%\r\n" + //
                     "    Test1 := (cons);\r\n" + //
                     "    foreach VFor in Op2 do\r\n" + //
                     "        Test1 := (cons VFor Test1)\r\n" + //
                     "    od;\r\n" + //
                     "    Test2 := (cons) =? Test1\r\n" + //
                     "\r\n" + //
                     "%\r\n" + //
                     "write Test1, Test2\r\n" + //
                     "\r\n" + //
                     "function main:\r\n" + //
                     "read\r\n" + //
                     "%\r\n" + //
                     "    Result := (cons);\r\n" + //
                     "    Result := (add nil (cons a))\r\n" + //
                     "%\r\n" + //
                     "write Result";
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
        System.out.println(visitorSymbolsTable.getSymbolsTable());

        //check the types
        System.out.println("===========Checking types===========");
        VisitorTypesChecker visitorTypesChecker = new VisitorTypesChecker(visitorSymbolsTable.getSymbolsTable());
        visitorTypesChecker.visit(treeRoot);

        //generate the 3A code
        System.out.println("===========Generating 3A code===========");
        VisitorThreeAdresses visitorThreeAdresses = new VisitorThreeAdresses();
        visitorThreeAdresses.visit(treeRoot);

        HashMap<CommonTree,ArrayList<VisitorThreeAdresses.ThreeAdresses>> code3A = visitorThreeAdresses.getCode3A();
        ArrayList<VisitorThreeAdresses.ThreeAdresses> lastCode3A = code3A.get(treeRoot.getChild(0));
        
        for(VisitorThreeAdresses.ThreeAdresses c3A : lastCode3A){
            System.out.println(c3A.op + " " + c3A.arg1 + " " + c3A.arg2 + " " + c3A.var);
        }


        System.out.println("===========Generating C code===========");
        code3AtoC ctoc = new code3AtoC(lastCode3A, visitorSymbolsTable.getSymbolsTable(), src);
        ctoc.startConversion();
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
