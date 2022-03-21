package sef.module5.sample;

import sef.module5.sample.polymorphism.Person_P;
import sef.module5.sample.polymorphism.Student_P;

public class VirtualMethodSample {
	public static void main(String arg[]){
		Person_P p = new Person_P();
		p.setName("John Doe");
		
		//Student inherits the methods and behavior from the Person class
		Student_P s = new Student_P();
		s.setName("Jane Doe");
	
		s.setSchool("A Fictional School");
		s.setGrade(10);
	
		rollCall(p);
		rollCall(s);
	}
	
	public static void rollCall(Person_P temp){
			temp.announce();
	}
}
