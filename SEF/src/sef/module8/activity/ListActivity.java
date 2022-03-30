package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.
		List names = new ArrayList();
		names.add("John");
		names.add("Peter");
		names.add("Anna");
		names.add("Eve");
		//TODO: 2 - Call print method to print the list passed as its parameter.
		print(names);
	}
	
	static void print(List list)
	{
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
		System.out.println("Using for loop");
		for (Object o : list) {
			System.out.println(o.toString());
		}

		System.out.println("\nUsing iterator");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
