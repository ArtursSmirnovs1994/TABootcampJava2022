package sef.module5.activity;

public class Circle extends Shape{
    public Circle() {
        /* Default no-parameters constructor*/
    }

    public Circle(double diameter) {
        /*Parameterized constructor*/
        this.diameter = diameter;
    }

    public Circle(double diameter, String color) {
        /*Parameterized constructor*/
        this.diameter = diameter;
        this.color = color;
    }

    private double diameter;
    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double calculateArea() {
        return diameter*diameter*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return diameter*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle of " +
                "area=" + calculateArea() +
                ", circumference=" + calculatePerimeter() +
                ", color=" + color;
    }
}
