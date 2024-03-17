package Homework14Homework15;

import java.time.LocalDate;
import java.time.LocalDateTime;

//-Add 5 hours and 30 minutes to the current time and print it.
public class Ex1 {
    public static void main(String[] args) {
        LocalDate dataActuala= LocalDate.now();
        System.out.println(dataActuala);

        LocalDateTime dataActuala5ore = dataActuala.atStartOfDay().plusHours(5).plusMinutes(30);
        System.out.println("Data actuala este " +dataActuala5ore);


    }
}
