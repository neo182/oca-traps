package com.satyam.oca;

/**
 *
 * @author satyam
 */
public abstract class PrivateMethodInSuperClassDemo {

    public static class Animal {

        public String name = "Animal";

        private void printName() {
            System.out.println("Animal");
        }

        public void sayHello() {
            System.out.println("Hello form animal");
        }
    }

    public static class Cat extends Animal {

        public String name = "Cat";

        public Cat() {
        }

        private void printName() {
            System.out.println("Cat");
        }

        public void callPrintName() {
            printName();
        }

        public void sayHello() {
            System.out.println("Hello form Cat");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.printName();
        Cat cat = new Cat();
        System.out.println("Animal name: " + animal.name);
        System.out.println("Cat name: " + cat.name);

        animal.sayHello();
        cat.sayHello();
    }
}
