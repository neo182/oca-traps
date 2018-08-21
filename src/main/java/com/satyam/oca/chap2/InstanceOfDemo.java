package com.satyam.oca.chap2;

/**
 *
 * @author satyam
 */
public class InstanceOfDemo {
    public static void main(String[] args) throws Exception{
        
        String s = null;
        System.out.println("s instanceof String : " + (s instanceof String));
        
        //Watch this
        System.out.println("s instanceof String : " + s instanceof String);
        
        String m = "m";
        System.out.println("m instanceof String : " + (m instanceof String));
        
        //Following two lines are compile time error
        //Integer i = 2;
        //boolean result = i instanceof String;
       
    }
}
