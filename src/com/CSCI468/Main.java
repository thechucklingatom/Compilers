package com.CSCI468;

/**
 * Created by Robert Putnam on 1/23/2016.
 */
public class Main {
    public static void main(String[] args){
        //generates antlr files to be used to parse
        String[] arg0 = { "-visitor", "D:\\Documents\\Compilers\\res\\Grammars\\test.g4", "-package", "com.CSCI468.ANTLROut", "-o", "D:\\Documents\\Compilers\\src\\com\\CSCI468\\ANTLROut" };
        org.antlr.v4.Tool.main(arg0);
    }
}
