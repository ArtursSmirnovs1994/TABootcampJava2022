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

	int x = 0;
	int y = 0;

	int[] nums = {1, 2, 3, 4};

	System.out.println("Addition - " + add(x,y));
	System.out.println("Subtraction - " + subtract(x,y));
	System.out.println("Multiply - " + multiply(nums));
	System.out.println("Divide - " + divide(x,y));

	}


	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
        //TODO implement subtraction
		int diff = x - y ;
		return diff;
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
			//TODO complete the code so message is printed that dividing 0 with 0 is not possible
			System.out.println("Can't divide zero with zero, this isn't calculus one");

		} else if (y == 0) {
		    //TODO complete the code so message is printed that division by 0 is not possible
			System.out.println("You can't just divide with zero, go to jail");

		} else {
		    //TODO complete the code so that division is done
			divValue = x / y;
        }
		return divValue;

	}

}

