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
		int[] nums = {23, 34, 0, 15,28,31,50};
		
		int smallest = nums[0];
		
		// Find smallest in an array
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < smallest) {
				smallest = nums[i];
			}
		}
		System.out.println("Smallest in array is "+smallest);
		
		int largest = nums[0];

		//TODO Find largest in an array
		for (int i = 1; i < nums.length; i++) {
			//TODO complete the code
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}
		System.out.println("Largest in array is "+largest);


	}

}
