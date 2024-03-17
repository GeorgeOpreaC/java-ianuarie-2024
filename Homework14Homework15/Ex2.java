package Homework14Homework15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//-From a given LocalDateTime, extract the date and time and print them separately.
public class Ex2 {
    public static void main(String[] args) {

        LocalDateTime dataExacta = LocalDateTime.now();
        LocalDate ceva = dataExacta.toLocalDate();
        LocalTime Altceva = dataExacta.toLocalTime();
        System.out.println("Am extras data "+ceva);
        System.out.println("Am extras timpul "+ Altceva);


    }
}
