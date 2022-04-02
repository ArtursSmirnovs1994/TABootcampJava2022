package sef.module5.activity;

//TODO: change Shape class to abstract
public abstract class Shape {

	public String color;

	public Shape() {
	}

	//TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double
	abstract double calculateArea();
	abstract double calculatePerimeter();

	public void setColor(String c) {

		color = c;
	}
	public String getColor()
	{
		return color;
	}



}
