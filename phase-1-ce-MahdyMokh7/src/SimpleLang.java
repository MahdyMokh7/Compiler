import main.ast.nodes.Program;
import main.grammar.SimpleLangLexer;
import main.grammar.SimpleLangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import main.visitor.TestVisitor;
import main.Preprocessor.CPyPreprocessor;

import java.io.IOException;

public class SimpleLang {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Usage: java SimpleLang <source-file>");
            return;
        }

        String sourcePath = args[0];
        CharStream reader;

        if (sourcePath.endsWith(".cpy")) {
            String preprocessed = CPyPreprocessor.preprocess(sourcePath);

            // Print converted code to terminal
            System.out.println("=== Converted CPy to C-style code ===");
            System.out.println(preprocessed);
            System.out.println("=====================================");

            reader = CharStreams.fromString(preprocessed);
        } else {
            reader = CharStreams.fromFileName(sourcePath);
        }

        SimpleLangLexer lexer = new SimpleLangLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleLangParser parser = new SimpleLangParser(tokens);
        Program program = parser.program().programRet;

        TestVisitor visitor = new TestVisitor();
        visitor.visit(program);
    }
}
