package com.satyam.oca.chap3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author satyam
 */
public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyyyy-MMMM-dd hh:mm:ss");
        String nowString1 = formatter.format(now);
        System.out.println("The formatter datetime 1: " + nowString1);
        
        String nowString2 = now.format(formatter);
        System.out.println("The formatter datetime 2: " + nowString2);
               
    }
}
