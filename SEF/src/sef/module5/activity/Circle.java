package sef.module5.activity;

public class Circle extends Shape {
    private double radius;

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;

    }


    public Circle() {
        this.radius = 5;
    }

    @Override
    public double calculateArea() {
        return 3.14 * (radius * radius);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
