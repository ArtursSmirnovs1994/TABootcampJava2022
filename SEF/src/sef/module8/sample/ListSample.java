package sef.module8.sample;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {
	public static void main(String[] args) {

		//Create an ArrayList
	    List list = new ArrayList();
	    // List implemented as growable array
	    
	    // Add an element to the list
	    list.add("a");
	    
	    // Insert an element at the head of the list
	    list.add(0, "b");
	    
	    // Get the number of elements in the list
	    int size = list.size();          // 2
	    
	    // Retrieving the element at the end of the list
	    Object element = list.get(list.size()-1);   // a
	    
	    // Retrieving the element at the head of the list
	    element = list.get(0);                      // b
	    
	    // Remove the first occurrence of an element
	    boolean b = list.remove("b");      // true
	    b = list.remove("b");              // false
	    
	    // Remove the element at a particular index
	    element = list.remove(0);          // a

	    
	    //1 - Add 3 more elements to the list - A, B and C
	    
	    list.add("a");
		list.add("b");
		list.add("c");
	    
		//call a method which prints this list
	    ListSample obj=new ListSample();
	    obj.print(list);
	}

	public void print(List list)
	{
		//Iterator is an interface which provides a uniform way to access
		//individual elements of a Collection
		Iterator<String> it=list.iterator();
		//2 - Use Iterator to iterate over this list.
		while(it.hasNext()){
			System.out.println((it.next()));}
	}
}
