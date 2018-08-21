package com.satyam.oca.chap5;

/**
 *
 * @author satyam
 */
public class InterfaceExtendingInterfaceDemo implements i1, i2{

    @Override
    public void printSomething() {
        System.out.println("prining something");
    }
    
    public static void main(String[] args) {
        new InterfaceExtendingInterfaceDemo().printSomething();
    }
    
}

interface i1{
   void printSomething(); 
}

interface i2 extends i1{    
   @Override
   void printSomething(); 
}

