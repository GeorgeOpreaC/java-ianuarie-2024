package Homework9;
//Tema-9🤩🫣
//-Create a program that defines a string variable with a value of "Hello".
// Use nested if statements to first check if the length of the string is greater than 5.
// If it is not, check if the string equals "Hello" and print the appropriate message in each case.

public class Homework91 {
    public static void main(String[] args) {

        String name = "Hello";
       if (name.length()>5){
           System.out.println("The string is greater than 5");
       }
     else {
         if (name=="Hello"){
             System.out.println("The string is 'Hello'");
         }
           System.out.println("The string is not greater than 5");
       }
    }
}
