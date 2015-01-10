
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class Compiler {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        ArrowsLexer lexer = new ArrowsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArrowsParser parser = new ArrowsParser(tokens);
        ParseTree tree = parser.init(); // parse

        ArrowsExtendedVisitor eval = new ArrowsExtendedVisitor();
        try {
            Container code = eval.visit(tree);
            System.out.print(code.toString());
        } catch (Exception e) {
            System.err.println(e.toString());
            System.exit(1);
        } 
    }
}
