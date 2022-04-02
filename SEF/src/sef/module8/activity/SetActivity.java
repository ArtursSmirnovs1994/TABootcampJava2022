package sef.module8.activity;

//Needs to be completed

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;


public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        //Names must be sorted by their natural order.
        //Do research to find if you already have such a class.
        //Also try adding a few duplicate entries to this set.
        TreeSet nameSet = new TreeSet();
        nameSet.add("Anna");
        nameSet.add("Anda");
        nameSet.add("Alisa");
        nameSet.add("Santa");
        nameSet.add("Alisa");
        //TODO: 2 - Call print method to print the set passed as its parameter.

        print(nameSet);
    }

    //TODO: 3 - Type code to print this set
    //Notice the order in which elements get printed.
    static void print(Set set) {
        Iterator<String> it = set.iterator();
        System.out.println("Names");
        while (it.hasNext())
            System.out.println(it.next());
    }
}
