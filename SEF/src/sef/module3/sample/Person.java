package sef.module3.sample;

public class Person {

	//Attributes
	private String name;
	
	
	//Behavior
	public Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String introduce(){
		return "Can the real " + name + " please stand up!";
	}
	
}
