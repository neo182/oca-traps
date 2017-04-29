package com.satyam.oca.chap5;

/**
 *
 * @author satyam
 */
public class DogTest {
    
    String s;

    public static void main(String[] args) {
        new DogTest().testInterfaceDefault();
    }
    
    public void testInterfaceDefault(){
        TestingClass animal = new TestingClass();
        animal.dosomething();
    }

    private abstract class Mammal {

    }

    private interface TestingInterface1 {

        default void dosomething() {
            System.out.println("Testing interface1");
        }

        default void test() {

        }
    }
    
    private interface TestingInterface2 extends TestingInterface1 {

        default void dosomething() {
            System.out.println("Testing interface2");
        }

        void test();  
    }
    
    class TestingClass implements  TestingInterface2{

        @Override
        public void dosomething() {
            TestingInterface2.super.dosomething(); 
        }
        
        
        @Override
        public void test() {
            System.out.println("Testing testing");
        }
        
        
        
    }
}
