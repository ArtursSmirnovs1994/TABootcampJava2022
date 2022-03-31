/**
 *
 */
package sef.module2.activity;

import sef.module5.activity.Employee_I;

/**
 * @author
 *
 */
public class Calculator {

	public static void main(String[] args) {

		Employee_I e = new Employee_I("Robert", 21, 2000.95, "Programmer");
		Employee_I p = new Employee_I("Jacob", 67, 4500.95, "Director");

	int x = 10;
	int y = 5;

	int[] nums = {1, 2, 3, 4};

	System.out.println("Addition - " + add(x,y));
	System.out.println("Subtraction - " + subtract(x,y));
	System.out.println("Multiply - " + multiply(nums));
	System.out.println("Divide - " + divide(x,y));

		//print info using Employee object
		System.out.println("----------------------------------");
		System.out.println("Employee's Name is   : " + e.getName());
		System.out.println("Employee's Age is    : " + e.getAge());
		System.out.println("Employee's Title is  : " + e.getTitle());
		System.out.println("Employee's Salary is : " + e.getSalary());


//print info using Person object
		System.out.println("----------------------------------");
		System.out.println("Person's Name is     : " + p.getName());
		System.out.println("Person's Age is     : " + p.getAge());

	}


	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
        //TODO implement subtraction
		int diff =0;
		return diff = x - y;
	}

	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;
	}

	private static int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 && y == 0) {
			System.out.println("Dividing 0 with 0 is not possible");
			//TODO complete the code so message is printed that dividing 0 with 0 is not possible

		} else if (y == 0) {
		    //TODO complete the code so message is printed that division by 0 is not possible
			System.out.println("Dividing by 0 is not possible");
		} else {
		    //TODO complete the code so that division is done
			divValue = x/y;

        }
		return divValue;

	}

}

