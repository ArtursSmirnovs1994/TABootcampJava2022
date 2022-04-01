package sef.module8.activity;
//Needs to be completed

import sef.module8.sample.MapSample;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {

	public static void main(String[] args) {
		//1 - Type code to create a HashMap of key value pair
		//where key is id of type String and value is a name
		Map<String, String> myMap = new HashMap<>();

		myMap.put("One", "Janis");
		myMap.put("Two", "Arturs");

		//2 - Call print method to print the map passed as its parameter.
		new MapActivity().print(myMap);
	}

	void print(Map myMap) {
		//3 - Type code to print this map
		//You can use an iterator to access keys
		Set keySet = myMap.keySet();

		System.out.println("Key  \t  Value");
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + "  \t  " + myMap.get(key));
		}
	}
}
