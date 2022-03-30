package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {

		//TODO: 1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList();
		list.add("Cat");       //0
		list.add("Dog");       //1
		list.add("Parrot");    //2


		//TODO: 2 - Call print method to print the list passed as its parameter.
		print(list);
	}

	static void print(List list) {
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
		int i;
		for (i = 0; i < list.size(); i++) ;
		System.out.println(list.get(i).toString());
	}
}
