package com.satyam.oca.chap3;

/**
 * The swap performed in the method does not effect the object ref. by the ref.
 * types
 *
 * @author satyam
 */
public class RefTypeSwapWithMethod {

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Paul");

        swap(person1, person2);
        //still prints John and Paul 
        System.out.println(person1.name + " and " + person2.name);
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
