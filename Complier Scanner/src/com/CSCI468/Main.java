package com.CSCI468;

import com.CSCI468.ANTLROut.scannerLexer;
import com.CSCI468.ANTLROut.scannerParser;
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
        //generateFiles();
        
        ANTLRFileStream fileStream;

       try{
            fileStream = new ANTLRFileStream(args[0]);
        }catch(ArrayIndexOutOfBoundsException ex){
            fileStream = new ANTLRFileStream("res/Step1/inputs/loop.micro");
        }
        ANTLRInputStream in = new ANTLRInputStream("hello");

        scannerLexer lexer = new scannerLexer(fileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        scannerParser parser = new scannerParser(tokens);
        parser.start();
        
        for(int i = 0; i < tokens.size(); i++){
            if(tokens.get(i).getType()-1 < 0){
                
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
        String[] output = {"C:\\Users\\Brendan Burns\\Documents\\GitHub\\Compilers\\Complier Scanner\\src\\com\\CSCI468\\ANTLROut", "src/com/CSCI468/ANTLROut"};

        String[] arg0 = { "-visitor", location[1], "-package", "com.CSCI468.ANTLROut", "-o", output[1] };
        org.antlr.v4.Tool.main(arg0);
    }
}
