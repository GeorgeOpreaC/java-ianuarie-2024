package Homework12;



//-Create a Java program to find and print the length of a given string
//-Create a Java program that finds and prints the character at a given index(2) in a string.
//-Create a Java program that finds and prints the index of the first occurrence of a character in a string.
//-Create a Java program that prints a substring of a given string from a specified start index(1) to end index(3).
//-Create a Java program that converts a given string to uppercase and lowercase and prints both outputs.
public class Ex1 {
    public static void main(String[] args) {

        String str="Spring";
        System.out.println(str.length());

        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('i'));
        System.out.println(str.substring(1,3));
        System.out.println(str.toUpperCase()+"  "+str.toLowerCase());

    }
}
