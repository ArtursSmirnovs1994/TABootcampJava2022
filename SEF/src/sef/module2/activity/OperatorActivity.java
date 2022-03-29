package sef.module2.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		// I changed them to double, wanted to see how divide with decimals works
		double i = 17;
		double j = 14;
		
		// Subtract numbers
		double result = i-j;
		
		// Print result subtract
		System.out.println("Difference = " + result);
		
		// Add numbers
		result = i+j;
		
		// Print result add
		System.out.println("Sum = " + result);

		// Multiply
		result = i*j;

		// Print result multiply
		System.out.println("Multiply = " + result);

		// Divide
		result = i/j;

		// Print result divide
		System.out.println("Divide = " + result);
	}

}
