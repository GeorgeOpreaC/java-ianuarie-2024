package Homework14Homework15;

import java.util.Random;

//Choose a random element from the array {"apple", "banana", "cherry", "date"}.
public class Ex4 {
    public static void main(String[] args) {

        String[] array = {"apple", "banana", "cherry", "date"};

        Random random = new Random();
        String randomElement = array[random.nextInt(array.length)];
        System.out.println(randomElement);
    }
}
