package com.CSCI468;

import com.CSCI468.ANTLROut.scannerLexer;
import com.CSCI468.ANTLROut.scannerParser;
import org.antlr.v4.runtime.*;
import java.io.IOException;




import java.util.Stack;
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
            fileStream = new ANTLRFileStream("res/Step4/inputs/step4_testcase.micro");
        }
        ANTLRInputStream in = new ANTLRInputStream("hello");

        scannerLexer lexer = new scannerLexer(fileStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ExitingErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        scannerParser parser = new scannerParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ExitingErrorListener.INSTANCE);
        parser.pre();
        
        
        //for(String s : parser.ST.keySet()){
        //    System.out.println(s);
        //System.out.println(parser.ST.get(s).toString());    
        //}

        
        
        // Single line to comment to print tokens
        //printTokens(tokens, lexer);
        
        //System.out.println("Accepted");
    }

    public static void generateFiles(){
        //generates antlr files to be used to parse
        //location 0 = burns, 1 = putnamTower, 2 = putnamLaptop
        String location = "res/Grammars/scanner.g4";
        //compiled output location
        String output = "src/com/CSCI468/ANTLROut";

        String[] arg0 = { "-visitor", location, "-package", "com.CSCI468.ANTLROut", "-o", output };
        org.antlr.v4.Tool.main(arg0);
    }
    
    public static void printTokens(CommonTokenStream tokens, scannerLexer lexer){
            for(int i = 0; i < tokens.size(); i++){
            if(tokens.get(i).getType()-1 < 0){
                
            }else{
                System.out.println("Token Type: " + lexer.getRuleNames()[tokens.get(i).getType() - 1]);
                System.out.println("Value: " + tokens.get(i).getText().replaceAll("\n", ""));
            }             
        }    
        
        
    }
    
}