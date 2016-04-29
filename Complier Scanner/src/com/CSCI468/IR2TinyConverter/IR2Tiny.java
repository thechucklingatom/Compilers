/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CSCI468.IR2TinyConverter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author robert.putnam
 */
public class IR2Tiny {
    
    static ArrayList<String> outputList;
    static String fileName = "res/IR2Tiny/inputs/test_expr.txt";
    static ArrayList<String> vars;
    static int variableSwapRegister;
    static int maxCurrentTempRegister;
    static int gefSwapRegister;
    
    //public IR2Tiny(){
    public static void main(String[] args) throws IOException{
        outputList = new ArrayList();
        try{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        vars = new ArrayList();
        int counter = 0;
        boolean hasNewline = false;
        variableSwapRegister = -1;
        gefSwapRegister= -1;
        maxCurrentTempRegister = 0;
        //If Main is the only label, we don't print out label main for the tiny code
        int labelCount = 0;
        //vars
        //Now just needs to create identical tiny outputs, so mismatching tiny code should be fine (variable order)
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String temp;
        while ((temp = reader.readLine()) != null) {
            String[] dataRows=temp.split(" ");
            if(temp.matches("STOREI [$A-Za-z0-9]* [A-Za-z]*")){
                if (vars.contains(dataRows[dataRows.length-1])){
                    
                }else{
                    System.out.println("var " + dataRows[dataRows.length-1]);
                    vars.add(dataRows[dataRows.length-1]);
                }
                
            }
            if(temp.matches("STOREF [$A-Za-z0-9]* [A-Za-z]*")){
                if (vars.contains(dataRows[dataRows.length-1])){
                    
                }else{
                    System.out.println("var " + dataRows[dataRows.length-1]);
                    vars.add(dataRows[dataRows.length-1]);
                }
                
            }
            else if (temp.matches("READI [A-Za-z]*"))
            {
                if (vars.contains(dataRows[dataRows.length-1])){
                    
                }else{
                    System.out.println("var " + dataRows[dataRows.length-1]);
                    vars.add(dataRows[dataRows.length-1]);
                }      
            }
            else if (temp.matches("WRITEF [A-Za-z]*"))
            {
                if (vars.contains(dataRows[dataRows.length-1])){
                    
                }else{
                    System.out.println("var " + dataRows[dataRows.length-1]);
                    vars.add(dataRows[dataRows.length-1]);
                }       
            }            
            else if (temp.matches("WRITES newline") && hasNewline == false)
            {
            hasNewline = true;
            }
            
             else if (temp.matches("LABEL [\\$A-Za-z0-9]*"))
            {
            labelCount++;
            }
            
                
               
        }
        //Checks if we need the newline var at the beginning.
        if (hasNewline == true)
        {
        System.out.println("str newline \"\\n\"");    
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //vars region end
        
        //
        reader = new BufferedReader(new FileReader(fileName));
        
        while((temp = reader.readLine()) != null){
            ArrayList<String> arr;
            if(temp.matches("STOREI [\\$A-Za-z0-9 ]*" )){
                
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("STOREF [\\$A-Za-z0-9. ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("MULTI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("MULTF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("ADDI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("ADDF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("DIVI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("DIVF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("GTI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("NEI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("EQI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }   
            else if(temp.matches("LEI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("LEF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("GEF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("GEI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("WRITEI [\\$A-Za-z0-9]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("WRITEF [\\$A-Za-z0-9]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("SUBI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("SUBF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            
            
            
            
            //Only print label main if there exists other labels within the program.
            else if (temp.matches("LABEL [\\$A-Za-z0-9]*") && labelCount > 1)
            {
            String[] labelName = temp.split(" ");
            outputList.add("label");
            outputList.add(labelName[labelName.length-1]);
            }
            else if (temp.matches("JUMP [\\$A-Za-z0-9]*"))
            {
            String[] labelName = temp.split(" ");
            outputList.add("jmp");
            outputList.add(labelName[labelName.length-1]);
            }            
            
            else if (temp.matches("WRITES newline"))
            {
            outputList.add("sys");
            outputList.add("writes"); 
            outputList.add("newline"); 
            }
            else if (temp.matches("READI [A-Za-z]"))
            {
            String[] varName = temp.split(" ");   
            outputList.add("sys");
            outputList.add("readi"); 
            outputList.add(varName[varName.length-1] + " ");
                
            }
            
            
            
            
            //else if (temp.matches("RET"))
            //{
            //outputList.add("sys halt");     
            //}
            

                
        }
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            
        }
        
        
        //Printing out the array here
        for(int i = 0; i<outputList.size(); i++)
        {
            //Three variables per line
            if (outputList.get(i).matches("label"))
            {
            System.out.println("label " + outputList.get(i+1) + " ");
            i++;
            }
            else if (outputList.get(i).matches("jmp"))
            {
            System.out.println("jmp " + outputList.get(i+1) + " ");
            i++;
            }
            else if (outputList.get(i).matches("jgt"))
            {
            System.out.println("jgt " + outputList.get(i+1));
            i++;    
            }
            else if (outputList.get(i).matches("jne"))
            {
            System.out.println("jne " + outputList.get(i+1));
            i++;    
            }
            else if (outputList.get(i).matches("jeq"))
            {
            System.out.println("jeq " + outputList.get(i+1));
            i++;    
            }
            else if (outputList.get(i).matches("jle"))
            {
            System.out.println("jle " + outputList.get(i+1));
            i++;    
            }
            else if (outputList.get(i).matches("jge"))
            {
            System.out.println("jge " + outputList.get(i+1));
            i++;    
            }
            else
            {
            System.out.println(outputList.get(i) + " " + outputList.get(i+1) + " " + outputList.get(i+2));
            i = i+2;
                    }
        }
        System.out.println("sys halt");
        
        
    }
    
    public IR2Tiny(ArrayList<String> IRList){
        outputList = new ArrayList();
        convert(IRList);
    }
    
    public static void convert(ArrayList<String> arrIn){
        //Converting T vars to r vars
        outputList = new ArrayList();
        try{
        BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)arrIn.stream()));
        vars = new ArrayList();
        int counter = 0;
        boolean hasNewline = false;
        variableSwapRegister = -1;
        gefSwapRegister= -1;
        maxCurrentTempRegister = 0;
        //If Main is the only label, we don't print out label main for the tiny code
        int labelCount = 0;
        //vars
        //Now just needs to create identical tiny outputs, so mismatching tiny code should be fine (variable order)
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String temp;
        while ((temp = reader.readLine()) != null) {
            String[] dataRows=temp.split(" ");
            if(temp.matches("STOREI [$A-Za-z0-9]* [A-Za-z]*")){
                if (vars.contains(dataRows[dataRows.length-1])){
                    
                }else{
                    System.out.println("var " + dataRows[dataRows.length-1]);
                    vars.add(dataRows[dataRows.length-1]);
                }
                
            }
            if(temp.matches("STOREF [$A-Za-z0-9]* [A-Za-z]*")){
                if (vars.contains(dataRows[dataRows.length-1])){
                    
                }else{
                    System.out.println("var " + dataRows[dataRows.length-1]);
                    vars.add(dataRows[dataRows.length-1]);
                }
                
            }
            else if (temp.matches("READI [A-Za-z]*"))
            {
                if (vars.contains(dataRows[dataRows.length-1])){
                    
                }else{
                    System.out.println("var " + dataRows[dataRows.length-1]);
                    vars.add(dataRows[dataRows.length-1]);
                }      
            }
            else if (temp.matches("WRITEF [A-Za-z]*"))
            {
                if (vars.contains(dataRows[dataRows.length-1])){
                    
                }else{
                    System.out.println("var " + dataRows[dataRows.length-1]);
                    vars.add(dataRows[dataRows.length-1]);
                }       
            }            
            else if (temp.matches("WRITES newline") && hasNewline == false)
            {
            hasNewline = true;
            }
            
             else if (temp.matches("LABEL [\\$A-Za-z0-9]*"))
            {
            labelCount++;
            }
            
                
               
        }
        //Checks if we need the newline var at the beginning.
        if (hasNewline == true)
        {
        System.out.println("str newline \"\\n\"");    
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //vars region end
        
        //
        reader = new BufferedReader(new FileReader(fileName));
        
        while((temp = reader.readLine()) != null){
            ArrayList<String> arr;
            if(temp.matches("STOREI [\\$A-Za-z0-9 ]*" )){
                
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("STOREF [\\$A-Za-z0-9. ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("MULTI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("MULTF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("ADDI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("ADDF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("DIVI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("DIVF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("GTI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("NEI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("EQI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }   
            else if(temp.matches("LEI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("LEF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("GEF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("GEI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("WRITEI [\\$A-Za-z0-9]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("WRITEF [\\$A-Za-z0-9]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("SUBI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("SUBF [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            
            
            
            
            //Only print label main if there exists other labels within the program.
            else if (temp.matches("LABEL [\\$A-Za-z0-9]*") && labelCount > 1)
            {
            String[] labelName = temp.split(" ");
            outputList.add("label");
            outputList.add(labelName[labelName.length-1]);
            }
            else if (temp.matches("JUMP [\\$A-Za-z0-9]*"))
            {
            String[] labelName = temp.split(" ");
            outputList.add("jmp");
            outputList.add(labelName[labelName.length-1]);
            }            
            
            else if (temp.matches("WRITES newline"))
            {
            outputList.add("sys");
            outputList.add("writes"); 
            outputList.add("newline"); 
            }
            else if (temp.matches("READI [A-Za-z]"))
            {
            String[] varName = temp.split(" ");   
            outputList.add("sys");
            outputList.add("readi"); 
            outputList.add(varName[varName.length-1] + " ");
                
            }
            
            
            
            
            //else if (temp.matches("RET"))
            //{
            //outputList.add("sys halt");     
            //}
            

                
        }
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            
        }
        
        
        //Printing out the array here
        for(int i = 0; i<outputList.size(); i++)
        {
            //Three variables per line
            if (outputList.get(i).matches("label"))
            {
            System.out.println("label " + outputList.get(i+1) + " ");
            i++;
            }
            else if (outputList.get(i).matches("jmp"))
            {
            System.out.println("jmp " + outputList.get(i+1) + " ");
            i++;
            }
            else if (outputList.get(i).matches("jgt"))
            {
            System.out.println("jgt " + outputList.get(i+1));
            i++;    
            }
            else if (outputList.get(i).matches("jne"))
            {
            System.out.println("jne " + outputList.get(i+1));
            i++;    
            }
            else if (outputList.get(i).matches("jeq"))
            {
            System.out.println("jeq " + outputList.get(i+1));
            i++;    
            }
            else if (outputList.get(i).matches("jle"))
            {
            System.out.println("jle " + outputList.get(i+1));
            i++;    
            }
            else if (outputList.get(i).matches("jge"))
            {
            System.out.println("jge " + outputList.get(i+1));
            i++;    
            }
            else
            {
            System.out.println(outputList.get(i) + " " + outputList.get(i+1) + " " + outputList.get(i+2));
            i = i+2;
                    }
        }
        System.out.println("sys halt");
        
    }
    
}
