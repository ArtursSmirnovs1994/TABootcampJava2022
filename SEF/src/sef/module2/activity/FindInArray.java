/**
 * 
 */
package sef.module2.activity;

/**
 * @author 
 *
 */
public class FindInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create an integer array
		int[] nums = {100, 1, 4, 15};
		int result = nums[0];

		// Find smallest in an array
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < result) {
				result = nums[i];
			}
		}
		System.out.println("Smallest in array is "+result);

		result = nums[0];
		
		//TODO Find largest in an array
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > result) {
				result = nums[i];
			}
		}
		System.out.println("Largest in array is " + result);


		String [] anotherStringArray = {"Hello", "there", "how", "are", "you", "?"};
		System.out.println("The first thing in this array is " + anotherStringArray[2]);
		System.out.println(anotherStringArray.length + " "+  anotherStringArray[5]);


	}

}
