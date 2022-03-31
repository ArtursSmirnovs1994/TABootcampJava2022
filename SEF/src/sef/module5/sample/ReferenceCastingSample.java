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
		Person_P tempPerson = new Student_P(); // convert student to person
		tempPerson.setAge(28);
		tempPerson.setName("Arturs");
		System.out.println("Convert upcasting person attributes \n name: " + tempPerson.getName() + "\n age: " + tempPerson.getAge() );
		Student_P tempStudent = (Student_P)tempPerson; // convert person to student
		System.out.println("*********************************************************");
		tempStudent.setGrade(11);

		System.out.println("Convert downcasting students attributes \n name: " + tempStudent.getSchool() +
				" \n students age: " + tempStudent.getAge() + "\n school: " + tempStudent.getSchool() +
				"\n grade: " + tempStudent.getGrade());
	}
}
