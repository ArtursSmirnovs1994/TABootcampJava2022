package sef.module5.activity;

public class Rectangle extends Shape {

    public Rectangle () {
        this.length = 4 ;
        this.breadth = 4 ;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    private double length;
    private double breadth;

    public double calculateArea (double length, double breadth) {
        double area = length * breadth;
        return area;
    }

    public double calculatePerimeter (double length, double breadth) {
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }

}
