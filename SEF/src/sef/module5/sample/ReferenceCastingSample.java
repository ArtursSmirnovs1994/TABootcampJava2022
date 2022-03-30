package sef.module5.sample;

import sef.module5.sample.polymorphism.Person_P;
import sef.module5.sample.polymorphism.Student_P;

public class ReferenceCastingSample {

	public static void main(String arg[]){

		Student_P student = new Student_P();
		student.setName("Jane Doe");
		student.setSchool("A Fictional School");
		student.setGrade(10);
		student.setAge(21);

		// Sample reference casting
		Person_P tempPerson = new Student_P();
		tempPerson.setAge(28); // convert student to person
		System.out.println(("Converted person attributes \n name":" + tempPerson.getName() + \nage");
		Student_P tempStudent = (Student_P) tempPerson; // convert person to student
		System.out.println("***********");
		tempStudent.announce();
	}
}
