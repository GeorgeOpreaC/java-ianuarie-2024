package Curs.Homework7;
//Tema-7👏

//3. Create a Java program where you define an integer variable with a value of 75. Use an if-else-if ladder to check the range in which the number falls. Use the ranges 0-50, 51-100, and 101-150, and print a message for each range specifying which range the number falls into.
public class Ex3 {
    public static void main(String[] args) {

        int number = 75;
        if (number >= 0 && number <= 50)
        {
            System.out.println("The number is in ranger 0-50");
        } else if (number >= 51 && number <= 100)  {
            System.out.println("The number is in ranger 51-100");
        } else if  (number >= 101 && number <= 150) {
            System.out.println("The number is in ranger 101-150");

        }else{
            System.out.println("the number is not any the specified ranger");

        }

    }
}