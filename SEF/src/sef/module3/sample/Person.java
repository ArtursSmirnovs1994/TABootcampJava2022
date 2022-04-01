package sef.module3.sample;

public class Person {

	//Attributes
	private String name;
	
	
	//Constructor
	public Person(String name){
		this.name = name;
	}

	// Constructor to person without name set at the point of construction (Lauma comment)
	public Person() {
	}

	//Behavior
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String introduce(){
		return "My name is " + name;
	}
	
}
