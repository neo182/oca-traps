package com.satyam.oca.chap5;

/**
 *
 * @author satyam
 */
public class PrivateMethodInSuperClassDemo {

    public class Animal {

        private String name = "Animal";

        private void printName() {
            System.out.println("Animal");
        }

        public void sayHello() {
            System.out.println("Hello form animal");
        }
    }

    public class Cat extends Animal {

        public String name = "Cat";

        public Cat() {
        }

        private void printName() {
            System.out.println("Cat");
        }

        public void callPrintName() {
            printName();
        }

        @Override
        public void sayHello() {
            System.out.println("Hello form Cat");
        }
    }
    
    public void test(){
        Animal animal = new Cat();
        animal.printName();
        Cat cat = new Cat();
        System.out.println("Animal name: " + animal.name);
        System.out.println("Cat name: " + cat.name);

        animal.sayHello();
        cat.sayHello();
    }

    public static void main(String[] args) {
         new PrivateMethodInSuperClassDemo().test();
    }
}
