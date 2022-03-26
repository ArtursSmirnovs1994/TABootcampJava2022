package sef.module2.activity;

public class FindInArray {

    public static void main(String[] args) {

        // Create an integer array
        int[] nums = {100, 1, 4, 15, 555};

        int result = nums[0];

        // Find smallest in an array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < result) {
                result = nums[i];
            }
        }

        System.out.println("Smallest in array is " + result);

        // Find largest in an array

        result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > result) {
                result = nums[i];
            }
        }

        System.out.println("Largest in array is " + result);

    }

}
