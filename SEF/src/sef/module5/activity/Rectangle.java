package sef.module5.activity;

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle() {System.out.println("Rectangle constructor");

        this.length = 1;
        this.breadth = 5;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length + breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
