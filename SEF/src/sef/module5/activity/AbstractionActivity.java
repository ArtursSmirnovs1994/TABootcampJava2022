package sef.module5.activity;

public class AbstractionActivity {
    public static void main (String[] args ) {
        Circle circle = new Circle(5);
        circle.setColor("red");
        System.out.println("Circle colour is " + circle.getColor());
        System.out.println("Circle area is " + circle.calculateArea());
        System.out.println("Circle perimeter is " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(5,5);
        rectangle.setColor("green");
        System.out.println("Rectangle colour is " + rectangle.getColor());
        System.out.println("Rectangle area is " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter is " + rectangle.calculatePerimeter());


    }
}
