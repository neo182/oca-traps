package com.satyam.oca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author satyam
 */
public class StringPlusDemo {
    public static void main(String[] args) {
        String a = "a";
        Integer i = 33;
        float f1 = 44.0f;
        float f2 = 44.0f;
        float result = f1 + f2;
        
        short s = 3;
        short s1 = 2;
        s += s1;
        
        if(f1 > s){
            System.out.println("OK");
        }
        
        boolean b = false;
        System.out.println("result = " + a + b + i);
        
        s += i;
        
        List<Integer> list = new ArrayList<>();
        list.add(null);
        Integer obj = list.get(0);
        System.out.println(obj);
        
    }
}
