package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {   //TODO: 1 - Type code to create a list of names. Use ArrayList.

		//ArrayList<String> namesList = new ArrayList<>();

		List list = new ArrayList();

		list.add("Yuliia"); //0
		list.add("Robert"); //1
		list.add("Yana"); //2
		
		print(list);  	//TODO: 2 - Call print method to print the list passed as its parameter.
	}
	static void print(List list) {
			//TODO: 3 - Type code to print this list
			//Notice the order in which elements get printed.

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}


		}
	}
}