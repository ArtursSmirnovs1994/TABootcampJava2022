package sef.module5.activity;

public abstract class Circle extends Shape {

    public double radius;

    public Circle() {
        this.radius = 3;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatorPerimeter() {
        return 2 * 3.14 * radius;
    }

    public double calculatorArea() {
        return 3.14 * (radius * radius);
    }
}
