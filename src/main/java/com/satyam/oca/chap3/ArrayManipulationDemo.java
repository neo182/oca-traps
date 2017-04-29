package com.satyam.oca.chap3;

import java.util.Arrays;

/**
 *
 * @author satyam
 */
public class ArrayManipulationDemo {
    public static void main(String[] args) {
        String a[] = {"a", "b", "c",};  //this is allowed
        String b[] = new String[10];
        System.out.println("Before copy");
        System.out.println(Arrays.toString(b));
        
        System.out.println("After System.arraycopy");
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));
        
    }
    
}
