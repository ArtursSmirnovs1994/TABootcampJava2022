package sef.module5.activity;

public class AbstractionActivity {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5.0, 6.0);

        rectangle.setColor("purple");

        System.out.println("rectangle color is " + rectangle.getColor());
        System.out.println("rectangle area is " + rectangle.calculateArea());
        System.out.println("rectangle perimeter is " + rectangle.calculatePerimeter());

        System.out.println();

        Shape circle = new Circle(5.0);

        circle.setColor("transparent");

        System.out.println("circle color is " + circle.getColor());
        System.out.println("circle area is " + circle.calculateArea());
        System.out.println("circle perimeter is " + circle.calculatePerimeter());

    }

}
