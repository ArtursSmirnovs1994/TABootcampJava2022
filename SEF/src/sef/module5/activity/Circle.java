package sef.module5.activity;

public class Circle extends Shape {
    //Attributes
    private double side;

    //Behavior
    //TODO: write default constructor
    public Circle(){
        System.out.println("I'm a Circle Constructor");
    }

    public Circle(double side){
        this.side=side;
        System.out.println("I'm a Circle Constructor: " + side);
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
        double Area = this.side * this.side * 3.14;
        return Area;
    }

    public double CalculatePerimeter(){
        double Perimeter = 2* this.side * 3.14;
        return Perimeter;
    }

}
