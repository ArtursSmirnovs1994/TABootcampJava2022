package sef.module5.activity;

public class AbstractionActivity {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.setColor("red");
        System.out.println("Circle color is -" + circle.getColor());
        System.out.println("Circle radius is -" + circle.calculatePerimeter());
        System.out.println("Circle area is -" + circle.calculateArea());

        Rectangle rectangle = new Rectangle(6,8);
        rectangle.setColor("yellow");
        System.out.println("Rectangle color is -" + rectangle.getColor());
        System.out.println("Rectangle radius is -" + rectangle.calculatePerimeter());
        System.out.println("Rectangle area is -" + rectangle.calculateArea());

            }
}
