package sef.finalActivity.firstActivity;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee emp1, Employee emp2){
        double emp1Salary = emp1.getSalary();
        double emp2Salary = emp2.getSalary();

        if(emp1Salary < emp2Salary)
            return 1;
        else if(emp1Salary > emp2Salary)
            return -1;
        else
            return 0;
    }

}
