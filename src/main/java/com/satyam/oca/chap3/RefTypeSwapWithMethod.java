package com.satyam.oca.chap3;

/**
 * The swap performed in the method does not effect the object ref. by the ref.
 * types
 *
 * @author satyam
 */
public class RefTypeSwapWithMethod {

    public static void main(String[] args) {
        Person john = new Person("John");
        Person paul = new Person("Paul");

        swap(john, paul);
        //still prints John and Paul 
        System.out.println(john.name + " and " + paul.name);
    }

    public static void swap(Person p1, Person p2) {
        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }
}

class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

}
