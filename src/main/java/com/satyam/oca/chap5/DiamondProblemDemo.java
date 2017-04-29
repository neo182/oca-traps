package com.satyam.oca.chap5;

/**
 *
 * @author satyam
 */
public class DiamondProblemDemo {

    interface A {

        default   void sayHI() {
            System.out.println("Hello from A!");
        }
    }

    interface B {

        default void sayHI() {
            System.out.println("Hello from B!");
        }
    }

    class D implements A, B {

        @Override
        public void sayHI() {
            System.out.println("Hello from class C");
        }
        

        public void testSuperInInterface() {
            sayHI();
        }
    }

    public static void main(String[] args) {
        new DiamondProblemDemo().testClassD();

    }

    public void testClassD() {
        new D().testSuperInInterface();
    }
}
