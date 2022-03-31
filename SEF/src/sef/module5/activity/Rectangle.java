package sef.module5.activity;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    //defaults:
    public Rectangle(){
        this.length = 4;
        this.breadth = 4;
    }

    //parametrized:
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea(){
        double area = 0;
        area =  length * breadth;
        return area;
    }

    public double calculatePerimeter(){
        double perim = 0;
        perim = 2*(length + breadth);
        return perim;
    }

}
