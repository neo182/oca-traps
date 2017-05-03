package com.satyam.oca.chap3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author satyam
 */
public class CollectionSortDemo {

    public static void main(String[] args) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
        
        LocalDate currentDate = LocalDate.now();
      // System.out.println("currentDate :" + currentDate.format(formatter1));
        
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime : " + currentTime);
        
        LocalDateTime currentDateTime = LocalDateTime.of(currentDate, currentTime);
        System.out.println("currentDateTime : " + currentDateTime);
        
        Period period = Period.ofDays(1);
        LocalDateTime newDateTime = currentDateTime.minus(period);
        System.out.println("newDateTime : " + newDateTime.format(formatter1));
        
        Duration duration = Duration.ofHours(1);
        System.out.println(currentDateTime.plus(duration));

    }
}
