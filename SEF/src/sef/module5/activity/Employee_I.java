package sef.module5.activity;

//TODO: extend Employee_I to Person_I.
public class Employee_I extends Person_I {


	//Attributes
	private double salary;
	private String title;

	//Behavior
	//TODO: write default constructor. Print 'I'm an Employee_I Constructor'
	public Employee_I(){
		this.salary = 0;
		this.title = "Default";
		System.out.println("I'm Employee_I constructor");
	}



	//TODO: write getter for int salary

	
	//TODO: write setter for int salary

	
	//TODO: write getter for String title
	
	
	//TODO: write setter for String title


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
