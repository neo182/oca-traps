package com.satyam.oca.chap4;

/**
 *
 * @author satyam
 */
public class StaticInitailizersDemo {
    
    static int count = 0;
    
    static{
        count = 0;
        System.out.println(count);
        System.out.println("Inside the static initializer");
    }

    public StaticInitailizersDemo() {
        count++;
    }
    
    public static void main(String[] args) {
        System.out.println("From main " + count);
        count++;
        new StaticInitailizersDemo();
        System.out.println(count);
        new StaticInitailizersDemo();
        new StaticInitailizersDemo();
        System.out.println(count);
    }
}
