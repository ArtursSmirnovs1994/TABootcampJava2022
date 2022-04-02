package sef.module8.sample;
//Needs to be completed

import java.util.HashSet;

public class SetSample {
	public static void main(String[] args) {
		//TODO: 1 - Create a new HashSet and name it monthSet
		HashSet monthSet = new HashSet();


		//TODO: 2 - Add duplicate month names in it. For eg. January can be entered twice
		monthSet.add("Apr");
		monthSet.add("May");
		monthSet.add("Jun");
		monthSet.add("Jan");
		monthSet.add("Feb");
		monthSet.add("Mar");
		monthSet.add("Apr");
		monthSet.add("May");
		monthSet.add("Jun");
		monthSet.add("Jul");
		monthSet.add("Aug");
		monthSet.add("Sep");
		monthSet.add("Oct");
		monthSet.add("Nov");
		monthSet.add("Dec");



		//duplicates will return false
		//System.out.println(monthSet.add("January"));

		System.out.println("Output : ");
		//TODO: 3 - Iterate through the HashSet and print all the months.
		
		//You'd notice that duplicate names are not printed.

		for (Object nameOfObject : monthSet) {
			System.out.println(nameOfObject.toString());
		}


	}
}
