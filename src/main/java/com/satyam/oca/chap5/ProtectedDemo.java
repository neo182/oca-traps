package com.satyam.oca.chap5;

/**
 *
 * @author satyam
 */
public class ProtectedDemo {

    private static class SuperClass {

        protected int a;

        protected void sayHello() {
            System.out.println("Hello");
        }

        public void setA(int a) {
            this.a = a;
        }

    }

    private static class SubClass extends SuperClass {
        
        private int i;

        public void callHello() {
            sayHello();
        }

    }

    private static void changeA(SubClass sub) {
        //sub.setA(1);
        sub.a = 5;
    }

    private static void changeStr(String str) {
        //sub.setA(1);
        str = "ddd";
    }

//    private static void show(int i){System.out.println("Int");}
//    
//    private static void show(Integer i){System.out.println("Integer");}
//    
    private static void show(long i) {
        System.out.println("long");
    }
    
      
    private static void show(float i) {
        System.out.println("long");
    }


    private static void show(Long i) {
        System.out.println("Long");
    }

    public static void shout(String i) {
        System.out.println(i);
    }

    public static void main(Integer[] args) {
    }

    public static void main(String[] args) {
        SubClass subclass = new SubClass();
        subclass.i = 100;
    }
}
