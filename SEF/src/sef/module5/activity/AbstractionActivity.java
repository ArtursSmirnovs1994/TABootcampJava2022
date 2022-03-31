package sef.module5.activity;

public class AbstractionActivity {
    public static void main(String[] args) {
        Rectangle rect= new Rectangle(5,6);
        rect.setColor("Red");

        System.out.println("Colour of my Rectangle is " + rect.getColor());
        System.out.println("Area of my rectangle is " +rect.calculateArea());
        System.out.println("Perimeter of my rectangle is " +rect.calculatePerimeter());
    }
}
