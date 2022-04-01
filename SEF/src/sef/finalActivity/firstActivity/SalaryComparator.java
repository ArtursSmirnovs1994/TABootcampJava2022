package sef.finalActivity.firstActivity;

import java.util.Comparator;


public class SalaryComparator implements Comparator {

    public int compare(Object emp1, Object emp2) {

        double emp1Sal = ((Employee)emp1).getSalary();
        double emp2Sal = ((Employee)emp2).getSalary();

        if(emp1Sal < emp2Sal)
            return 1;
        else if(emp1Sal > emp2Sal)
            return -1;
        else
            return 0;
    }
}