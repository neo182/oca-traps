package com.satyam.oca;

import java.io.EOFException;
import java.io.IOException;

/**
 *
 * @author satyam
 */
public class ExceptionHandlingWithFinallyDemo {

    public static void simpleMethod(int i) throws EOFException {
        try {
            System.out.println("Intializing the try block");
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Catching the IOException");
            throw new EOFException();
        } finally {
            System.out.println("Inside the finally block");
        }
        //System.out.println("The end of the method");
    }

    public static void main(String[] args) throws EOFException {
        try {
            simpleMethod(0);
        }catch(EOFException ex){
            System.out.println("Catching EOFException");
        }
    }
}
