package com.satyam.oca.chap5;

/**
 *
 * @author satyam
 */
public class AbstractWithProtectedDemo {
    private void test(){
        ConcClass clazz = new ConcClass();
        clazz.print();
        
        AbsClass.sayHello();
    }
    
    public static void main(String[] args) {
        new AbstractWithProtectedDemo().test();
    }
}

abstract class AbsClass {

    protected abstract void print();
    
    public static void sayHello(){
        
        StringBuilder sb = new StringBuilder("ddd");
        System.out.println(sb + "ddd");
        System.out.println("hello!"); 
    }
}


class ConcClass extends AbsClass{

    @Override
    public void print() {
        System.out.println("printing something");
    }
    
}