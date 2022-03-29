package sef.module5.activity;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}
