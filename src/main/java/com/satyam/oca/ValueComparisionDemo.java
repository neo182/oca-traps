package com.satyam.oca;

/**
 *
 * @author satyam
 */
public class ValueComparisionDemo {

    public void test(int i) {
        System.out.println("int");
    }
    
   
    public void test(Integer i) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        new ValueComparisionDemo().test(2);
    }
}
