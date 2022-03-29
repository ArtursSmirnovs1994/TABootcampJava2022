package sef.module5.activity;

public class Circle extends Shape{

    private double radius;

    public Circle(){
        this.radius = 5;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return 3.14 * radius * radius;
    }

    public double calculatePerimeter(){
        return 2 * 3.14 * radius;
    }

    // testas
}
