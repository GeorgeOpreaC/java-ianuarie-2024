package Curs13;
//-Write a program that prints the current date and time.
//-Add 5 hours and 30 minutes to the current time and print it.
//-From a given LocalDateTime, extract the date and time and print them separately.
// (methods: toLocalDate(), toLocalTime())
//-Check if a given date-time is before or after the current date-time.
// (methods: LocalDateTime.of(), isBefore() )
//-Convert a string representing date-time in the format yyyy-MM-dd HH:mm to LocalDateTime.
//-Generate a random integer between 1 and 300.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Challenge {
    public static void main(String[] args) {

        LocalDate dataCurenta = LocalDate.now();
        System.out.println(dataCurenta);

        LocalDateTime dataCurenta5ore = dataCurenta.atStartOfDay().plusHours(5).plusMinutes(30);
        System.out.println("Data curenta este " + dataCurenta5ore);

        LocalDateTime dataexactaf = LocalDateTime.now();
        LocalDate nume = dataexactaf.toLocalDate();
        LocalTime altnume = dataexactaf.toLocalTime();
        System.out.println("Am extras data :" + nume);
        System.out.println("Am extras timpul: " + altnume);

        LocalDateTime ceva = LocalDateTime.of(2024, 03, 30, 10, 20, 54, 1000);
        System.out.println(ceva.isBefore(dataexactaf));
        System.out.println(dataexactaf.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));


        Random numereRandom = new Random();
        System.out.println(numereRandom.nextInt(1, 300));




    }
}
