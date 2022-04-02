package sef.module5.activity;

public class Circle extends Shape {

    //Attributes
    private double radius;

    //Behavior
    //Default constructor
    public Circle() {
        this.radius = 3;
    }

    //Parametrized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * (radius * radius);
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}
