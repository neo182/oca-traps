/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.satyam.oca;

/**
 *
 * @author satyam
 */
public class RunTimeExceptionHandlerDemo {

    class GrandParent {

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
            System.out.println("Hi from GrandChild");
        }
    }

    public void test() {
        GrandChild grandChild = new GrandChild();
        System.out.println(grandChild.s);
    }

    public static void main(String[] args) {
        new RunTimeExceptionHandlerDemo().test();
    }
}
