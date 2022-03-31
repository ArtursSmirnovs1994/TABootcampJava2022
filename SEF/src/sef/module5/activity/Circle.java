package sef.module5.activity;

public class Circle extends Shape {

    public double radius;

    public Circle() {
        this.radius = 3;

    }

    public double calculateArea() {
        return 0;
    }

    public Circle(double radius) {

        this.radius = radius;
    }


    public double calculatePerimeter() {
        return 2*3.14*radius;
    }

}


