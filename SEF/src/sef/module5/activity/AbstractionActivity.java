package sef.module5.activity;

public class AbstractionActivity {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setColor("yellow");
        System.out.println("Circle color is " + circle.getColor());
        System.out.println("Circle area is " + circle.calculateArea());
        System.out.println("Circle perimeter is " + circle.calculatePerimeter());

        System.out.println("--------------------------");

        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.setColor("purple");
        System.out.println("Rectangle color is " + circle.getColor());
        System.out.println("Rectangle area is " + circle.calculateArea());
        System.out.println("Rectangle perimeter is " + circle.calculatePerimeter());

    }
}




