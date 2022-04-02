package sef.module8.activity;
//Needs to be completed

import sef.module2.sample.WhileLoopSample;

import javax.swing.text.html.HTMLDocument;
import java.util.*;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name

			Map mYmap = new HashMap();
			mYmap.put("1", "Map activity");
			mYmap.put("2", new Date());
			mYmap.put("3", 42);
			mYmap.put("4", 23.0f);
			mYmap.put("I am", "Siva");

			System.out.println(mYmap.toString());
//			mYmap.put("1","Same key as a String");
//
//			System.out.println("after updateing"+mYmap.get("1"));

			
		
			
			//2 - Call print method to print the map passed as its parameter.
		
		}
		
		void print(Map mYmap) {

			Set KeySet = mYmap.keySet();

			System.out.println("Key\tValue");
			Iterator it = KeySet.iterator();

//			While(it.hasNext()) {
				String key = (String) it.next();
				System.out.println(key + '\t' + mYmap.get(key));
//			}
			//3 - Type code to print this map
		}
		

	}
