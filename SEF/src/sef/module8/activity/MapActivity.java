package sef.module8.activity;
import java.util.Map;
import java.util.HashMap;


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

			print(myMapsName);
		}

	static void print(Map<Integer, String> map) {

		for (Integer id : map.keySet()) {
			System.out.printf("key: %s, value: %s\n", id, map.get(id));
		}
	}
	}
