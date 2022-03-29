package sef.module5.activity;


//TODO: extend Employee_I to Person_I.
public class Employee_I extends Person_I {
	
	//Attributes
	private double salary;
	private String title;
	
	//Behavior default constructor
	//TODO: write default constructor. Print 'I'm an Employee_I Constructor'
	public Employee_I() {System.out.println("I'm Employee_I constructor");}
	
	//TODO: write getter for int salary
	public double getSalary() {return salary;}
	
	//TODO: write setter for int salary
	public void setSalary(double salary) {this.salary = salary;}
	
	//TODO: write getter for String title
	public String getTitle() {return title;}
	
	//TODO: write setter for String title
	public void setTitle(String title) {this.title = title;}

	public void announce(){
		super.announce();  // calls announce() method of Person class
		System.out.println("Inside Employee Class");
	}

}