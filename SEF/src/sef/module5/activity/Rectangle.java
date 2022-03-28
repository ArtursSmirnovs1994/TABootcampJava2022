package sef.module5.activity;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        /* Default no-parameters constructor*/
    }

    public Rectangle(double length, double width) {
        /*Parameterized constructor*/
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color) {
        /*Parameterized constructor*/
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle of" +
                " area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                ", color=" + color;
    }
}
