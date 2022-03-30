package sef.module5.activity;

public class AbstractionActivity {
    public static void main(String[] args) {
        Rectangle R = new Rectangle(5,6);
        R.setColor("Blue");

        System.out.println("Area: " + R.CalculateArea());
        System.out.println("Perimeter: " + R.CalculatePerimeter());
        System.out.println("Color: " + R.color);

        Circle C = new Circle(5);
        C.setColor("Yellow");

        System.out.println("Area: " + C.CalculateArea());
        System.out.println("Perimeter: " + C.CalculatePerimeter());
        System.out.println("Color: " + C.color);
    }
}