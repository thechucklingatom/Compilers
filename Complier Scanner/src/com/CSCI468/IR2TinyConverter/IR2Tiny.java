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

/**
 *
 * @author robert.putnam
 */
public class IR2Tiny {
    
    ArrayList<String> outputList;
            
    public IR2Tiny(){
        outputList = new ArrayList();
        try{
        BufferedReader reader = new BufferedReader(new FileReader("src/res/test1.txt.txt"));
        ArrayList<String> vars = new ArrayList();
        int counter = 0;
        
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
                
               
        }
        
        reader = new BufferedReader(new FileReader("src/res/test1.txt.txt"));
        
        while((temp = reader.readLine()) != null){
            String[] arr;
            if(temp.matches("STOREI [\\$A-Za-z0-9 ]*" )){
                arr = temp.split(" ");
                convert(arr);
                //System.out.println("move " + );
            }
                
        }
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            
        }
    }
    
    public IR2Tiny(ArrayList<String> IRList){
        outputList = new ArrayList();
        convert((String[])IRList.toArray());
    }
    
    public void convert(String[] arr){
        for(int i = 0; i < arr.length; i++){
            if (arr[i].matches("\\$[T0-9]*")){
                arr[i] = arr[i].replace("$T", "r");
                Integer toReplace = Integer.parseInt(arr[i].substring(1)) - 1;
                arr[i] = arr[i].replace(arr[i].substring(1), toReplace.toString());
                System.out.println(arr[i]);  
                outputList.add(arr[i]);
            }
        }
    }
    
}
