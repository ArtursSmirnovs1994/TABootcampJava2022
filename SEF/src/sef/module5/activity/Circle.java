package sef.module5.activity;

public class Circle extends Shape {

    private double radius;

    //defaults:
    public Circle(){
        this.radius = 4;
    }

    //parametrized:
    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        double area = 0;
        area =  3.14 * radius * radius;
        return area;
    }

    public double calculatePerimeter(){
        double perim = 0;
        perim = 2*(3.14 * radius);
        return perim;
    }

}
