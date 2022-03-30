package sef.module8.activity;
//Needs to be completed

import java.util.*;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			HashMap<String,String> hmap = new HashMap<String,String>();
			hmap.put("id1", "Cat");
			hmap.put("id2", "Dog");
			hmap.put("id3", "Pig");
			//2 - Call print method to print the map passed as its parameter.
			MapActivity obj = new MapActivity();
			obj.print(hmap);
		}
		
		void print(Map map) {
			//3 - Type code to print this map
			System.out.println("*** Print with For ***");
			for (Object names : map.entrySet()) {
				System.out.println(names);
			}

			//Keys are maintained as set in map.
			Set keySet = map.keySet();

			//You can use an iterator to access keys
			System.out.println("*************************************");
			System.out.println("Key\tValue");
			Iterator it = keySet.iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				System.out.println(key + "\t" + map.get(key));
			}
			System.out.println("*************************************");
		}
	}
