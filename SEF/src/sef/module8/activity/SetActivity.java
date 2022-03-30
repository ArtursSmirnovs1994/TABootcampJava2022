package sef.module8.activity;

//Needs to be completed

import java.util.*;


public class SetActivity {

    public static void main(String[] args) {
        // 1 - Type code to create a set of names.
        //Names must be sorted by their natural order.
        //Do research to find if you already have such a class.
        //Also try adding a few duplicate entries to this set.

        Set<String> listOfNames = new TreeSet<>(); // sorted (natural?) order
//        Set<String> listOfNames = new LinkedHashSet<>(); // preserve order
//        Set<String> listOfNames = new HashSet<>(); // no order

        listOfNames.addAll(Arrays.asList("Paul", "Anna", "Jason", "John", "Janice", "Anna", "John"));

        // 2 - Call print method to print the set passed as its parameter.

        print(listOfNames);
    }

    static void print(Set<String> set) {
        // 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for (String name : set) {
            System.out.println(name);
        }
    }
}
