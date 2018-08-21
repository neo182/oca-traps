package com.satyam.oca.chap5;

/**
 *
 * @author satyam
 */
public class ConstantsInInterfaceDemo{
    interface TestInterface{
        String NAME = "Test";
        // this is same is line below
        //public static final String NAME = "Test";
        
    }
   
    public class TestClass implements ConstantsInInterfaceDemo.TestInterface{ 
    }
    
    public void test(){
        System.out.println(TestClass.NAME);

        System.out.println(TestInterface.NAME);

        //Following lines are also valid
        TestClass clazz = new TestClass();
        System.out.println(clazz.NAME);
        
    }
    
    public static void main(String[] args) {
        new ConstantsInInterfaceDemo().test();
    }
}
