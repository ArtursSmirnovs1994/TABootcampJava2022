/**
 * 
 */
package sef.module2.activity;

/**
 * @author 
 * Ilja Carenko
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		// Table from 1 to 10
		/*
		for (int i = 1; i <= 10; i++) {
			System.out.println("*** Table of "+i + " ***");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "X" + j +" = " + i*j);
		}
		}*/

		// Table from 11 to 20
		for (int i = 11; i<21; i++) {
			System.out.println("*** Table of "+i + " ***");
			for (int j = 11; j<21; j++) {
					System.out.println(i + "X" + j +" = " + i*j);
			}
		}
		
	}

}
