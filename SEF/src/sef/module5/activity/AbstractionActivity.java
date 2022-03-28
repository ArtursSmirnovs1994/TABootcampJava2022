package sef.module5.activity;

public class AbstractionActivity {
    public static void main(String[] args) {
        Circle circle = new Circle();
        printShape(circle);

        Circle circle2 = new Circle(5);
        printShape(circle2);

        Circle circle3 = new Circle(3,"0xFF0000");
        printShape(circle3);

        Rectangle rectangle = new Rectangle(10,2, "0xBADBED");
        printShape(rectangle);

        Rectangle rectangle2 = new Rectangle();
        printShape(rectangle2);

        rectangle2.setLength(5);
        printShape(rectangle2);

        rectangle2.setWidth(8);
        printShape(rectangle2);

        rectangle2.setColor("0x777777");
        printShape(rectangle2);
    }

    static int index = 1;
    public static void printShape(Shape shape) {
        System.out.printf("%d) %s  \n", index++, shape);
    }
}
