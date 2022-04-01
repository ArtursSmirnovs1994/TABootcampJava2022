package sef.module8.activity;
//Needs to be completed

import sef.module8.sample.ListSample;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List nameList = new ArrayList();

        nameList.add("Lauma"); //added names to check if printing works
        nameList.add("Toms");

        //TODO: 2 - Call print method to print the list passed as its parameter.

        //ListActivity printedList = new ListActivity();
        //printedList.print(nameList);     // can use if print is not static

        print(nameList);
    }

    static void print(List nameList) {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        for (Object o : nameList) {
            System.out.println(o.toString());
        }
    }
}