package com.satyam.oca;

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
        
    }
}
