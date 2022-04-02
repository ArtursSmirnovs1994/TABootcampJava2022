package sef.module5.activity;

public class AbstractionActivity {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.setColor("green");
        System.out.println("Circle color is " + rectangle.getColor());
        System.out.println("Circle Area is " + rectangle.calculateArea());
        System.out.println("Circle Perimeter is " + rectangle.calculatePerimeter());

        Circle circle = new Circle(5);
        circle.setColor("blue");
        System.out.println("Circle color is " + circle.getColor());
        System.out.println("Circle Area is " + circle.calculateArea());
        System.out.println("Circle Perimeter is " + circle.calculatePerimeter());
    }
}
