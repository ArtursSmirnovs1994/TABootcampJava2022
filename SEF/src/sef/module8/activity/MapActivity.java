package sef.module8.activity;
//Needs to be completed

import sef.module8.sample.MapSample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {

	public static void main(String[] args) {
		//1 - Type code to create a HashMap of key value pair
		Map myMap = new HashMap();
		myMap.put("1", "if you do the thing");
		myMap.put("2", "and you do it right");
		myMap.put("3", "and you dont fuck it up");
		//where key is id of type String and value is a name

		//2 - Call print method to print the map passed as its parameter.
		//System.out.println(myMap.get("1"));
		//System.out.println(myMap.get("2"));
		//System.out.println(myMap.get("3"));

		new MapActivity().print(myMap);
		System.out.println("  ---  It works  ---  ");
	}

	void print(Map myMap) {
		//3 - Type code to print this map
		Set keySet = myMap.keySet();

		System.out.println("Remember\tThese\tRules");
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + "\t" + myMap.get(key));
		}


	}
}
