package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.

		List list = new ArrayList();
		list.add("abc");
		list.add("xyz");
		list.add("lmn");
		print(list);


		//TODO: 2 - Call print method to print the list passed as its parameter.
		
	}
	
	static void print(List list)
	{
		for (int i= 0 ;i< list.size();i++){
			System.out.println(list.get(i).toString());
		}
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
	
	}
}
