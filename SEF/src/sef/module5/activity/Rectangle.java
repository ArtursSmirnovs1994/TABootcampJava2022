package sef.module5.activity;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;  //Parameters
        this.width = width;
    }

    public Rectangle() {  //Default
        this.length = 4;
        this.width = 4;
    }


    public double calculateArea() {
        return length * width;
    }


    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
