package Homework14Homework15;

import java.util.ArrayList;

//-Create an ArrayList and add 5 elements to it. Determine and print the size of the ArrayList.
public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> Echipamente = new ArrayList<>();
        Echipamente.add("Echipament1");
        Echipamente.add("Echipament2");
        Echipamente.add("Echipament3");
        Echipamente.add("Echipament4");
        Echipamente.add("Echipament5");

        for (String Echipament : Echipamente){
            System.out.println(Echipament);

        }
        System.out.println(Echipamente.get(1));
        System.out.println("The size of the ArrayList is "+Echipamente.size());

    }
}
