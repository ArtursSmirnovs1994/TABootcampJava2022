package sef.module8.activity;
//Needs to be completed



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList();


		list.add("Scroodge"); //
		list.add("Bill");
		list.add("Jeff");


		//TODO: 2 - Call print method to print the list passed as its parameter.

		ListActivity obj = new ListActivity();
		obj.print(list);
	}

	void print(List list) {
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
		Iterator<String> nameofIterator = list.iterator();
		System.out.println("______Forbes list_____");
		while (nameofIterator.hasNext()) {
			System.out.println(nameofIterator.next());

		}
	}
}