package com.CSCI468;

import com.CSCI468.ANTLROut.testParser;
import org.antlr.v4.runtime.*;
import com.CSCI468.ANTLROut.testLexer;

/**
 * Created by Robert Putnam on 1/23/2016.
 *
 * @author Robert Putnam
 */
public class Main {
    public static void main(String[] args){

        //uncomment if you change grammar, it ends the program so you can't have it if you want to check the parser
        //generateFiles();

        ANTLRInputStream in = new ANTLRInputStream("hello");
        testLexer lexer = new testLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        testParser parser = new testParser(tokens);
        parser.r();
        System.out.println(tokens.get(0).getText());
    }

    public static void generateFiles(){
        //generates antlr files to be used to parse
        //putTower location
        String putTower = "D:\\Documents\\Compilers\\res\\Grammars\\test.g4";
        //putLaptop location
        String putLaptop = "C:\\Users\\robertp\\IdeaProjects\\Compilers\\res\\Grammars\\test.g4";

        String[] arg0 = { "-visitor", putTower, "-package", "com.CSCI468.ANTLROut", "-o", "D:\\Documents\\Compilers\\src\\com\\CSCI468\\ANTLROut" };
        org.antlr.v4.Tool.main(arg0);
    }
}
