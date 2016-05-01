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
import java.io.StringReader;
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
    
    public IR2Tiny(){
        
    }
    
    public void startConversion(ArrayList<String> IRList){
        outputList = new ArrayList();
        
        StringBuilder buffer = new StringBuilder();
        for(String s : IRList){
            buffer.append(s).append("\n");
        }
        try{
            BufferedReader reader = new BufferedReader(new StringReader(buffer.toString()));
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
            reader = new BufferedReader(new StringReader(buffer.toString()));

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
    
    public static void convert(ArrayList<String> arr){
        //Converting T vars to r vars
        for(int i = 0; i < arr.size(); i++){
            
            //Temp vars to R values
            if (arr.get(i).matches("\\$[T0-9]*")){
                arr.set(i, arr.get(i).replace("$T", "r"));
                Integer toReplace = Integer.parseInt(arr.get(i).substring(1)) - 1;
                
                //Keeping track of the highest register number, once we have defined a variable swap register, we don't need to track it anymore.
                //Apparently the gef command also gets its own dedicated register.
                if ((toReplace > maxCurrentTempRegister))
                {
                maxCurrentTempRegister = toReplace;    
                }
                //We have the swap register taking a spot, so we remove the -1 offset as a result
                if (variableSwapRegister != -1)
                {
                toReplace = toReplace + 1;    
                }
                if (gefSwapRegister != -1)
                {
                toReplace = toReplace + 1;    
                }
                
                
                
                arr.set(i, arr.get(i).replace(arr.get(i).substring(1), toReplace.toString()));
                //System.out.println(arr[i]);
            }
            
                //STOREI to move
                else if (arr.get(i).matches("STOREI")){
                arr.set(i,"move");
                //System.out.println(arr[i]);
                }
                //STOREF to move
                else if (arr.get(i).matches("STOREF")){
                arr.set(i,"move");
                //System.out.println(arr[i]);
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);
                
                if (vars.contains(var1) && vars.contains(var2))
                {
                 if (variableSwapRegister == -1)   //Only define the swap register once
                 {
                  if (gefSwapRegister == -1)
                     {
                     variableSwapRegister = maxCurrentTempRegister + 1;
                     } 
                     else
                     {
                     variableSwapRegister = maxCurrentTempRegister + 2;    
                     }    
                 }   
                 arr.set(i+1, var1);
                 arr.set(i+2, ("r"+variableSwapRegister));
                 arr.add(i+3, "move");
                 arr.add(i+4, ("r"+variableSwapRegister));
                 arr.add(i+5, var2);
                 
                    
                    
                }
                }
                //SUBI to move and subi
                else if (arr.get(i).matches("SUBI")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "move");
                arr.set(i+1, var1);
                arr.set(i+2, var3);
                arr.set(i+3, "subi");
                arr.add(i+4, var2);
                arr.add(i+5, var3);
                }
                //SUBF to move and subr
                else if (arr.get(i).matches("SUBF")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "move");
                arr.set(i+1, var1);
                arr.set(i+2, var3);
                arr.set(i+3, "subr");
                arr.add(i+4, var2);
                arr.add(i+5, var3);
                }
                //MULTI to move and muli
                else if (arr.get(i).matches("MULTI")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "move");
                arr.set(i+1, var1);
                arr.set(i+2, var3);
                arr.set(i+3, "muli");
                arr.add(i+4, var2);
                arr.add(i+5, var3);
                }
                //MULTF to move and mulr
                else if (arr.get(i).matches("MULTF")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "move");
                arr.set(i+1, var1);
                arr.set(i+2, var3);
                arr.set(i+3, "mulr");
                arr.add(i+4, var2);
                arr.add(i+5, var3);
                }
                //ADDI to move and addi
                else if (arr.get(i).matches("ADDI")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "move");
                arr.set(i+1, var1);
                arr.set(i+2, var3);
                arr.set(i+3, "addi");
                arr.add(i+4, var2);
                arr.add(i+5, var3);
                }
                //ADDF to move and addr
                else if (arr.get(i).matches("ADDF")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "move");
                arr.set(i+1, var1);
                arr.set(i+2, var3);
                arr.set(i+3, "addr");
                arr.add(i+4, var2);
                arr.add(i+5, var3);
                }
            
                //Divi to move and divi
                else if (arr.get(i).matches("DIVI")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "move");
                arr.set(i+1, var1);
                arr.set(i+2, var3);
                arr.set(i+3, "divi");
                arr.add(i+4, var2);
                arr.add(i+5, var3);
                }
                //DIVF to move and divr
                else if (arr.get(i).matches("DIVF")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "move");
                arr.set(i+1, var1);
                arr.set(i+2, var3);
                arr.set(i+3, "divr");
                arr.add(i+4, var2);
                arr.add(i+5, var3);
                }
                //GTI to cmpi and jgt
                else if (arr.get(i).matches("GTI")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "cmpi");
                arr.set(i+1, var1);
                arr.set(i+2, var2);
                arr.set(i+3, "jgt");
                arr.add(i+4, var3);
                }
                else if (arr.get(i).matches("NEI")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "cmpi");
                arr.set(i+1, var1);
                arr.set(i+2, var2);
                arr.set(i+3, "jne");
                arr.add(i+4, var3);
                }
                else if (arr.get(i).matches("EQI")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "cmpi");
                arr.set(i+1, var1);
                arr.set(i+2, var2);
                arr.set(i+3, "jeq");
                arr.add(i+4, var3);
                }
                else if (arr.get(i).matches("LEI")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "cmpi");
                arr.set(i+1, var1);
                arr.set(i+2, var2);
                arr.set(i+3, "jle");
                arr.add(i+4, var3);
                }
                else if (arr.get(i).matches("GEI")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "cmpi");
                arr.set(i+1, var1);
                arr.set(i+2, var2);
                arr.set(i+3, "jge");
                arr.add(i+4, var3);
                }
                else if (arr.get(i).matches("LEF")){
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "cmpr");
                arr.set(i+1, var1);
                arr.set(i+2, var2);
                arr.set(i+3, "jle");
                arr.add(i+4, var3);
                }
                else if (arr.get(i).matches("GEF")){
                 if (gefSwapRegister == -1)   //Only define the swap register once
                 {
                     if (variableSwapRegister == -1)
                     {
                     gefSwapRegister = maxCurrentTempRegister + 1;
                     } 
                     else
                     {
                     gefSwapRegister = maxCurrentTempRegister + 2;    
                     }
                 }
                    
                    
                String var1 = arr.get(i+1);
                String var2 = arr.get(i+2);    
                String var3 = arr.get(i+3);    
                    
                arr.set(i, "move");
                arr.set(i+1, var2);
                arr.set(i+2, "r"+gefSwapRegister);
                arr.set(i+3, "cmpr");
                arr.add(i+4, var1);
                arr.add(i+5, "r"+gefSwapRegister);
                arr.add(i+6, "jge");
                arr.add(i+7, var3);
                }
                //Spaces appear inconsistant after the writei
                else if (arr.get(i).matches("WRITEI"))
                {
                String var1 = arr.get(i+1);
                arr.set(i, "sys");
                arr.set(i+1, "writei");
                arr.add(i+2, var1);
                }
                else if (arr.get(i).matches("WRITEF"))
                {
                String var1 = arr.get(i+1);
                arr.set(i, "sys");
                arr.set(i+1, "writer");
                arr.add(i+2, var1);
                }
            
              
            outputList.add(arr.get(i));
        }
    }
    
}