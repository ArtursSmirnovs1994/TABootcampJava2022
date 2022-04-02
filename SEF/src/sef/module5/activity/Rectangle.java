package sef.module5.activity;

public class Rectangle extends Shape {
    double length, breadth;

    // Default Constructor
    public Rectangle() {
        System.out.println("Rectangle constructor");
    }
    // parameterized constructor
    public Rectangle(double l, double b) {
        this.length=l;
        this.breadth=b;
        System.out.println("Length" + l + "and breadth is" + b);
    }
    //class functions
    public double calculateArea(){
        return this.length* this.breadth;
    }
    public double calculatePerimeter()
    {
        return 2*(this.length+ this.breadth);
    }

}
