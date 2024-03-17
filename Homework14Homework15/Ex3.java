package Homework14Homework15;

import java.util.Random;

//-Generate a random integer between 1 and 100.
public class Ex3 {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println(random.nextInt(1,100));
    }
}
