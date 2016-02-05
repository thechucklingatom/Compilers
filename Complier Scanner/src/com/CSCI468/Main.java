package com.CSCI468;

import com.CSCI468.ANTLROut.testParser;
import org.antlr.v4.runtime.*;
import com.CSCI468.ANTLROut.testLexer;

import java.io.IOError;
import java.io.IOException;

/**
 * Created by Robert Putnam on 1/23/2016.
 *
 * @author Robert Putnam
 */
public class Main {
    public static void main(String[] args) throws IOException{

        //uncomment if you change grammar, it ends the program so you can't have it if you want to check the parser
        //generateFiles();

        ANTLRFileStream fileStream = new ANTLRFileStream("src/res/Step1/inputs/loop.micro");
        ANTLRInputStream in = new ANTLRInputStream("hello");

        testLexer lexer = new testLexer(fileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        testParser parser = new testParser(tokens);
        parser.r();
        parser.r();
        for(int i = 0; i < tokens.size(); i++){
            System.out.println(tokens.get(i));
        }
    }

    public static void generateFiles(){
        //generates antlr files to be used to parse
        //putTower location
        String putTower = "C:\\Users\\Brendan Burns\\Documents\\GitHub\\Compilers\\Complier Scanner\\src\\res\\Grammars\\test.g4";
        //putLaptop location
        String putLaptop = "C:\\Users\\Brendan Burns\\Documents\\GitHub\\Compilers\\Complier Scanner\\src\\res\\Grammars\\test.g4";

        String[] arg0 = { "-visitor", putLaptop, "-package", "com.CSCI468.ANTLROut", "-o", "D:\\Documents\\Compilers\\src\\com\\CSCI468\\ANTLROut" };
        org.antlr.v4.Tool.main(arg0);
    }
}
