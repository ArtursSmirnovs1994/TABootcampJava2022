package sef.module5.activity;

public class AbstractionActivity {

    public static void main(String[] args) {

        sef.module5.activity.Shape circle = new Circle(5);
        circle.setColor("red");
        sef.module5.activity.Shape rect = new Rectangle(5,6);
        rect.setColor("blue");


        System.out.println("Circle color is "+ circle.getColor());
        System.out.println("Circle area is "+ circle.calculateArea());
        System.out.println("Circle perimeter is "+ circle.calculatePerimeter());

        System.out.println("Rectangle color is "+ rect.getColor());
        System.out.println("Rectangle area is "+ rect.calculateArea());
        System.out.println("Rectangle perimeter is "+ rect.calculatePerimeter());




    }
}
