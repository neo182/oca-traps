package com.satyam.oca;

/**
 *
 * @author satyam
 */
public class MethodReturningExceptionDemo {

    public static void main(String[] args) {
        try {
            RuntimeException runtimeException = getRunTimeException();
            System.out.println("Got exception as return value : " + runtimeException.getMessage());
        } catch (RuntimeException ex) {
            System.out.println("Caught exception as a part of exception handling routine : " + ex.getMessage());
        }
        
        System.out.println(getValue());
    }

    public static RuntimeException getRunTimeException() throws RuntimeException {
        try {
            return new RuntimeException("Thowing Runtime exception from try block");
        } catch(Exception e){
            throw new RuntimeException("Thowing another Runtime exception");
        }finally {
            return new RuntimeException("Throwing Runtime exception from finally block");
        }
    }
    
    public static int getValue(){
        try{
            return 1;
        }catch(Exception e){
            return 2;
        }finally{
            return 3;
        }
    }

}
