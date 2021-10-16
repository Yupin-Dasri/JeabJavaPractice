package javaPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        DateTimeFormatter fmdt = DateTimeFormatter.ofPattern("MM/dd/YYYY, hh:mm a, EEE");


        LocalDate day1 = LocalDate.of(1987,12,25);
        System.out.println(day1.format(dtf));

        LocalDateTime day2 = LocalDateTime.of(1992,1,29,9,30);
        System.out.println(day2.format(fmdt).replaceFirst("AM","am"));

        /**
         i love you

         */


    }
}
