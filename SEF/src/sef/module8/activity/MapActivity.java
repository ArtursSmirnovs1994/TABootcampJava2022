package sef.module8.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;


public class MapActivity {

    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        Map<String, Name> newMap = new HashMap<>();
        newMap.put("ID1", new Name("1Jane"));
        newMap.put("ID4", new Name("4Jane"));
        newMap.put("ID2", new Name("2Jane"));
        newMap.put("ID3", new Name("3Jane"));
        newMap.put("ID3", new Name("0Jane"));
        //2 - Call print method to print the map passed as its parameter.
        new MapActivity().print(newMap);

        /*
        //Some craziness
        Map newMap1 = new HashMap<>();
        newMap1.put(1.0f, new Object());
        newMap1.put(1.0f, new Object());
        newMap1.put("1.0f", new Object());
        newMap1.put(new Object(), new Object());
        newMap1.put(new Object(), new Object());
        new MapActivity().print(newMap1);
        */

    }

    void print(Map map) {
        System.out.println();
        //3 - Type code to print this map
        for (Object key : map.keySet()) {
            System.out.printf("Key: %s -> Value: %s\n", key, map.get(key));
        }
    }

    private static class Name {
        private String name;

        public Name(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
