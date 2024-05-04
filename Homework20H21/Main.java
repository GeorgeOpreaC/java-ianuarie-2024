package Homework20H21;

import java.util.ArrayList;

//-Create a class named ListManager.
// In this class, create a method named initializeList which takes no parameters
// and returns an ArrayList of integers.
// The method should create an ArrayList, add the integers 1 to 5 to the list, and then return the list.
public class Main {
    public static void main(String[] args) {
        ListManager manager= new ListManager();
        ArrayList<Integer> myList = manager.initializeList();
        System.out.println("Initialized List: "+myList);
    }
}
