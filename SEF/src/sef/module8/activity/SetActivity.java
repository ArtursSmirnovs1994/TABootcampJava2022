package sef.module8.activity;

//Needs to be completed
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		SortedSet<String> ss = new TreeSet<>();
		ss.add("John");
		ss.add("Michael");
		ss.add("Anthony");
		ss.add("Elizabeth");
		ss.add("Mary");
		ss.add("John");
		ss.add("Kelvin");
		ss.add("Mary");

		//TODO: 2 - Call print method to print the set passed as its parameter.
		SetActivity obj = new SetActivity();
		obj.print(ss);
		
	}
	
	void print(Set set)
	{
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
		System.out.println("*** Print with For ***");
		for (Object names : set.toArray()) {
			System.out.println(names);
		}
	}
}
