package Curs.Homework7;
 // Create a program that defines a string variable with a value of "Hello". Use nested if statements to first check if the length of the string is greater than 5. If it is not, check if the string equals "Hello" and print the appropriate message in each case.
public class Ex2 {
    public static void main(String[] args) {

          String text = " Hello";
          if ( text.length ()>5) {
              System.out.println(" The string length is greater than 5");


          } else if ( text.equals("Hello")) {

              System.out.println("The string equals'Hello'");

          } else {
              System.out.println("The string length is not greater than 5 and is not equals 'Hello'");

          }

    }
}
