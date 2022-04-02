package sef.module8.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		HashSet week = new HashSet();

		week.add("Monday");
		week.add("Monday");
		week.add("tuesday");
		week.add("Wednesday");
		week.add("Thursday");
		week.add("Friday");
		week.add("Saturday");
		week.add("Sunday");

		System.out.println("weekdays names are:  ");
		for (Object nameOfObject: week){
			System.out.println(nameOfObject.toString());
		}

		
		
		
		//TODO: 2 - Call print method to print the set passed as its parameter.
		
	}
	
	static void print(Set week)
	{
		for (Object nameOfObject: week){
			System.out.println(nameOfObject.toString());
		}
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
	}
}
