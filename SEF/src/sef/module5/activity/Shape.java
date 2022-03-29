package sef.module5.activity;

//TODO: change Shape class to abstract
public abstract class Shape {

	public String color;

	public Shape() {
		this.length = "unknown";
	}

}
	//TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double

	public abstract void calculateArea();
	public abstract double calculatePerimeter();
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	


