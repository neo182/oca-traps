package com.satyam.oca.chap5;

/**
 *
 * @author satyam
 */
public class PolymorhpismDemo {

    class Bird {

        public boolean isGeneric = true;
        
        public Number getNumber(){
            return 1;
        }

        public void printName() {
            System.out.println("Bird!");
        }
    }

    class Peacock extends Bird {

        public boolean isGeneric = false;

        @Override
        public void printName() {
            System.out.println("Peacock");
        }

        @Override
        public Float getNumber() {
            return (float)1;
        }
        
        
    }

    public static void main(String[] args) {
        new PolymorhpismDemo().polymorphismTest();
    }

    public void polymorphismTest() {
        Bird bird = new Peacock();
        bird.printName();
        System.out.println(bird.isGeneric);

        Peacock peacock = new Peacock();
        Bird bird1 = peacock;
        bird1.printName();
        System.out.println(bird1.isGeneric);
        
        Number n = 100;
        System.out.println(n);

    }
}
