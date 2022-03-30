package sef.module8.activity;

//Needs to be completed
import java.util.*;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		SortedSet<String> sSet = new TreeSet<>(Arrays.asList("7Jane", "4Jane", "3Jane", "5Jane", "2Jane"));
		sSet.add("6Jane");

		//TODO: 2 - Call print method to print the set passed as its parameter.
//		new SetActivity().print(sSet);
		SetActivity sa = new SetActivity();
		sa.print(sSet);

		sa.print(sSet.subSet("2Jane", "5Jane"));

		sa.print(sSet.tailSet("4Jane"));
	}
	
	void print(Set set)
	{
		System.out.println();
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
		for (Object s : set) {
			System.out.println(s);
		}
	}
}
