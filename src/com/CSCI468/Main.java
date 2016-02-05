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
        //generates antlr files to be used to parse
        //putTower location
        String putTower = "D:\\Documents\\Compilers\\res\\Grammars\\test.g4";
        //putLaptop location
        String putLaptop = "C:\\Users\\robertp\\IdeaProjects\\Compilers\\res\\Grammars\\test.g4";

        String[] arg0 = { "-visitor", putLaptop, "-package", "com.CSCI468.ANTLROut", "-o", "D:\\Documents\\Compilers\\src\\com\\CSCI468\\ANTLROut" };
        org.antlr.v4.Tool.main(arg0);


        ANTLRInputStream in = new ANTLRInputStream("Hello, asdf;lkhgHello,aasdkljhasdlgk");
        testLexer lexer = new testLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        testParser parser = new testParser(tokens);
        System.out.println(parser.r());
    }
}
