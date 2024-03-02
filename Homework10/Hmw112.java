package Homework10;

import java.util.Scanner;

public class Hmw112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number");
        int number = scanner.nextInt();

        switch (number > 100 ? 1 : 0) {
            case 1:
            System.out.println("The number is greater than 100");
            break;
            default:
                System.out.println("The number is not greater than 100");
                break;

        }
    }
}
