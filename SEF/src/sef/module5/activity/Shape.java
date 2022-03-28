package sef.module5.activity;

public abstract class Shape {

	public String color;
	
	public Shape() {
//		this.color = "0xFFFFFF";
	}
	
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	

}
