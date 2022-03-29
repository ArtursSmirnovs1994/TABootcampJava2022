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
		int i = 9;
		int j = 2;
		
		// Subtract numbers
		int myResult = i - j;
		
		// Print result
		System.out.println("Difference = " + myResult);
		
		// Add numbers
		myResult = i + j;
		
		// Print result
		System.out.println("The sum = " + myResult);

		// multiply numbers
		myResult = i * j;

		// Print result
		System.out.println("Multiplied = " + myResult);

		// divide numbers
		myResult = i / j;

		// Print result
		System.out.println("Divided = " + myResult);

		// Increase j by 1 with ++
		j++;
		System.out.println("Now j has been changed to " + j);

		myResult = i % j;
		System.out.println(myResult);


	}

}


