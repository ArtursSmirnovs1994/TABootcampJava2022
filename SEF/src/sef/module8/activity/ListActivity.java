package sef.module8.activity;
//Needs to be completed

import sef.module8.sample.ListSample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.

		List listOfNames = new ArrayList();
		listOfNames.add("name1");
		listOfNames.add("name2");
		listOfNames.add("name3");
		//TODO: 2 - Call print method to print the list passed as its parameter.

		print(listOfNames);
	}

	static void print(List listOfNames) {
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.

		Iterator<String> it  = listOfNames.iterator();
		System.out.println("++Printing my list of names++");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
