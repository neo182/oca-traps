package com.satyam.oca.chap4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author srt
 */
public class ArrayListContentModificationDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Ola");
        Person p2 = new Person("Kari");
        personList.add(p1);
        personList.add(p1);
        
        p1.name = "Ola Changed";
        p2.name = "Kari Changed";
        p1 = null;
        p2 = null;
        System.out.println(personList);
        
        String s1 = new String("AAA");
        String s2 = new String("BBB");
        List<String> stringList = new ArrayList<>();
        stringList.add(s1);
        stringList.add(s2);
        s1 = null;
        s2 = null;
        System.out.println(stringList);
    }
}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
