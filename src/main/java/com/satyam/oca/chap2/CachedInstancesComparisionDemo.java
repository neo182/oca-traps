package com.satyam.oca.chap2;

/**
 *
 * @author satyam
 */
public class CachedInstancesComparisionDemo {

    public static void main(String[] args) {
        //wrapper classes of Byte, Short, Integer and Long cache objects with values in the range of -128 to 127
        //while that of Character caches with values 0 to 127
        Long long1 = new Long(123);
        Long long2 = new Long("123");

        //return false
        System.out.println("long1 == long2 :: " + (long1 == long2));

        long1 = Long.valueOf("123");
        long2 = Long.valueOf(123);

        //OBS. return true this time //results the same with long2 = 123L;
        System.out.println("long1 == long2 :: " + (long1 == long2));

        long1 = Long.valueOf("128");
        long2 = Long.valueOf(128);
        //OBS. return false again as 128 is greater than the caching range(-128 to 127)
        System.out.println("long1 == long2 :: " + (long1 == long2));

        //cached instancs for boolean
        Boolean boolean1 = Boolean.valueOf("true");
        Boolean boolean2 = Boolean.valueOf(true);
        System.out.println("boolean1 == boolean2 :: " + (boolean1 == boolean2));
        
        //OBS. -0 is valid literal value
        // although char is allowed to store from 0 to 127, -0 is considered normal 0
        char c = -0;
        System.out.println("c : " + (int)c);
      
    }

}
