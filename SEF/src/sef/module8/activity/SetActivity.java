package sef.module8.activity;

//Needs to be completed

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		TreeSet nameSet = new TreeSet();
		nameSet.add("Jana");
		nameSet.add("Jana");
		nameSet.add("Febry");
		nameSet.add("Marius");
		nameSet.add("Aprilius");
		nameSet.add("Maya");

		//print(nameSet);
		//TODO: 2 - Call print method to print the set passed as its parameter.
		SetActivity obj= new SetActivity();
		obj.print(nameSet);
	}

	static void print(Set set) {
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
		Iterator<String> it=set.iterator();
		//2 - Use Iterator to iterate over this list.
		while(it.hasNext()){
			System.out.println((it.next()));
		//Object[] name = new Object[0];
		//for (Object nameOfObject : name) {
		//	System.out.println(nameOfObject.toString());
			//2 - Use Iterator to iterate over this list.
		}
	}
}