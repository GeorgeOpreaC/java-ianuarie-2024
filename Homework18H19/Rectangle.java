package Homework18H19;

public class Rectangle {

    //Two private double data.
    private double width;
    private double height;
     //Default constructor.
    public Rectangle(){
        this.width= 1.0;
        this.height= 1.0;
    }
    //Constructor with specified width and height.
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    //Method to get are of rectangle.
    public double getArea(){
        return width*height;
    }
    //Method to get perimeter of the rectangle
    public double getPerimeter(){
        return (width+height)*2;
    }
    //Getter method for width;
    public double getWidth(){
        return width;
    }
    //Getter method for height.
    public double getHeight(){
        return height;
    }
    //Setter method for width.
    public void setWidth(double width){
        this.width=width;
    }
    //Setter method for height.
    public void setHeight(double height){
        this.height=height;
    }

    }

