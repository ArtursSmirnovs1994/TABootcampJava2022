package sef.finalActivity.firstActivity;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    public int compare(Employee emp1, Employee emp2) {

        String emp1Name = emp1.getName();
        String emp2Name = emp2.getName();

        return emp1Name.compareTo(emp2Name);

    }
}
