package sef.module8.sample;
//Needs to be completed

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class SetSample {
	public static void main(String[] args) {
		//TODO: 1 - Create a new HashSet and name it monthSet
		Set<String> monthSet = new HashSet<>();

		//TODO: 2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false

		System.out.println(monthSet.add("January"));
		System.out.println(monthSet.add("January"));
		System.out.println(monthSet.add("February"));
		System.out.println(monthSet.add("March"));
		System.out.println(monthSet.add("April"));
		System.out.println(monthSet.add("May"));
		System.out.println(monthSet.add("June"));
		System.out.println(monthSet.add("July"));
		System.out.println(monthSet.add("August"));
		System.out.println(monthSet.add("September"));
		System.out.println(monthSet.add("October"));
		System.out.println(monthSet.add("November"));
		System.out.println(monthSet.add("April"));

		System.out.println();
		System.out.println("Output : ");
		//TODO: 3 - Iterate through the HashSet and print all the months.
		for (Object month : monthSet) {
			System.out.println(month);
		}
		//You'd notice that duplicate names are not printed. 
	}
}
