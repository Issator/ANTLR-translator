package pl.edu.pwsztar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import  pl.edu.pwsztar.grammars.Pascal.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String cs;

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            cs = sb.toString();
        } finally {
            br.close();
        }

	    pascalLexer pascalLexer = new pascalLexer(CharStreams.fromString(cs));

        CommonTokenStream tokenStream = new CommonTokenStream(pascalLexer);
        pascalParser pascalparser = new pascalParser(tokenStream);


        ParseTree tree = pascalparser.program();
        MyPascalListener pascalListener = new MyPascalListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(pascalListener, tree);
    }
}
