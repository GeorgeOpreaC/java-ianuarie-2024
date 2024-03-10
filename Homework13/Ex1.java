package Homework13;
// -Create a Java program that uses a StringBuilder to concatenate an array of strings.
// The program should print the final concatenated string. (methods: append())


public class Ex1 {
    public static void main(String[] args) {
         String[] arraynNou=  {"Vacanta","Soare","Plaja"};
         StringBuilder stringbuilder = new StringBuilder();
         for (String deCuvant:arraynNou){
             stringbuilder.append(deCuvant);
         }
        System.out.println(stringbuilder);
    }
}
