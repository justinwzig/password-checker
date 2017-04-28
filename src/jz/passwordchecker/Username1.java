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
public class Username1 {
    
    private String user;
    
    public Username1 (String p){
        user=p;
    }
    
    //getter:
    public String getUser(){
        return user;
    }
    
    //setter:
    public void setUser(String u){
        user = u;
    }
    
    //Checks if there is an at sign, that there is one and only one at sign, and that the at sign is before the final period, and that there is text before the at.
    public boolean atSign(){
        return user.contains("@") == true && user.indexOf("@") == user.lastIndexOf("@") && user.indexOf("@")>1;
    }
    
    public boolean period(){
        return user.contains(".") == true && user.indexOf(".") > user.indexOf("@");
    }
    
    public boolean length(){
        return user.length()>5 && user.length()<254;
    }
    
    //checks if there are invalid characters
    public boolean invalSyms() {
        for (int c = 0; c < user.length(); c++) {
            char a = user.charAt(c);
            if (Character.isLetterOrDigit(a) == false) {
                return a == '$' || a == '_' || a == '.';
            } else {
                return false;
            }
        }
        return false;
    }
            
    @Override
    public String toString(){
    return user;
    }
  
}


