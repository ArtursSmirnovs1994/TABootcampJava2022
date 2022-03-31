package sef.module8.activity;
//Needs to be completed

import sef.module8.sample.ListSample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList<>();

		list.add("eggs");
		list.add("butter");
		list.add("a rats tail");

		//TODO: 2 - Call print method to print the list passed as its parameter.
		print(list);
	}
	
	static void print(List list)
	{
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
		Iterator<String> it = list.iterator();
		System.out.println("*** Shopping list *** ");
		while (it.hasNext()) System.out.println(it.next());
	}
}
