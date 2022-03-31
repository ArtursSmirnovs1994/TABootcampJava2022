package sef.module8.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
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
		System.out.println("Output : ");
	}
	
	public void print(Set set)
	{
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
//		for (Object nameOfObject: fruitSet) {
//			System.out.println(nameOfObject.toString());
//		}
	}
}
