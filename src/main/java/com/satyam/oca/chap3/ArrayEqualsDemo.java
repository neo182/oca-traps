package com.satyam.oca.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Checking the equality of two arrays can only be ensured with Arrays.equals
 *
 * @author satyam
 */
public class ArrayEqualsDemo {

    public static void main(String[] args) {
        String a[] = {"a", "b", "c",};  //this is allowed
        String b[] = {"a", "b", "c",};

        System.out.println("a == b : " + (a == b));
        System.out.println("a.equals(b) : " + (a.equals(b)));

        System.out.println("Arrays.equals(a, b) : " + (Arrays.equals(a, b)));

        System.out.println("Containing of array before modifyArray(): " + Arrays.toString(a));
        modifyArrray(a);
        System.out.println("Containing of array after modifyArray(): " + Arrays.toString(a));

        //interator demo
        List<String> stringList = new ArrayList<>();
        stringList.add("AAA");
        stringList.add("BBB");
        stringList.add("CCC");
        Iterator iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
        }
    }

    public static void modifyArrray(String[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = "0";
        }
    }

}
