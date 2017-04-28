/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jz.passwordchecker;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Password1 {
    
    private String pwd;
    
    public Password1 (String p){
        pwd=p;
    }
    
    //getter:
    public String getPwd(){
        return pwd;
    }
    
    //setter:
    public void setPwd(String p){
        pwd = p;
    }
    
    //8 character rule
    public boolean isLength(){
        if(pwd.length()>7){
            return true;
        }
            return false;
    }
    
    public boolean hasUpper(){
        for(int c=0; c<pwd.length(); c++){
            char a =pwd.charAt(c);
            if(Character.isUpperCase(a)==true){
                return true;
            }
        }
        return false;
    }
    
    public boolean hasLower(){
        for(int c=0; c<pwd.length(); c++){
            char a =pwd.charAt(c);
            if(Character.isLowerCase(a)==true){
                return true;
            }
        }
        return false;
    }
    
    public boolean hasDigit(){
        for(int c=0; c<pwd.length(); c++){
            char a =pwd.charAt(c);
            if(Character.isDigit(a)==true){
                return true;
            }
        }
        return false;
    }
    
    public boolean hasSymbol(){
        for(int c=0; c<pwd.length(); c++){
            char a =pwd.charAt(c);
            if(Character.isLetterOrDigit(a)==false){
                return true;
            }
        }
        return false;
    }
    
    public boolean hasThreeChars(){
        for(int i=0; i<pwd.length(); i++){
            char c = pwd.charAt(i);
            int a = pwd.indexOf(c);
            int b = pwd.indexOf(c, a+1);
            int x = pwd.lastIndexOf(c);
        
            if(a==b || b==x || x==a){
            } else {
                return false;
            }
         }
        return true;
    }
  
    public boolean hasCommonWord(){
        File file = new File("Q:/APCS/commonwords.txt");

        try{
            Scanner s = new Scanner (file);
            while(s.hasNextLine()){
                String line = s.nextLine();
                if(pwd.indexOf(line)==-1){
                continue;
                }
                else{
                    s.close();
                    return false;
                }
            }
            s.close();
            return true;
        }
            catch(FileNotFoundException e){
                e.printStackTrace();
                return false;
            }
    }

            
    @Override
    public String toString(){
    return pwd;
    }
  
}


