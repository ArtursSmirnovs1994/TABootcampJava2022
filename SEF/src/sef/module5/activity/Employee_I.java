package sef.module5.activity;

public class Employee_I extends Person_I {
	
	//Attributes
	private double salary;
	private String title;

	public Employee_I() {
		System.out.println("I'm an Employee_I Constructor");
	}

	public Employee_I(String name, int age, String title, double salary) {
		super(name, age);
		this.salary = salary;
		this.title = title;
	}

	//Behavior
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
