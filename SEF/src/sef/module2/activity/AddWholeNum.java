/**
 *
 */
package sef.module2.activity;

/**
 * @author
 *
 */
public class AddWholeNum {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int total = 0;
        // Example for completing code
        for (int i = 1; i <= 50; i++) {
            total = total + i;
        }
        System.out.println("Addition of Whole Numbers from 1 to 50 = " + total);

        total = 0;

		// Addition of Whole Numbers from 50 to 100

		for (int i=50; i<=100; i++) {

             total = total + i;
        }
		System.out.println("Addition of Whole Numbers from 50 to 100 = "+total);


}

}
