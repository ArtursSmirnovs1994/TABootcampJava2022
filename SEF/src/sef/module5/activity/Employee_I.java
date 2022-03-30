package sef.module5.activity;

import sef.module5.sample.inheritance.Person_I;

//TODO: extend Employee_I to Person_I.
public class Employee_I extends Person_I {

	//Attributes
	private double salary;
	private String title;

	//Behavior
	//TODO: write default constructor. Print 'I'm an Employee_I Constructor'
	public Employee_I() {
		this.salary = 0;
		this.title = "none";
		System.out.println("I'm an Employee_I Constructor");
	}

	//TODO: write getter for int salary
	public double getSalary() {
		return salary;
	}

	//TODO: write setter for int salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	//TODO: write getter for String title
	public String getTitle() {
		return title;
	}

	//TODO: write setter for String title
	public String setTitle(String title) {
		return this.title = title;
	}
}
