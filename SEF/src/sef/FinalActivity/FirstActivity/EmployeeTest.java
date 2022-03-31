package sef.FinalActivity.FirstActivity;

import sef.module8.activity.ListActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> empl  = new ArrayList<Employee>();

        //Create Employees
        try {
            empl.add(new Employee("Jana", 39, "Editor", "Radio", 1500));
            empl.add(new Employee("Maris", 27, "Engineer", "Radio", 1000));
            empl.add(new Employee("Antuan", 45, "Manager", "Radio", 2500));
            empl.add(new Employee("Jose", 23, "Admin", "Radio", 500));
            empl.add(new Employee("Frank", 29, "Office admin", "Radio", 700));
        }
        catch (PersonCustomException pce){
            System.out.println("Can't create Employee: " + pce.getMessage());
        }

        EmployeeTest obj = new EmployeeTest();
        obj.printUnsorted(empl);
        obj.printSorted(empl);
    }

    void printUnsorted(ArrayList<Employee> empl)
    {
        System.out.println("*** Print un-sorted list ***");
        for (int i=0; i < empl.size(); i++){
            empl.get(i).Introduction();
        }
    }

    void printSorted(ArrayList<Employee> empl)
    {
        Collections.sort(empl, Collections.reverseOrder());
        System.out.println("*** Print sorted list, from Top salary to less ***");
        for (int i=0; i < empl.size(); i++){
            empl.get(i).Introduction();
        }
    }

}
