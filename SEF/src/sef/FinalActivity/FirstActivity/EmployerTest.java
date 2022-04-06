package sef.FinalActivity.FirstActivity;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

public class EmployerTest {
    public static void main(String arg[]) {

        Employer a = new Employer();
        a.setName("John Doe");
        a.setAge(18);
        a.setSalary(800);
        Employer b = new Employer();
        b.setName("Kay Fucker");
        b.setAge(30);
        b.setSalary(600);
        Employer c = new Employer();
        c.setName("Anna Folkin");
        c.setAge(55);
        c.setSalary(500);

//                a.EmployerIntroduce();
//                b.EmployerIntroduce();
//                c.EmployerIntroduce();

        HashMap<Integer, String> map = new HashMap<>();

        map.put(a.getSalary(), a.getName());
        map.put(b.getSalary(), b.getName());
        map.put(c.getSalary(),c.getName());


        TreeMap<Integer, String> treeMap = new TreeMap(map);

        System.out.println(treeMap);

//        Map<String, Integer> reverseSortedMap = new TreeMap<String, Integer>(Collection.reverseOrder());

//        reverseSortedMap.putAll();
//
//        System.out.println("Reverse Sorted Map   : " + reverseSortedMap);

    }


        }



