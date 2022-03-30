/**
 * 
 */
package sef.module2.activity;

/**
 * @author 
 *
 */
public class VariableAssignmentActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 1- Declare a variable of type int and assign it default value.
		int myInteger = 10;
		// 2- Update the value
		myInteger = 11;
		// 3- Print updated value to the console using System.out.println
		System.out.println(myInteger);

		int x = 4;
		int y = x++;
		// 1. y=x -> y=4
		//2. x=x+1 -> x=5
		System.out.println("x value is 5");

		int z = 4;
		int c = x--;
		// 1. y=x -> y=5
		// 2. x=x+1 -> x=4
		System.out.println("z value is 4");

		int a = 4;
		int b = ++a;
		// 1. a=a+1 -> a=5
		// 2. b=a -> b=5
		System.out.println("a value is 5");

		int f = 4;
		int d = ++a;
		// 1. f=f-1 -> f=4
		// 2. d=f -> d=5
		System.out.println("f value is 4");
	}
}
