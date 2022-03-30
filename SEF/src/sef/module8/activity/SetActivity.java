package sef.module8.activity;

//Needs to be completed

import java.util.*;


public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        //Names must be sorted by their natural order.
        //Do research to find if you already have such a class.
        //Also try adding a few duplicate entries to this set.
        TreeSet nameSet = new TreeSet();
        nameSet.add("Marvin");
        nameSet.add("Mr. Pumpkins");
        nameSet.add("Zaphod");
        nameSet.add("Marvin");
        nameSet.add("Slartibartfast");
        nameSet.add("Marvin");

        print(nameSet);

        //TODO: 2 - Call print method to print the set passed as its parameter.

    }

    static void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for (Object obj : set) {
            System.out.println(obj.toString());
        }
    }
}
