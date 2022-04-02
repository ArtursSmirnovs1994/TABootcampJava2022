package sef.module5.activity;


import javax.naming.Name;

public class Person_I {

	//Attributes
	private String name;
	private int age;

	//Behavior
	//TODO: write default constructor. Print 'I'm Person_I constructor'
	Person_I(){
		System.out.println("I'm Person_I constructor");
	}

	//TODO: Write parameterized constructor with variables name and age
	Person_I(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("I'm" +name +"of age"+ age);


	}
	//TODO: write getter for String name
	public String getName()
	{
		return name;
	}

	//TODO: write setter for String name
	public void setName(String n)
	{

		// This keyword refers to current instance itself
		this.name = n;
	}

	//TODO: write getter for int age
	public int getAge()
	{
		return age;
	}

	//TODO: write setter for int age
	public void setAge(int I)
	{

		// This keyword refers to current instance itself
		this.age = I;
	}
}

