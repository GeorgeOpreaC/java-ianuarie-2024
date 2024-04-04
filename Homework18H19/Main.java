package Homework18H19;
//Tema-18-19🤠 :
//Problem Statement:
//Design a class named Rectangle that contains:
//Two private double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
//A no-arg constructor that creates a default rectangle.
//A constructor that creates a rectangle with the specified width and height.
//A method named getArea() that returns the area of this rectangle.
//A method named getPerimeter() that returns the perimeter.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle();
        Rectangle rectangle2= new Rectangle(3.5,4.5);
        System.out.println("Rectangle 1: ");
        System.out.println("Width: "+rectangle1.getWidth());
        System.out.println("Height: "+rectangle1.getHeight());
        System.out.println("Area : "+rectangle1.getArea());
        System.out.println("Perimeter: "+rectangle1.getPerimeter());

        System.out.println("/nRectangle2: ");
        System.out.println("Width: "+rectangle2.getWidth());
        System.out.println("Height: "+ rectangle2.getHeight());
        System.out.println("Area: "+rectangle2.getArea());
        System.out.println("Perimeter: "+rectangle2.getPerimeter());

    }



}
