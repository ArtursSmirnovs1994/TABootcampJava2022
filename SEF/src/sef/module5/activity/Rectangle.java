package sef.module5.activity;

public class Rectangle extends Shape{

    private double length;
    private double breadth;

    public Rectangle(){
        this.length = 5;
        this.breadth = 5;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }



    public double calculateArea() {
        return length * breadth;
    }


    public double calculatePerimeter() {
        return 2*(length + breadth);
    }
}
