package com.satyam.oca.chap3;

/**
 *
 * @author satyam
 */
public class StringBuilderMethodsDemo {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder(50);
        Short s = 22;
        sb.append(s); //it uses append(Object obj) version not append(int i)
        
        String str = null;
        sb.append(str);
        
        Person person = new  Person("Roy");
        sb.append(person);
        System.out.println(sb);
        
        System.out.println("Capacity of stringbuilder : " + sb.capacity());
        System.out.println("Length of stringbuilder : " + sb.length());
    }
    
    
    private static class Person{
        String name;
        
        Boolean bool;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
        
        
    }
}
