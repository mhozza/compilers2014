import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

public class Compiler {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        OmnomnomLexer lexer = new OmnomnomLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OmnomnomParser parser = new OmnomnomParser(tokens);
        ParseTree tree = parser.init(); // parse

        CompilerVisitor eval = new CompilerVisitor();
        CodeFragment code = eval.visit(tree);
        
        if (args.length > 1) {
            String outputFile = args[1];
            try (PrintWriter writer = new PrintWriter(outputFile, "UTF-8")) {
                writer.print(code.toString());
                writer.close();         
            }
        }
         //System.out.print(code.toString());  
    }      
}
