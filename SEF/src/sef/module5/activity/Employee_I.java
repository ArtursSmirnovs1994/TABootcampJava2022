package sef.module5.activity;

//TODO: extend Employee_I to Person_I.
public class Employee_I  {
	
	//Attributes
	private double salary;
	private String title;
	private String name;
	private int age;
	
	//Behavior
	//TODO: write default constructor. Print 'I'm an Employee_I Constructor'
	public Employee_I() {
		this.salary = 0;
		this.title = "Unknown";
		this.age = 0;
		this.name = "none";
		System.out.println("I'm an Employee_I Constructor");
	}

		//TODO: write getter for int salary


		//TODO: write setter for int salary


		//TODO: write getter for String title


		//TODO: write setter for String title


		public double getSalary () {
			return salary;
		}

		public String getTitle () {
			return title;
		}

		public void setSalary ( double salary){
			this.salary = salary;
		}

		public void setTitle (String title){
			this.title = title;
		}

		public int getAge () {
			return age;
		}

		public void setAge ( int age){
			this.age = age;
		}

		public String getName () {
			return name;
		}

		public void setName (String name){
			this.name = name;
		}
	}