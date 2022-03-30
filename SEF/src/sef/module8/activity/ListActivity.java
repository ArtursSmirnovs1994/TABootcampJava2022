package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList();
		list.add("John");
		list.add(0, "Mary");
		list.add("Elizabeth");
		list.add(0, "Clark");

		//TODO: 2 - Call print method to print the list passed as its parameter.
		ListActivity obj = new ListActivity();
		obj.print(list);
	}
	
	void print(List list)
	{
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
		Iterator<String> listIterate = list.iterator();

		System.out.println("*** Print with While ***");
		while (listIterate.hasNext()){
			System.out.println(listIterate.next());
		}

		System.out.println("*** Print with For ***");
		for (Object names : list){
			System.out.println(names);
		}

	}
}
