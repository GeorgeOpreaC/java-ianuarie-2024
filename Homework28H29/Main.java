package Homework28H29;
//Java's built-in date/time libraries ,
// generate a list of all Mondays in the upcoming year. Print out each Monday's date.

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Obtinem data curenta
        LocalDate currentDate= LocalDate.now();
        //Obtinem anul urmator
        int newYear = currentDate.getYear()+1;
        //Lista in care vom stoca toate lunile din anul urmator.
        List<LocalDate> allMondays = new ArrayList<>();

        //Iteram prin fiecare zi din anul urmator
        LocalDate LocalDate = java.time.LocalDate.of(newYear, 1, 1);
        while (currentDate.getYear()== newYear){
            //Verificam daca ziua este luni
            if (currentDate.getDayOfWeek()== DayOfWeek.MONDAY){
                allMondays.add(currentDate);
            }
            //Urmatoarea zi
            currentDate= currentDate.plusDays(1);
        }
        //Afisam toate lunile gasite
        System.out.println("Toate lunile din urmatorul an: " + allMondays);
        for (LocalDate monday : allMondays) {
            System.out.println(monday);
        }
    }
}
