package Hmw8;

import java.util.Scanner;

//
//-Create a simple program that takes a number as input and uses if-else statements to categorize the number as "positive," "negative," or "zero."
public class Homework8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is 0");
        }

    }

}


