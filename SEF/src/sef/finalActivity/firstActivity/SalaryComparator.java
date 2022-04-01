package sef.finalActivity.firstActivity;

import java.util.Comparator;

public class SalaryComparator implements Comparator{
    public int compare(Object emp1, Object emp2){

        int emp1Salary = ((Employee)emp1).getSalary();
        int emp2Salary = ((Employee)emp2).getSalary();

        if(emp1Salary > emp2Salary)
            return - 1;
        else if(emp1Salary < emp2Salary);
            return 1;

    }

}
