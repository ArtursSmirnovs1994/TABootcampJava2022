package sef.module8.activity;

//Needs to be completed

import java.util.Set;
import java.util.TreeSet;

public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		TreeSet daysOfWeekSet = new TreeSet();

		// Adding new elements to the HashSet
		daysOfWeekSet.add("Monday");
		daysOfWeekSet.add("Tuesday");
		daysOfWeekSet.add("Wednesday");
		daysOfWeekSet.add("Thursday");
		daysOfWeekSet.add("Friday");
		daysOfWeekSet.add("Saturday");
		daysOfWeekSet.add("Saturday");
		daysOfWeekSet.add("Saturday");
		daysOfWeekSet.add("Sunday");


		//TODO: 2 - Call print method to print the set passed as its parameter.
		print(daysOfWeekSet);
	}

	public static void print(Set daysOfWeekSet) {

		//TODO: 3 - Type code to print this set

		//Notice the order in which elements get printed.
		for (Object myObject : daysOfWeekSet) {
			System.out.println(myObject.toString());
		}
	}
}
