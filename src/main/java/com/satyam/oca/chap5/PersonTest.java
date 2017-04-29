package com.satyam.oca.chap5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author satyam= 
 */
public class PersonTest {
    private static final List<String> finalList = new ArrayList<>();
    
    public static void main(String[] args) {
        Person.main(args);
        finalList.add("k");
        finalList.add("k");
    }
}
