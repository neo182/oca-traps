package com.satyam.oca.chap2;

/**
 *
 * @author satyam
 */
public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        /// when all operators have the same precedence, they are executed from left to right
        int int1 = 10, int2 = 20, int3 = 30;
        System.out.println(int1 % int2 * int3 + int1 / int2);
        
    }
}
