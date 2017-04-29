package com.satyam.oca;

/**
 *
 * @author satyam
 */
public class ConstantsInInterfaceDemo {
    interface TestInterface{
        String NAME = "Test";
        // this is same is line below
        //public static final String NAME = "Test";
        
    }
    
    public static void main(String[] args) {
        System.out.println(TestInterface.NAME);
    }
}
