package com.satyam.oca.chap2;

/**
 *
 * @author satyam
 */
public class PrimitiveParserDemo {

    public static void main(String... args) {
        String[] booleanStrings_true = {"true", "True", "TrUe", "trUE"};
        printBoolean(booleanStrings_true);

        System.out.println("===================================================");
        String[] booleanStrings_false = {"false", "False", "FALSE", "FAL", "TRU", "TRUEE", "!true", "#true"};
        printBoolean(booleanStrings_false);

        String[] integerStrs = {"1_1", "100l", "0x100"}; //each of them are invalid strings to be parsing
        printInteger(integerStrs);
        
        
        String numStr = "22.0f";
        System.out.println("numStr : " + numStr + " parsed float/double : " + Double.parseDouble(numStr));
        
        System.out.println("No. of bytes : " + Integer.BYTES);
        System.out.println("No. of bits : " + Integer.SIZE);
        System.out.println("Type : " + Integer.TYPE);
        
        System.out.println(new Float("22.2F"));
        
//        String numLong = "233L"; //thows Exception
//        System.out.println("numLong : " + Long.parseLong(numLong));
    }

    public static void printBoolean(String[] args) {
        for (String s : args) {
            System.out.println("str " + s + " : parsedValue : " + Boolean.parseBoolean(s));
        }
    }

    public static void printInteger(String[] args) {
        for (String s : args) {
            try {
                System.out.println("str " + s + " : parsedInteger : " + Integer.parseInt(s));
            } catch(NumberFormatException e){
                System.out.println("Invalid string to be parsed into integer : " + s);
            }
        }
    }
}
