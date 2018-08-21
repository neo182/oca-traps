package com.satyam.oca.chap2;

/**
 *
 * @author satyam
 */
public class IntegerComparisionDemo {

    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);

        System.out.println("Integer ref equals " + (a == b));
        
        a = 1;
        b = 1;
        System.out.println("Integer ref equals (after value) " + (a == b));
        
        Integer c = new Integer(1);
        int d = 1;
        // This results true as the comparision would be made in value stored not in reference level
        System.out.println("Integer equals with value and ref type : " + (c == d));
        
        //But, the following line results false as both c and a are reference type and comparision has been made in ref. level
        System.out.println("Integer equals with value and ref type : " + (c == a));
    }
}
