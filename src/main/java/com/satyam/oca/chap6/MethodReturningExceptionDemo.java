package com.satyam.oca.chap6;

/**
 * Very important example that shows that it it possible to return Exception from a method and it is always the
 * values from finally block that is executed
 * @author satyam
 */
public class MethodReturningExceptionDemo{
    
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
            return new RuntimeException("Runtime exception from TRY block");
        } catch(Exception e){
            throw new RuntimeException("Runtime exception from CATCH block");
        }finally {
            return new RuntimeException("Runtime exception from from FINALLY block");
        }
    }
    
    public static int getValue(){
        String s = null;
        try{
            return 1;
        }catch(Exception e){
            return 2;
        }finally{
            return 3;
        }
    }

}
