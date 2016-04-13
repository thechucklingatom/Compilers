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
            
    //public IR2Tiny(){
    public static void main(String[] args) throws IOException{
        outputList = new ArrayList();
        try{
        BufferedReader reader = new BufferedReader(new FileReader("res/IR2Tiny/step4_testcase.txt"));
        ArrayList<String> vars = new ArrayList();
        int counter = 0;
        boolean hasNewline = false;
        //vars
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
            else if (temp.matches("WRITES newline") && hasNewline == false)
            {
            System.out.println("str newline \"\\n\"");
            hasNewline = true;
            }
                
               
        }
        //vars region end
        
        //
        reader = new BufferedReader(new FileReader("res/IR2Tiny/step4_testcase.txt"));
        
        while((temp = reader.readLine()) != null){
            ArrayList<String> arr;
            if(temp.matches("STOREI [\\$A-Za-z0-9 ]*" )){
                
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("MULTI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("ADDI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("DIVI [\\$A-Za-z0-9 ]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            else if(temp.matches("WRITEI [\\$A-Za-z0-9]*" )){
                arr = new ArrayList<String>(Arrays.asList(temp.split(" ")));
                convert(arr);
            }
            //else if (temp.matches("RET"))
            //{
            //outputList.add("sys halt");     
            //}
            

                
        }
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            
        }
        
        
        
        for(int i = 0; i<outputList.size()-2; i=i+3)
        {
            //Three variables per line
            System.out.println(outputList.get(i) + " " + outputList.get(i+1) + " " + outputList.get(i+2));
            
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
            
                //ADDI to move and muli
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
            
                //Divi to move and muli
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
                else if (arr.get(i).matches("WRITEI"))
                {
                String var1 = arr.get(i+1);
                arr.set(i, "sys");
                arr.set(i+1, "writei");
                arr.add(i+2, var1);
                }
            
              
            outputList.add(arr.get(i));
        }
    }
    
}
