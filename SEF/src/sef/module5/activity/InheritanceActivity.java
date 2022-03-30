package sef.module5.activity;

public class InheritanceActivity {

	public static void main(String[] args) {

		// Create Person object p. Write code to and set name of Person as Sarah Johnson
		// and age as 21

		Person_I myPerson = new Person_I();
		myPerson.setAge(21);
		myPerson.setName("Sarah Johnson");

		System.out.println("-----------------------------");
		//Create Employee object e and 
		// set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
		Employee_I myEmployee = new Employee_I();
		myEmployee.setName("Sarah Cun");
		myEmployee.setAge(32);
		myEmployee.setSalary(70000);
		myEmployee.setTitle("Developer");

		// Print Info using Employee object
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + myEmployee.getName());
		System.out.println("Employee's Age is    : " + myEmployee.getAge());
		System.out.println("Employee's Title is  : " + myEmployee.getTitle());
		System.out.println("Employee's Salary is : " + myEmployee.getSalary());
	}
}
