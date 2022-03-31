package sef.module8.activity;

//Needs to be completed

import java.util.*;


public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        //Names must be sorted by their natural order.
        //Do research to find if you already have such a class.
        //Also try adding a few duplicate entries to this set.
        HashSet nameSet = new HashSet();
        nameSet.add("Kate");
        nameSet.add("Aaron");
        nameSet.add("Audrey");
        nameSet.add("Bob");
        nameSet.add("Zane");


///Solution 1: let's convert it to list and sort!
        List<String> namelist = new ArrayList<String>(nameSet);
        Collections.sort(namelist);

///Solution 2: let's convert it to tree set and it will sort itself!
        TreeSet<String> nameTree = new TreeSet<String>(nameSet);


        //TODO: 2 - Call print method to print the set passed as its parameter.
        printset(nameSet);
        System.out.println("**********************************"); //for readability
        printlst(namelist);
        System.out.println("**********************************");
        printTree(nameTree);
    }

    static void printset(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        Iterator<String> it = set.iterator();
        System.out.println("Your name set:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    static void printlst(List list) {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        Iterator<String> it = list.iterator();
        System.out.println("Your name list:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    static void printTree(TreeSet tree) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        Iterator<String> it = tree.iterator();
        System.out.println("Your name tree:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

