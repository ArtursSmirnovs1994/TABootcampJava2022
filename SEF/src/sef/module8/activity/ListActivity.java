package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.
//		String[] nameList = { "1Jane","2Jane","3Jane","4Jane"};
//		ArrayList<String> aList = new ArrayList<>(Arrays.asList(nameList) );

		ArrayList<String> aList = new ArrayList<>(Arrays.asList("1Jane", "2Jane", "3Jane") );
		aList.add("4Jane");
		//TODO: 2 - Call print method to print the list passed as its parameter.
		new ListActivity().print(aList);
	}
	
	void print(List list)
	{
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() );
		}
	}
}
