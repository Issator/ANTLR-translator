package pl.edu.pwsztar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import  pl.edu.pwsztar.grammars.Pascal.*;

public class Main {

    public static void main(String[] args) {
	    String cs = "program x (x);\n" +
                "\n" +
                "type\n" +
                "  T = record end;\n" +
                "\n" +
                "begin\n" +
                "  writeln('Hi');\n" +
                "end.";
	    pascalLexer pascalLexer = new pascalLexer(CharStreams.fromString(cs));

        CommonTokenStream tokenStream = new CommonTokenStream(pascalLexer);
        pascalParser pascalparser = new pascalParser(tokenStream);


        ParseTree tree = pascalparser.program();
        System.out.println(tree.toStringTree(pascalparser));
        MyPascalListener pascalListener = new MyPascalListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(pascalListener, tree);
    }
}
