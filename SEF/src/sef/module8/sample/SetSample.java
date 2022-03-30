package sef.module8.sample;
//Needs to be completed

import java.util.HashSet;
import java.util.Set;

public class SetSample {
	public static void main(String[] args) {
		//TODO: 1 - Create a new HashSet and name it monthSet
		HashSet moonthSet = new HashSet();

		moonthSet.add("January");
		moonthSet.add("January"); // setā izdrukās tikai vienreiz, ja ir dublikāti
		moonthSet.add("January");
		moonthSet.add("February");
		moonthSet.add("March");
		moonthSet.add("April");
		moonthSet.add("May");
		moonthSet.add("June");
		moonthSet.add("July");
		moonthSet.add("August");
		moonthSet.add("September");
		moonthSet.add("October");
		moonthSet.add("December");
		//TODO: 2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false
		//System.out.println(monthSet.add("January"));

		System.out.println("Output : ");
		//TODO: 3 - Iterate through the HashSet and print all the months.
		for (Object nameOfObject : moonthSet){
			System.out.println(nameOfObject.toString());
		}
		//You'd notice that duplicate names are not printed. 
	}
}
