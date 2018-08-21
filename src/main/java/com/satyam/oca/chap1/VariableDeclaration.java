package com.satyam.oca.chap1;

import java.util.Arrays;
/**
 *
 * @author satyam
 */
public class VariableDeclaration {

    public static void main(String[] args) {
        byte b = 127;
        Byte byte_obj = 127;

        //Following two lines are invalid as it crosses the limit for byte which is (-128 to +127)
        //byte invalid_b = 128;
        //byte invalid_b = -129;
        
        byte castedByte1 = (byte) 128;
        System.out.println("casteByte1 : " + castedByte1);
        
         
        byte castedByte2 = (byte)-129;
        System.out.println("casteByte1 : " + castedByte2);
        
        float float1 = 146;
        double double1 = 123;
        Short short1 = 12;
        // valid floating points with the use of F/f and D/d at the end of the declaration
        Float float2 = 146F;
        Double double2 = 123D;
        
        //Invalid declartations with their reasons
        //float invalid_float1 = 123.33;  // floating point values are double by default
        //Float invalid_float2 = 123;     // It is only possible to make a single upcast/promotion from int to float, but not from int to Float
        //Double invallid_double1 = 232;    // invalid for the same reason as above

        int all = 01_0;
        System.out.println(all);
        
        //Following lines are invalid 
        //Short s1 = new Short(1);
        //Byte b1 = new Byte(1);
        
        //But following lines are valid as Float defines a constructor that takes double as well as float
        Float f1 = new Float(22);
        Float f2 = new Float(22.0);
        Float f3 = new Float(22.0f);
        Float f4 = new Float(22.0d);
        
        //more special ones
        int i = 'a';
        char c = 1;
        
        int integer = new Integer(2);
                
        
    }
}
    