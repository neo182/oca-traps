package com.satyam.oca.chap3;

import java.util.Arrays;

/**
 *
 * @author satyam
 */
public class ArraysBinarySearchDemo {
    public static void main(String[] args) {
        String[] strArray = {"a", "b", "c"};
        int index = Arrays.binarySearch(strArray, "c");
        System.out.println(index);
        
        
        String[][] myStringArray = new String [][] { { "X0", "Y0"},
                                             { "X1", "Y1"},
                                             { "X2", "Y2"},
                                             { "X3", "Y3"},
                                             { "X4", "Y4"} };
        System.out.println("The deep array to string is : ");
        String strFromArray = Arrays.deepToString(myStringArray);
        System.out.println("strFromArray : " + strFromArray);
    }
}
