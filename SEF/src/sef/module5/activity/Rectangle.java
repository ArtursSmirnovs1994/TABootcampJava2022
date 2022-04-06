package sef.module5.activity;

 public class Rectangle extends Shape {


    public double lenght;
    public double breadth;

    public  Rectangle(double lenght,double breadth){
    this.lenght = lenght;
    this.breadth = breadth;
    }

    public double calculateArea(){
        return lenght*breadth;
    }
    public double calculatePerimeter(){
        return 2*(lenght+breadth);
    }
}
