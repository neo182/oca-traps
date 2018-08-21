package com.satyam.oca.chap5;

/**
 *
 * @author satyam
 */
public class InstanceOfOperatorWithInterface {
    
    interface Animal{
        
    }
    
    class Mammal implements Animal{
        int i;
        public Mammal(int i) {
            super();
        }
        
        public void test(){
            
        }
    }
    
    class Dog extends Mammal{
        int i;
        public Dog(int i) {
            this();
        }

        public Dog() {
            super(0);
            System.out.println("Testing");
        }
    }
    
    public void test(){
        Dog dog = new Dog();
        
        Class clazz = dog.getClass();
        Class parentClazz = clazz.getSuperclass();
        System.out.println("class type of Animal instance : " + clazz.getSimpleName());
        System.out.println("class type of parent Animal instance : " + parentClazz.getSimpleName());
        
        if(dog instanceof Animal){
            System.out.println("Animal");
        }
        
        if(dog instanceof Dog){
            System.out.println("Dog");
        }
        
        if(dog instanceof Mammal){
            System.out.println("Mammal");
        }
    }
    
    public static void main(String[] args) {
        new InstanceOfOperatorWithInterface().test();
    }
}
