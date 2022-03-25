/**
 * 
 */
package sef.module2.activity;

/**
 * @author 
 * Ilja Carenko
 */
public class VariableAssignmentActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1- Declare a variable of type int and assign it default value.
		// 2- Update the value 
		// 3- Print updated value to the console using System.out.println

		int newIntVar;
		newIntVar = Integer.MAX_VALUE + 1;
		System.out.println(String.format("The result is %d", newIntVar) );
	}

}
