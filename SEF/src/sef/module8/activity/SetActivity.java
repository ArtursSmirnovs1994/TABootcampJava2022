package sef.module8.activity;

//Needs to be completed
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		TreeSet namesSet = new TreeSet();
		namesSet.add("John");
		namesSet.add("Peter");
		namesSet.add("Anna");
		namesSet.add("Eve");
		namesSet.add("Eve");
		namesSet.add("Eve");
		
		
		//TODO: 2 - Call print method to print the set passed as its parameter.
		SetActivity obj = new SetActivity();
		obj.print(namesSet);
	}
	
	void print(Set set)
	{
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
		for (Object nr : set) {
			System.out.println(nr.toString());
		}
	}
}
