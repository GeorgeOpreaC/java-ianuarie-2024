package Homework11;
//Tema-11👏
//-Create a Java program where you define an integer variable with a value between 1 and 7. Use a switch statement to print the name of the corresponding day of the week. For example, if the variable has a value of 1, it should print "Monday".
//-Create a Java program that uses a while loop to find the sum of numbers from 1 to n, where n is a positive integer entered by the user.
//-Create a Java program that uses a do-while loop to print numbers from 10 to 1 in descending order.


import java.util.Scanner;

public class Hmw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Instert the number n:");
        int n= scanner.nextInt();

        int x = 1, S=0;
        while(x<=n){
            S = S+x;
            x++;
        }
        System.out.println("The sum of the above number is"+ S);
    }
}
