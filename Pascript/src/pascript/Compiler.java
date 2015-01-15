package pascript;

import java.io.FileInputStream;
import pascript.grammar.PascriptLexer;
import pascript.grammar.PascriptParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.Normalizer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Osama Hasanein
 */
public class Compiler
{
    private static class PascriptInputStream extends ANTLRInputStream
    {
        public PascriptInputStream(InputStream inputStream) throws IOException
        {
            super(inputStream);
        }
        
        @NotNull
        @Override
        public String getText(@NotNull Interval interval)
        {
            return Normalizer
                .normalize(super.getText(interval), Normalizer.Form.NFD)
                .replaceAll("[^\\x00-\\x7F]", "");
        }
    }

    public static void printCompilationError(String errorMessage, Token errorToken)
    {
        String position = String.format("%d:%d", errorToken.getLine(), errorToken.getCharPositionInLine());
        System.err.println(errorMessage + " @ " + position);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            String inputFileName = null;
            if (args.length > 0)
            {
                inputFileName = args[0];
            }
            InputStream inputStream = System.in;
            if (inputFileName != null)
            {
                inputStream = new FileInputStream(inputFileName);
            }
            
            PascriptInputStream input = new PascriptInputStream(inputStream);
            PascriptLexer lexer = new PascriptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PascriptParser parser = new PascriptParser(tokens);
            ParseTree tree = parser.module();
            
            String outputFileName = null;
            if (args.length > 1)
            {
                outputFileName = args[1];
            }
            PrintStream printStream = System.out;
            if (outputFileName != null)
            {
                printStream = new PrintStream(outputFileName);
            }

            CodeVisitor codeVisitor = new CodeVisitor();
            printStream.println(codeVisitor.visit(tree).toString());
        }
        catch (IOException ex)
        {
            System.err.println("Error while reading from input :");
            System.err.println(ex.getMessage());
            System.exit(-1);
        }
    }
}
