package sef.module5.activity;

public class Rectangle extends Shape {
    //Attributes
    private double length;
    private double breadth;

    //Behavior
    //TODO: write default constructor
    public Rectangle(){
        System.out.println("I'm a Rectangle Constructor");
    }

    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("I'm a Rectangle Constructor: " + length + ", " + breadth);
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    public double CalculateArea(){
        double Area = this.length * this.breadth;
        return Area;
    }

    public double CalculatePerimeter(){
        double Perimeter = 2* (this.length + this.breadth);
        return Perimeter;
    }

}
