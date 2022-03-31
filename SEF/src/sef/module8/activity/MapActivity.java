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
			Map<String, String> map = new HashMap();

			map.put("1", "one");
			map.put("2", "two");
			map.put("3", "three");
			map.put("4", "four");
			map.put("5", "five");

			
		
			
			//2 - Call print method to print the map passed as its parameter.
			new MapActivity().print(map);

		
		}
		
		public void print(Map map)
		{
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
