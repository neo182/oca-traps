package com.satyam.oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author satyam
 */
public class PredicateTest {
    
    public static class Animal {

        String name;
        boolean domestic;

        public Animal(String name, boolean domestic) {
            this.name = name;
            this.domestic = domestic;
            
        }

        @Override
        public String toString() {
            return name;
        }
        
        
    }
    
    public static void main(String[] args) {
        Animal cat = new Animal("Cat", true);
        Animal monkey = new Animal("Monkey", false);
        
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(monkey);
        Animal[] animalArray = animals.toArray(new Animal[0]);
        System.out.println("The size of animal array is " + animalArray.length);
        System.out.println(animals.toString());

        List<Animal> backedList = Arrays.asList(animalArray);
        
        animals.removeIf(new DomesticTester());
        System.out.println(Arrays.toString(animals.toArray()));
        printIfDomestic(cat, c -> c.domestic);
        printIfDomestic(cat, (a)->  {return a.domestic;});
    }
    
    public static void printIfDomestic(Animal animal, Predicate<Animal> predicate){
        if(predicate.test(animal)){
            System.out.println("The animal is domestic");
        }else{
            System.out.println("Not domestic");
        }
    }

    public static class DomesticTester implements Predicate<Animal> {

        @Override
        public boolean test(Animal t) {
            return t.domestic;
        }

    }
}
