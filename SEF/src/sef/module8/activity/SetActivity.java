package sef.module8.activity;

//Needs to be completed

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static sef.module8.activity.ListActivity.print;


public class SetActivity {
    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        TreeSet nameSet = new TreeSet();
//TODO @@@@@@@@@@@  use TreeSet for sorting the set in order
        //Names must be sorted by their natural order.
        //Do research to find if you already have such a class.
        //Also try adding a few duplicate entries to this set.


        nameSet.add("Anna");
        nameSet.add("Boris");
        nameSet.add("Caroline");
        nameSet.add("David");
        nameSet.add("Robert");
        nameSet.add("Tom");
        nameSet.add("Adam");
        nameSet.add("Anna");
        nameSet.add("Boris");
        nameSet.add("Caroline");


        //TODO: 2 - Call print method to print the set passed as its parameter.
        System.out.println("Output : \n");


        for (Object obj : nameSet) {
            System.out.println(obj.toString());
        }


    }
}