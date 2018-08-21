package com.satyam.oca.chap6;

/**
 *
 * @author satyam
 */
public class RunTimeExceptionHandlerDemo {

    class GrandParent {
        
        void test(){
            System.out.println("Testing From Grandparent");
        }

        void sayHi() {
            System.out.println("Hi from GrandParent");
        }
    }

    class Parent extends GrandParent {

        String s = "GrandParent";

        @Override
        void sayHi() {
            System.out.println("Hi from Parent");
        }
    }

    class Child extends Parent {

        String s = "Child";

        @Override
        void sayHi() {
            System.out.println("Hi from Child");
        }
    }

    class GrandChild extends Child {
        

        @Override
        void sayHi() {
            test();
            super.sayHi();
            System.out.println("Hi from GrandChild");
        }
    }

    public void test() {
        GrandChild grandChild = new GrandChild();
        grandChild.sayHi();
        System.out.println(grandChild.s);
    }

    public static void main(String[] args) {
        new RunTimeExceptionHandlerDemo().test();
    }
}
