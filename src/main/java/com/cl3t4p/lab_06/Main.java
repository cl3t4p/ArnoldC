package com.cl3t4p.lab_06;
import com.cl3t4p.lab_06.parser.ArnoldcLexer;
import com.cl3t4p.lab_06.parser.ArnoldcParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;





public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("File name : ");
        Scanner scanner = new Scanner(System.in);
        String file_name = scanner.nextLine();
        scanner.close();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(file_name);
        CharStream charStream = CharStreams.fromStream(inputStream);

        ArnoldcLexer lexer = new ArnoldcLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ArnoldcParser parser = new ArnoldcParser(tokenStream);
        
        ParseTree tree = parser.prog();
        ArnoldcImp interpreter = new ArnoldcImp();
        interpreter.visit(tree);
        
    }
}
