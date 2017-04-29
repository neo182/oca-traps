package com.satyam.oca.chap6;

/**
 *
 * @author satyam
 */
public class MethodWithExceptionAndReturnTypeTest {

    public static int fn1() {
        {
            try {
                throw new RuntimeException();
            }
            catch (RuntimeException e) {
                System.out.println("The method caught exception");
                return 1;
            } 
            
            finally {
                return 2;
            }
            
        }
    }
    
    public static void main(String[] args) {
        System.out.println("The method returns : " + fn1());
    }
}
