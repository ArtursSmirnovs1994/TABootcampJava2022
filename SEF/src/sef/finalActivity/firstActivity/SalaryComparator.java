package sef.finalActivity.firstActivity;

import java.util.Comparator;

public class SalaryComparator implements Comparator {

    @Override
    public int compare(Object employee1, Object employee2) {

        double salaryEmployee1 = ((Employee)employee1).getSalary();
        double salaryEmployee2 = ((Employee)employee2).getSalary();

        if(salaryEmployee1 > salaryEmployee2)
            return 1;
        else if(salaryEmployee1 < salaryEmployee2)
            return -1;
        else
            return 0;
    }


}
