package com.CSCI468;

import com.CSCI468.ANTLROut.testParser;
import org.antlr.v4.runtime.*;
import com.CSCI468.ANTLROut.testLexer;
import java.io.IOException;

/**
 * Created by Robert Putnam on 1/23/2016.
 *
 * @author Robert Putnam
 */
public class Main {
    public static void main(String[] args) throws IOException{

        //uncomment if you change grammar, it ends the program so you can't have it if you want to check the parser
        generateFiles();
        
        ANTLRFileStream fileStream;

        if(args[0] == null){
            fileStream = new ANTLRFileStream("res/Step1/inputs/loop.micro");
        }else{
            fileStream = new ANTLRFileStream(args[0]);
        }
        ANTLRInputStream in = new ANTLRInputStream("hello");

        testLexer lexer = new testLexer(fileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        testParser parser = new testParser(tokens);
        parser.r();
        
        for(int i = 0; i < tokens.size(); i++){
            if(tokens.get(i).getType()-1 < 0){
                System.out.println(""); 
            }else{
                System.out.println("Token Type: " + lexer.getRuleNames()[tokens.get(i).getType() - 1]);
                System.out.println("Value: " + tokens.get(i).getText().replaceAll("\n", ""));
            }             
        }
    }

    public static void generateFiles(){
        //generates antlr files to be used to parse
        //location 0 = burns, 1 = putnamTower, 2 = putnamLaptop
        String[] location = {"C:\\Users\\Brendan Burns\\Documents\\GitHub\\Compilers\\Complier Scanner\\src\\res\\Grammars\\test.g4", "res/Grammars/scanner.g4"};
        //compiled output location
        String[] output = {"C:\\Users\\Brendan Burns\\Documents\\GitHub\\Compilers\\Complier Scanner\\src\\com\\CSCI468\\ANTLROut", "src\\com\\CSCI468\\ANTLROut"};

        String[] arg0 = { "-visitor", location[1], "-package", "com.CSCI468.ANTLROut", "-o", output[1] };
        org.antlr.v4.Tool.main(arg0);
    }
}
