package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        // 1 - Type code to create a list of names. Use ArrayList.
        List<String> listOfNames = new ArrayList<>();

        listOfNames.add("Jānis");
        listOfNames.add("Maria");
        listOfNames.add("John");

        listOfNames.addAll(Arrays.asList("Simon", "Sergey", "Marta", "John"));

        // 2 - Call print method to print the list passed as its parameter.
        print(listOfNames);
    }

    static void print(List<String> list) {
        // 3 - Type code to print this list
        //Notice the order in which elements get printed.
        for (String element : list) {
            System.out.println(element);
        }
    }
}
