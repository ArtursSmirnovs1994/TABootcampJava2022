package sef.module5.activity;

public class AbstractionActivity {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.setColor("red");
        System.out.println("Circle color is " + circle.getColor());
        System.out.println("Circle area is " + circle.calculateArea());
        System.out.println("Circle perimeter is " + circle.calculatePerimeter());


        Rectangle rectangle = new Rectangle(8,7);
        rectangle.setColor("blue");
        System.out.println("Rectangle color is " + rectangle.getColor());
        System.out.println("Rectangle perimiter is " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area is " + rectangle.calculateArea());

    }
}
