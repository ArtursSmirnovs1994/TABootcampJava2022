/**
 * 
 */
package sef.module2.activity;

/**
 * @author
 *
 */
public class FindLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Find Largest of three numbers

		int i = 1, j = 2, k = 10;
		//Compares that i is greater than j
		if (i > j) {
			if (i > k) {
				System.out.println(i + " is Largest of three numbers");
			} else {
				System.out.println(k+ " is Largest of three numbers");
			}

		} else {
			if (j > k) {
				System.out.println(j+ " is Largest of three numbers");
			} else {
				System.out.println(k+ " is Largest of three numbers");
			}
		}



	}

}
