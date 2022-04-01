package sef.module8.sample;
//Needs to be completed

import java.util.HashSet;

public class SetSample {
	public static void main(String[] args) {
		//TODO: 1 - Create a new HashSet and name it monthSet
		HashSet monthSet = new HashSet();

		//TODO: 2 - Add duplicate month names in it. For eg. January can be entered twice
		monthSet.add("January");
		monthSet.add("January");
		monthSet.add("January");
		monthSet.add("February");
		monthSet.add("March");
		monthSet.add("April");
		monthSet.add("May");
		monthSet.add("June");
		monthSet.add("July");
		monthSet.add("August");
		monthSet.add("September");
		monthSet.add("October");
		monthSet.add("November");
		monthSet.add("December");

		//duplicates will return false
		System.out.println(monthSet.add("January")); //returns false if this is already in the list. If added, then will print true


		System.out.println("Output : ");
		//TODO: 3 - Iterate through the HashSet and print all the months.
		for (Object monthsYear : monthSet) {
			System.out.println(monthsYear.toString());
		}
		//You'd notice that duplicate names are not printed.
		//Set has no order, list has order
	}
}
