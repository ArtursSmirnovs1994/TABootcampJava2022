package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList();
		list.add(0, "Mr. Pumpkins");
		list.add(1, "Marvin");
		list.add(2, "Slartibartfast");
		list.add(3, "Zaphod");
		//TODO: 2 - Call print method to print the list passed as its parameter.
		System.out.println(list.get(1));

		System.out.println("******************");
		ListActivity listActivity = new ListActivity();
		listActivity.print(list);
	}
	
	void print(List list) // add "static" to the method and then you dont need to create object to call the method
	{
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
		for (Object o : list) {
			System.out.println(o.toString());
		}
	}
}
