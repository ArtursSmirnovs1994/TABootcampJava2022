/**
 * 
 */
package sef.module2.activity;

/**
 * @author 
 *
 */
public class PrintNumWithWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Print all even numbers less than 100
		int i = 0;
//		while(i<100){
//			System.out.println(i);
//			i=i+2;
//		}
		
		 
		//TODO: write code to Print all even numbers less than 100
		for (int j = 0; j < 100; j++) {
			if (j % 2 == 0) {
				System.out.println("even numbers " + j);
			}

		}


		//TODO: write code to Print all odd numbers less than 100
		i = 1;
		for (i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(" Odd numbers = " + i);


			}
		}

	}
}

