package compilateur;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import antlrworks.while_astLexer;
import antlrworks.while_astParser;

/**
 * Main class of the project, While compiler
 */
public class App {
    /**
     * List of files to compile
     */
    public static ArrayList<String> inputFiles = new ArrayList<String>();

    /**
     * Take a list of files as arguments and compile them (check syntax, check types, generate 3A code and convert it to C)
     * @param args List of files to compile (-v or --verbose can also be used to display compilation steps
     * @throws Exception If there is a syntax error, a type error or a problem while reading the files
     */
    public static void main(String[] args) throws Exception {
        //test if the verbose option is activated
        boolean verbose = false;
        for (String arg : args) {
            if(arg.equals("-v") || arg.equals("--verbose")) {
                verbose = true;
                break;
            }
        }
        //if not verbose, redirect messages (not errors) to /dev/null
        OutputStream consoleOutput = System.out;
        if(!verbose) {
            System.setOut(new java.io.PrintStream(new java.io.OutputStream() {
                public void write(int b) {
                }
            }));
        }


        //files are parameter that don't start with -
        //files before -o are input files
        //files after -o are output files (there can be only one)
        boolean outputFileisProvided = false;
        String outputFileName = null;
        for (String arg : args) {
            if(!outputFileisProvided && arg.equals("-o")) {
                outputFileisProvided = true;
            } 

            if(!arg.startsWith("-")) {
                if(outputFileisProvided) {
                    if(outputFileName != null) {
                        System.err.println("Error: multiple output files provided");
                        System.exit(1); 
                    }
                    outputFileName = arg;
                } else {
                    inputFiles.add(arg);
                }
            }
        }
        //if no output file is provided, use a default one
        if(outputFileName == null) {
            outputFileName = "./a.out";
        }
        
        // Check if a file name is provided as argument
        if(inputFiles == null || inputFiles.size() == 0) {
            System.err.println("Error: no file name provided");
            System.exit(1); 
        }
        
        String src = "";
        // Read the file // todo put it in src
        try {
            for (String file : inputFiles) {
                src += Files.readString(Path.of(file)) + "\n";
            }
            //remove the last \n
            src = src.substring(0, src.length() - 1);
        } catch (Exception e) {
            System.err.println("Error while reading file");
            System.exit(1);
        }

        // Display the source code
        System.out.println("===========Source code===========");
        System.out.println("Source code: \n" + src); 

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
        ArrayList<VisitorThreeAdresses.ThreeAdresses> lastCode3A = code3A.get(treeRoot.getChild(0).getChild(0));
        for(VisitorThreeAdresses.ThreeAdresses c3A : lastCode3A){
            System.out.println(c3A.op + " " + c3A.arg1 + " " + c3A.arg2 + " " + c3A.var);
        }


        //todo ajouter la traduction en c

        //write a file
        System.out.println("===========Writing file===========");
        String cCode = "temporaire"; //todo
        //todo decommenter pour ecriture dans un fichier
        /* 
        try {
            Files.writeString(Path.of(outputFileName), cCode);
        } catch (IOException e) {
            System.err.println("Error while writing file");
            System.exit(1);
        }**/

        //reset system.out to be able to print the final result
        System.setOut(new java.io.PrintStream(consoleOutput));
        System.out.println("===========Done!==========="); 
    }   

    /**
     * Get the file name and line number of a node in the corresponding file (useful for error messages)
     * @param node The node to get the file name and line number from
     * @return The file name and line number of the node
     */
    public static String getFileNameAndLineNumber(CommonTree node) {
        //get the line count of each file
        ArrayList<Integer> lineCounts = new ArrayList<Integer>();
        //files correspond to the arguments of the program
        for (String arg : inputFiles) {
            try {
                lineCounts.add(Files.readAllLines(Path.of(arg)).size());
            } catch (IOException e) {
                System.err.println("Error while reading file");
                System.exit(1);
            }
        }
        //get real file and line number
        int fileIndex = 0;
        int line = node.getLine();
        for (int i = 0; i < lineCounts.size(); i++) {
            if(line > lineCounts.get(i)) {
                line -= lineCounts.get(i);
                fileIndex++;
            } else {
                break;
            }
        }
        return "File: " + inputFiles.get(fileIndex) + ", line: " + line;
    } 
}
