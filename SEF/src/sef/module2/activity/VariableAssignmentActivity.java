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
		// 2- Update the value
		// 3- Print updated value to the console using System.out.println
//Addition
		int a, b;
		a = 4;
		b = 6;
		int c = a + b;
		System.out.println("Sum = " + c);
		System.out.println("result 2 = " + (c + (b - a)));

		// NEXT
		int k, n;
		k = 22;
		n = 11;
		// Substraction
		int d = k - n;
		System.out.println("Difference = " + d);

		//Division
		int di = k / n;
		System.out.println("result = " + di);

		//Multiplication
		System.out.println("result = " + (k * n));


		// Prefix
		int m = ++k;
		System.out.println("Prefix result = " + m);
		System.out.println("Prefix result = " + ++m); // k+1, (k+1)=m, m+1
		//Postfix
		int f = 0;
		for (n = 11; n < 14; n++) {
			f = n;
			System.out.println("Postfix result = " + f);
		}

		for (int i = 7; i <= 10; i++) {
			System.out.println("Count " + i);
		}

	}
}
