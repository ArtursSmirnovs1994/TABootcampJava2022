package sef.module8.sample;
//Needs to be completed

import java.util.HashSet;

public class SetSample {
	public static void main(String[] args) {
		//TODO: 1 - Create a new HashSet and name it monthSet
		HashSet monthSet = new HashSet();

		//TODO: 2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false
		//System.out.println(monthSet.add("January"));
		System.out.println(monthSet.add("January"));
		System.out.println(monthSet.add("January"));
		System.out.println(monthSet.add("February"));
		System.out.println(monthSet.add("March"));

		System.out.println("Output : ");
		//TODO: 3 - Iterate through the HashSet and print all the months.
		//You'd notice that duplicate names are not printed.
		System.out.println("*** Print with For ***");
		for (Object months : monthSet){
			System.out.println(months);
		}

	}
}
