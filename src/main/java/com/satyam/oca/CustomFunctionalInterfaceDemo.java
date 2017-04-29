package com.satyam.oca;

/**
 *
 * @author satyam
 */
public class CustomFunctionalInterfaceDemo {
    public interface TestInterface{
        boolean test();
    }
    
    public void test(){
        boolean result = new TestInterface() {
            @Override
            public boolean test() {
                return false;
            }
        }.test();
       
        System.out.println(result);
        
        TestInterface testInterface = () -> true;
        boolean resultLambda = testInterface.test();
        System.out.println("value of resultLambda : " + resultLambda);
    }
    
    public static void main(String[] args) {
        new CustomFunctionalInterfaceDemo().test();
    }
}
