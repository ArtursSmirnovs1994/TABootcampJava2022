package sef.module8.activity;
//Needs to be completed

import java.util.*;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map<String, String> nameMap = new HashMap();
			nameMap.put("1", "Kate");
			nameMap.put("2", "Joe");
			nameMap.put("3", "Zane");
			nameMap.put("4", "Harry");
			
			//2 - Call print method to print the map passed as its parameter.
			print(nameMap);
		}
		
		static void print(Map map)
		{
			//3 - Type code to print this map
			Set keySet = map.keySet();
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
