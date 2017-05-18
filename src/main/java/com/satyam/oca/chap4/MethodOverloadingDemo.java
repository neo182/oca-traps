package com.satyam.oca.chap4;

/**
 *
 * @author satyam
 */
public class MethodOverloadingDemo {

    public static class OverloadingGroup1 {

        public void fun(int a) {
            System.out.println("int");
        }

        public void fun(long... a) {
            System.out.println("long...");
        }

        public void fun(Object a) {
            System.out.println("Object");
        }

        public void test() {
            float l = 100;
            fun(l);
        }
    }

    public static class OverloadingGroup2 {

        public void fun(long... a) {
            System.out.println("long...");
        }

        public void fun(Long... a) {
            System.out.println("Long...");
        }

        public void fun(Object a) {
            System.out.println("Object");
        }

        public void test() {
            Long[] longArray = new Long[]{1L, 2L,};
            fun(longArray);

            fun(2, 2);
            
            // N.B. this is important example:
            // Here the parameter type are both of type Short type and is converted into higher primitive type i.e. long NOT Long.
            Short s = 1;
            fun(s, s);
        }
    }
    
     public static class OverloadingGroup3 {

        public void fun(long... a) {
            System.out.println("long...");
        }

        public void fun(Object a) {
            System.out.println("Object");
        }

        public void test() {
            long l = 100;
            fun(l);
        }
    }
     
    public static void main(String[] args) {
        OverloadingGroup1 group1 = new OverloadingGroup1();
        group1.test();

        System.out.println("====Result from second test========");
        OverloadingGroup2 group2 = new OverloadingGroup2();
        group2.test();
        
        System.out.println("====Result from third test========");
        OverloadingGroup3 group3 = new OverloadingGroup3();
        group3.test();
    }
}
