/**
 *
 */
package sef.module2.activity;

/**
 * @author
 *
 */
public class Calculator {

	public static void main(String[] args) {

	int x = 10;
	int y = 5;

	int[] nums = {1, 2, 3, 4};

	System.out.println("Addition - " + add(x,y));
	System.out.println("Subtraction - " + subtract(x,y));
	System.out.println("Multiply - " + multiply(x,y));
	System.out.println("Divide - " + divide(x,y));

	}



	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
		int diff = x - y;

		return diff;
	}

	private static int multiply(int x, int y) {
		int temp = x * y;

		return temp;

	}

	private static int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 && y == 0) {
			System.out.println("dividing 0 with 0 is not possible");


		} else if (y == 0) {
			System.out.println("division by 0 is not possible");

		} else {
			divValue =  x / y;
        }
		return divValue;

	}

}

