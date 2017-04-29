package com.satyam.oca;

/**
 *
 * @author satyam
 */
public class StringVsCharArrayCompare {
    public static void main(String[] args) {
        String str = "Test";
        char[] charArray = {'T','e','s','t'};
        
        boolean result = (str == charArray.toString());
        System.out.println("result : " + result);
        
        String nullStr = null;
        nullStr += 'S';
        
        System.out.println(nullStr);
    }
}
