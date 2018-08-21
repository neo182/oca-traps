package com.satyam.oca.chap4;

/**
 *  An interface can override a default method and make it abstract
 * @author satyam
 */
public class InterfaceDefaultMethods {
    interface i1{
        static void testSomething(){System.out.println("Inside static method");}
        default void doSomething(){System.out.println("Something is being done!");}
    }
    
    interface i2 extends i1{
        default void testSomething(){System.out.println("Inside default method");}
        void doSomething();
    }
    
    class SimpleClass implements i2{

        @Override
        public void doSomething() throws RuntimeException {
            testSimpleClass();
            throw new IllegalArgumentException();
        }
        
        void testSimpleClass(){
            i1.testSomething();
        }
        
    }
    
    public static void main(String[] args) {
        Integer a = 24545454;
        float b = a;
        System.out.println(a - (int)b);
    }
}
