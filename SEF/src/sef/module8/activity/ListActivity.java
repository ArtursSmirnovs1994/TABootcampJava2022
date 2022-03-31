package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.
		List namelist = new ArrayList();
		namelist.add("Anne");
		namelist.add("Bob");
		namelist.add("Catherine");
		//TODO: 2 - Call print method to print the list passed as its parameter.
		print(namelist);
	}
	
	static void print(List list)
	{
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
		Iterator<String> it = list.iterator();
		System.out.println("Your name list:");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
	}
}
