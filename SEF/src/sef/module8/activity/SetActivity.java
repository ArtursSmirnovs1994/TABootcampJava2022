package sef.module8.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		var nameSet = new TreeSet<String>();
		nameSet.add("Paul");
		nameSet.add("Mike");
		nameSet.add("Ana");
		nameSet.add("Ana");
		nameSet.add("Lucy");
		nameSet.add("Ben");
		nameSet.add("Peter");
		nameSet.add("Nelly");

		
		
		//TODO: 2 - Call print method to print the set passed as its parameter.
		print(nameSet);
	}
	
	static void print(Set set)
	{
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
		for (var nameInTheList : set) {
			System.out.println(nameInTheList.toString());
		}
	}
}
