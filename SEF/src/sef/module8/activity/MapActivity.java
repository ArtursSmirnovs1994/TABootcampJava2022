package sef.module8.activity;
//Needs to be completed

import sef.module8.sample.MapSample;

import java.util.Map;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {

    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name

        Map map = new HashMap();
        map.put("1", "Peter");
        map.put("2", "Caroline");
        map.put("3", "Sarah");
        map.put("6", "Dmitry");
        map.put("8", "Barbara");
        map.put("1", "John");
        //2 - Call print method to print the map passed as its parameter.

        new MapActivity().print(map);

    }

    public void print(Map map) {

        //3 - Type code to print this map
        Set keySet = map.keySet();

        System.out.println("*************************************");
        System.out.println("Key\tValue");

        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + "\t" + map.get(key));

        }


    }
}
