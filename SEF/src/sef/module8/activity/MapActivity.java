package sef.module8.activity;
//Needs to be completed

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name

			Map<Integer, String> myMapsName = new HashMap<>();

			int x = 5;

			myMapsName.put(1, "One");
			myMapsName.put(2, "Two");
			myMapsName.put(3, "Three");
			myMapsName.put(5, "Five");
			myMapsName.put(4, "Four");

			//2 - Call print method to print the map passed as its parameter.
			MapActivity obj = new MapActivity();
			obj.print(myMapsName);
		}
		
		void print(Map map)
		{
			//3 - Type code to print this map
			Set entrySet = map.entrySet();
			Iterator it = entrySet.iterator();
			while (Iterator.hasNext()){
				Map.Entry<String, String> entry = itr.next();
				System.out.println("Key = " + entry.getKey() +
						", Value = " + entry.getValue());
				Integer key = (Integer) it.next();
				System.out.println(key + "");
			}
		
		}
	}
