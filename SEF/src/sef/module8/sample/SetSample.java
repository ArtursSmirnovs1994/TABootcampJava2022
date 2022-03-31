package sef.module8.sample;
//Needs to be completed

import sef.module8.activity.SetActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
	public static void main(String[] args) {
		//TODO: 1 - Create a new HashSet and name it monthSet
		HashSet fruitSet = new HashSet();


		fruitSet.add("la Manzana");
		fruitSet.add("el Platano");
		fruitSet.add("la Sandia");
		fruitSet.add("el Melocoton");
		fruitSet.add("la Ciruela");
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class.
		//Also try adding a few duplicate entries to this set.


		//TODO: 2 - Call print method to print the set passed as its parameter.
		SetActivity obj = new SetActivity();
		obj.print(fruitSet);


	}

	void print(Set set) {
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
		Iterator<String> it = set.iterator();
		System.out.println("Let`s check");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
