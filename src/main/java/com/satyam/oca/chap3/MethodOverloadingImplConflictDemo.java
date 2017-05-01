package com.satyam.oca.chap3;

/**
 *
 * @author satyam
 */
public class MethodOverloadingImplConflictDemo {

    public static double calc(double a, int b) {
        return a + b;
    }

    public static double calc(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        double result = calc(1d, 2);
        result = calc(1, 2d);

        //the line below does not compile as the compiler is unable to deterime which 
        //overloaded method should be called.
        //result = calc(1, 2)
    }
}
