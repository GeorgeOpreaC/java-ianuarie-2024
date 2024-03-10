package Homework13;

import java.time.LocalDate;

//Write a program that prints the current date.
//-Print the date that will be after 10 days from today.
public class Ex3 {
    public static void main(String[] args) {
        LocalDate dataCurenta = LocalDate.now();
        System.out.println(dataCurenta);

        LocalDate dateafter = LocalDate.now().plusDays(10);
        System.out.println(dateafter);


    }
}
