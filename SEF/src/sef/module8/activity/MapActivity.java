package sef.module8.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map<String, String> myMap = new HashMap();
			myMap.put("P1", "John");
			myMap.put("P2", "Peter");
			myMap.put("P3", "Anna");
			myMap.put("P4", "Eve J");
			myMap.put("P5", "Eve A");
		
			
			//2 - Call print method to print the map passed as its parameter.
			print(myMap);
		}
		
		static void print(Map map) {
			//3 - Type code to print this map
			Set keySet = map.keySet();
			System.out.println("Key\tValue");
			Iterator it = keySet.iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				System.out.println(key + "\t" + map.get(key));
			}
		}
	}
