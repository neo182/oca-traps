/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.satyam.oca.packagestructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author satyam
 */
public class SimpleTest {

    Short lNr = 100;
    private static String s = "SSS";
    
    public void testMethod(){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(SimpleTest.this.lNr);
        System.out.println(SimpleTest.s);
    }

    public static void main(String[] args) {
        int iNr = 100;
        new SimpleTest().testMethod();
    }

}
