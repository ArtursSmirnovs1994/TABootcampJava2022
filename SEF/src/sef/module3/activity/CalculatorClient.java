package sef.module3.activity;

/**
 * @author
 * Ilja Carenko
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
		 *final variable defined in Calculator class. 
		*/
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		
		System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");

		int index = 1;

		// Add
		int result = normalCalc.add(4, 5);
		System.out.printf("%d) %s result is %d%n",index++, "Addition", result);
		
				
		// Multiply 
		int[] mul = {2, 3, 4};
		result = normalCalc.multiply(mul);
		System.out.printf("%d) %s result is %d%n",index++, "Multiplication", result);
		
		//Division
		result = normalCalc.divide(10,2);
		System.out.printf("%d) %s result is %d%n",index++, "Division", result);


		//Subtraction
		result = normalCalc.subtract(10,2);
		System.out.printf("%d) %s result is %d%n",index++, "Subtraction", result);
	}


	

}
