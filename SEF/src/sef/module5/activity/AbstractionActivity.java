package sef.module5.activity;

public class AbstractionActivity {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setBreadth(6);
        rectangle.setColor("blue");

        Circle circle = new Circle();
        circle.setColor("red");
        circle.setRadius(10);


        System.out.println("Circle color is " + circle.getColor());
        System.out.println("Circle area is " + circle.calculateArea());
        System.out.println("Circle perimeter is " + circle.calculatePerimeter());

        System.out.println("Rectangle length is " + rectangle.getLength());
        System.out.println("Rectangle breadth is " + rectangle.getBreadth());
        System.out.println("Rectangle color is " + rectangle.getColor());
    }
}
