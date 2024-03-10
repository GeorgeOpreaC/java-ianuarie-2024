package Homework11;
//Tema-11👏

//-Create a Java program that uses a while loop to find the sum of numbers from 1 to n,
// where n is a positive integer entered by the user.



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
