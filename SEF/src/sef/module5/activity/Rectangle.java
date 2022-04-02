package sef.module5.activity;

public class Rectangle extends Shape {

    //Attributes
    private double length;
    private double breadth;

    //Behavior
    //Default constructor
    public Rectangle() {
        this.breadth = 3;
        this.length = 3;
    }

    //Parametrized constructor
    public Rectangle(double length, double breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
