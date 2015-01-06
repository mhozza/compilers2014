import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Compiler {

    public static void main(String[] args) throws Exception {
        String inputFile = null;

        try {
            if ( args.length>0 ) inputFile = args[0];
            InputStream is = System.in;

            if ( inputFile!=null ) is = new FileInputStream(inputFile);

            ANTLRInputStream input = new ANTLRInputStream(is);
            scapyLexer lexer = new scapyLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            scapyParser parser = new scapyParser(tokens);
            ParseTree tree = parser.init(); // parse

            CompilerVisitor eval = new CompilerVisitor();

            CodeFragment code = eval.visit(tree);
	    System.out.println(code.toString());
	/*
            String name = "vystup.ll";
	
            FileOutputStream out = new FileOutputStream(name);
            PrintWriter printWriter = new PrintWriter(out);

            printWriter.println(code.toString());

            printWriter.close();
            out.close();
	
            new ProcessBuilder("./script", name, args[1]).inheritIO().start().waitFor();
	*/
        } catch (Exception e) {

            System.err.println(e.toString());
            System.exit(-1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.print(code.toString());
    }
}
