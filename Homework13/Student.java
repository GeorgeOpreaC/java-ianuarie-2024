package Homework13;
//Tema-13🥳 :
//-Create a Java program that uses a StringBuilder to concatenate an array of strings. The program should print the final concatenated string. (methods: append())
//-Create a class named Student with name and age fields. Write a method to display the details of a student.

public class Student {
    String name;
    int age;

    public Student( String nameP, int ageP){
        this.name= nameP;
        this.age= ageP;

    }
    public void display(){
        System.out.println("Numele studentului este "+name);
        System.out.println("Varsta studentului este "+age);

    }
}

