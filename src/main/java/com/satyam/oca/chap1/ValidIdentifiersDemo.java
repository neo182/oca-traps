package com.satyam.oca.chap1;

/**
 *
 * @author satyam
 */
public class ValidIdentifiersDemo {

    public static void main(String[] args) {
        int $var1 = 1;
        int £var2 = 1;
        int Ææ = 22;
        int Øø = 123;
        String ¥to£And$¢ = "Something strange";
        System.out.println("£var2 : " + £var2);
        System.out.println("Æa : " + Ææ);
        System.out.println("Øø : " + Øø);
        System.out.println("¥to£And$¢ : " + ¥to£And$¢);

    }
}
