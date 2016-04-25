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
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author robert.putnam
 */
public class IR2Tiny {
    
    static ArrayList<String> outputList;
    static String fileName = "res/IR2Tiny/step4_testcase2.txt";
            
    //public IR2Tiny(){
    public static void main(String[] args) throws IOException{
        outputList = new ArrayList();
        try{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> vars = new ArrayList();
        int counter = 0;
        boolean hasNewline = false;
        //If Main is the only label, we don't print out label main for the tiny code
        int labelCount = 0;
        //vars
        //Now just needs to create identical tiny outputs, so mismatching tiny code should be fine (variable order)
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String temp;
        while ((temp = reader.readLine()) != null) {
            if(temp.matches("STOREI [$A-Za-z0-9]* [A-Za-z]")){
                if (vars.contains(new String(new char[] {temp.charAt(temp.length()-1)}))){
                    
                }else{
                    System.out.println("var " + temp.charAt(temp.length()-1));
                    vars.add(new String(new char[] {temp.charAt(temp.length()-1)}));
                }
                
            }
            else if (temp.matches("READI [A-Za-z]"))
            {
                if (vars.contains(new String(new char[] {temp.charAt(temp.length()-1)}))){
                    
                }else{
                    System.out.println("var " + temp.charAt(temp.length()-1));
                    vars.add(new String(new char[] {temp.charAt(temp.length()-1)}));
                }       
            }
            else if (temp.matches("WRITEF [A-Za-z]"))
            {
                if (vars.contains(new String(new char[] {temp.charAt(temp.length()-1)}))){
                    
                }else{
                    System.out.println("var " + temp.charAt(temp.length()-1));
                    vars.add(new String(new char[] {temp.charAt(temp.length()-1)}));
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
    
    public static void convert(ArrayList<String> arr){
        //Converting T vars to r vars
        for(int i = 0; i < arr.size(); i++){
            if (arr.get(i).matches("\\$[T0-9]*")){
                arr.set(i, arr.get(i).replace("$T", "r"));
                Integer toReplace = Integer.parseInt(arr.get(i).substring(1)) - 1;
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
