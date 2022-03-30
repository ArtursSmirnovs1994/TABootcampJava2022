package sef.module8.activity;
//Needs to be completed

import sef.module8.sample.MapSample;

import javax.naming.Name;
import java.util.*;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map<String, String> map = new HashMap();



			map.put("1", "John");
			map.put("2", "David");
			map.put("3", "Eddie");
		
			
			//2 - Call print method to print the map passed as its parameter.
			new MapActivity().print(map);
		}
		
		void print(Map map) //static method will not need initialising, if its void we need initialising
				//each method need to return smth, except void
				//string need to return value
		{
			//3 - Type code to print this map, print method here
			Set keySet = map.keySet();
			System.out.println("*************Map*************");
			System.out.println("Key\tValue");
			Iterator it = keySet.iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				System.out.println(key + "\t" + map.get(key));
			}

			System.out.println("*************Map*************");
		}
	}
