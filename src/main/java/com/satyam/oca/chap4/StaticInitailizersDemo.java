package com.satyam.oca.chap4;

/**
 *
 * @author satyam
 */
public class StaticInitailizersDemo {
    
    static int count = 0;
    
    static int sa = initVar(1);
    
    static{
        sa = initVar(2);
    }
    
    static int sb = initVar(3);
    
    static{
        sb = initVar(4);
    }
    
    public static int initVar(int i){
        System.out.println("initVar called with " + i);
        return i;
    }
    
    static{
        count = 0;
        System.out.println("Inside the static initializer");
        System.out.println("count : " + count);
    }
    
    {
        System.out.println("Inside the instance initializer block!");
    }

    public StaticInitailizersDemo() {
        count++;
    }
    
    public static void main(String[] args) {
        System.out.println("******Inside main*****");
        System.out.println("count: " + count);
        count++;
        new StaticInitailizersDemo();
        System.out.println("count: " + count);
        new StaticInitailizersDemo();
        new StaticInitailizersDemo();
        System.out.println("count: " + count);
        
        String s = "";
        Integer i = 2;
    }
}
