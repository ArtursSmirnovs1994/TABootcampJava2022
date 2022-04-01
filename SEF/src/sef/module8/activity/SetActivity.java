package sef.module8.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.


		//SortedSet<String> namesInOrder = new SortedSet<String>();

		TreeSet namesInOrder = new TreeSet();
		// can use if list does not allow duplicates to be printed later

		namesInOrder.add("Zuze");
		namesInOrder.add("Mice");
		namesInOrder.add("Aiga");
		namesInOrder.add("Davis");
		namesInOrder.add("Aiga");
		
		//TODO: 2 - Call print method to print the set passed as its parameter.
		print(namesInOrder);
	}
	
	static void print(Set namesInOrder)
	{
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.

		for (Object nameOrderList : namesInOrder) {
			System.out.println(nameOrderList.toString());
		}


	}
}
