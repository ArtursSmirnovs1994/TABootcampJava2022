/**
 * 
 */
package sef.module2.activity;

/**
 * @author 
 * Ilja Carenko
 */
public class PrintNumWithWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		// Print all even numbers less than 100
		/*
		int i = 0;
		while(i<100){
			System.out.println(i);
			i=i+2;			
		}*/

		int i = 0;
		while (i++ < 100) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
