package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList<>();
		list.add("Valera");
		list.add("Sveta");
		list.add("Gena");
		list.add("Tatyana");
		//TODO: 2 - Call print method to print the list passed as its parameter.
		print(list);
		//ListSample obj=new ListSample();
		//obj.print(list);
	}

	static void print(List list) {
		Iterator<String> ALL = list.iterator();
		while (ALL.hasNext()) {
			System.out.println((ALL.next()));
			//TODO: 3 - Type code to print this list
			//Notice the order in which elements get printed.

		}

	}
}