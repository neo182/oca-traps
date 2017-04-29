package com.satyam.oca;

/**
 *
 * @author satyam
 */
public class CallMethodFromConstructorDemo {
    
    public interface A{
        public static void print(){
            System.out.println("from interface A");
        }
        
        public void testMethod();
    }
    
    public interface B extends A{
        public void testMethod();
        
         public static void print(){
            System.out.println("from interface B");
        }
    }
    
    class C implements A,B{
        public void testintToPrint(){
            B.print();
        }
        
        public void testMethod(){
            
        }
    }
    
    public void test(){
       C c = new C();
       c.testMethod();
    }
    
    public static void main(String[] args) {
        new CallMethodFromConstructorDemo().test();
    }
}
