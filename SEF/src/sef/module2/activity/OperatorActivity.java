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
		int i = 8;
		int j = 5;
		
		// Subtract numbers
		int result = i-j;
		
		// Print result
		System.out.println("Difference = " + result);
		
		// Add numbers
		int sum= i+j;
		
		// Print result
		System.out.println("sum = " + sum);

		int mod=i%j;
		System.out.println("module = " + mod);
		double dev=i/j;
		System.out.println("division = " + dev);
	}

}
