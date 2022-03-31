package sef.module8.activity;
//Needs to be completed

import sef.module8.sample.ListSample;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List list = new ArrayList<>();
        list.add("Lilly");
        list.add("Mark");
        list.add("Ana");
        //TODO: 2 - Call print method to print the list passed as its parameter.
        print(list);
    }

    static void print(List list) {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
//		for (int i=0; i<list.size(); i++) {
//		System.out.println(list.get(i).toString());
//	}
        for (Object nameInTheList : list) {
            System.out.println(nameInTheList.toString());
        }
    }
}
