package com.satyam.oca.chap5;

/**
 * Checks which of the method implementation is used by a method that inherits
 * an interface and Abstract class both having concrete implementation
 *
 * @author satyam
 */
public class InterfaceAndAbstractClassDemo extends SimpleAbstractClass implements SimpleInterface {

    public static void main(String[] args) {
        InterfaceAndAbstractClassDemo objInstance = new InterfaceAndAbstractClassDemo();
        //This will invoke the abstract class version of saySomething
        objInstance.saySomething();
        
    }

}

interface SimpleInterface{ 

//    static void saySomething(){
//        System.out.println("hello from static method");
//    }
    // void saySomething();
    default void saySomething() {
        System.out.println("hello from interface");
    }
}

abstract class SimpleAbstractClass {

    public void saySomething() {
        System.out.println("hello from abstract class");
    }
}
