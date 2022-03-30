package sef.module8.activity;
//Needs to be completed


import java.util.HashMap;
import java.util.Map;


public class MapActivity {

	public static void main(String[] args) {
		//1 - Type code to create a HashMap of key value pair
		//where key is id of type String and value is a name

		Map<String, String> names = new HashMap<>();

		names.put("1", "Elena");
		names.put("2", "Oleg");
		names.put("3", "Victor");
		names.put("4", "Eva");
		names.put("5", "Serge");
		names.put("none", "Mark");

		//2 - Call print method to print the map passed as its parameter.
		print(names);

	}

	static void print(Map<String, String> map) {
		//3 - Type code to print this map
		for (String id : map.keySet()) {
			System.out.printf("id: %s, name: %s\n", id, map.get(id));
		}
	}
}
