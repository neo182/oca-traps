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
        //All string that matches 'false' and all those DOES NOT match 'true' are parsed to false
        String[] booleanStrings_false = {"false", "False", "FALSE", "FAL", "TRU", "TRUEE", "!true", "#true"};
        printBoolean(booleanStrings_false);

        String[] integerStrs = {"1_1", "100l", "0x100"}; //each of them are invalid strings to be parsing
        printInteger(integerStrs);
        
        
        String numStr = "22.0f";
        System.out.println("numStr : " + numStr + " parsed float/double : " + Double.parseDouble(numStr));
        
        System.out.println("No. of bytes : " + Integer.BYTES);
        System.out.println("No. of bits : " + Integer.SIZE);
        System.out.println("Type : " + Integer.TYPE);
        
        int ii = -0B1_11;
        
        //OBS. It is allowed to used character F and D in float-string and double-string to be parsed but not 'L' in case of Long
        System.out.println(new Float("22.2F"));
        System.out.println(Float.parseFloat("22.2F"));
        System.out.println(new Double("22.2d"));
        System.out.println(Double.parseDouble("22.2d"));
        //The following two lines are invalid:
        // System.out.println(new Long("22L"));
        //System.out.println(Long.parseLong("22L"));
        
        //Uncommenting following lines throws NumberFormatException
//        String numLong = "233L"; 
//        System.out.println("numLong : " + Long.parseLong(numLong)); //thows Exception
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
