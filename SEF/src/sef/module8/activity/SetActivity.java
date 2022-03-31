package sef.module8.activity;

//Needs to be completed
import java.util.*;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class.
		//Also try adding a few duplicate entries to this set.
		TreeSet names = new TreeSet();
		names.add("Apple");
		names.add("Orange");
		names.add("Banana");
		names.add("Apple");
		names.add("Berry");
		
		
		
		//TODO: 2 - Call print method to print the set passed as its parameter.
		SetActivity obj = new SetActivity();
		obj.print(names);
		
	}
	
	void print(Set set)
	{
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
		Iterator<String> it = set.iterator();
		System.out.println("Lets Check");
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}
