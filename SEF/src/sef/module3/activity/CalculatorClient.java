package sef.module3.activity;

/**
 * @author
 *
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
		
		// Add 
		int result = normalCalc.add(4, 5);
		System.out.println("1) Add result is " + result);
		
				
		// Multiply 
		int[] mul = {2, 3, 4};
		int mulresult =1;
		for(int value : mul) {
			mulresult = normalCalc.multiply(mul);
		}
		System.out.println("2) Multiplication result is " + mulresult);
		

		//Division
		//TODO Write code which will use normalCalc and divide function
		//TODO Divide numbers should be 10 and 2
		//TODO Divide result should be printed in similar style as multiply and addition

		int Divresult = normalCalc.divide(10, 2);
		System.out.println("3) Division result is " + Divresult);



		//Subtraction
		//TODO Write code which will use normalCalc and subtract function
		//TODO Subtract numbers should be 10 and 2
		//TODO Subtract result should be printed in similar style as multiply and addition

		int Subresult = normalCalc.subtract(10, 2);
		System.out.println("3) Division result is " + Subresult);

	}


	

}
