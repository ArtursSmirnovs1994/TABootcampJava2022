package sef.module5.sample;

import sef.module5.sample.polymorphism.Person_P;
import sef.module5.sample.polymorphism.Student_P;

public class ReferenceCastingSample {

	public static void main(String arg[]){
		
		Student_P s = new Student_P();
		s.setName("Jane Doe");
		s.setSchool("A Fictional School");
		s.setGrade(10);
		
		// Sample reference casting
		//upcasting example
		Person_P tempPerson = s; // convert student to person
		tempPerson.announce();

		//downcasting example
		Student_P tempStudent = (Student_P)tempPerson; // convert person to student
		tempStudent.announce();
	}
}
