package com.satyam.oca.packagestructure;

/**
 *
 * @author satyam
 */
public class SimpleClass {

    static long $ = 01_10L;

    public static void main(String... args) {
        System.out.println("TEST!" + $);
    }

    class A {

        public int m1(int a) {
            return a * 10 / 4 - 30;
        }
        
        Integer a = new Integer(299);
        Integer b = new Integer(a);
    }

    class A2 extends A {

        public int m1(int a) {
            return (int) (a * 10 / 4.0);
        }
    }
}

interface SimpleInterface {

}
