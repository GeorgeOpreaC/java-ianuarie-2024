package Hmw8;

import java.util.Scanner;

//Create a program that takes three numbers as input and print the largest number among them.
public class Homework83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Insert the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Insert the third number: ");
        int number3 = scanner.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("The first number is the largest");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The second number is the largest");

        } else {
            System.out.println("The third number is the largest");
        }
    }
}
