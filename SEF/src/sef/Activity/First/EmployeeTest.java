package sef.Activity.First;

//import sef.module5.sample.abstraction.Employee_A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest extends Person {

    public static void main(String[] args) throws InvalidNameException {
        //  4.1) Create EmployeeTest class
        //	4.2) In EmployeeTest class create few employees
        //	4.2) Print them from top salary to less

        //	5) Create PersonTest class
        //	    Try to achieve 100% of coverage from unit tests
        //	6) Create StudentTest class
        //		Try to achieve 100% of coverage from unit tests

        Employee employee1 = new Employee("Elena", 33);
        employee1.setJobTitle("Doctor");
        employee1.setCompany("Clinic");
        employee1.setSalary(2500);

        Employee employee2 = new Employee("Oleg", 43);
        employee2.setJobTitle("Driver");
        employee2.setCompany("LPR");
        employee2.setSalary(2600);

        Employee employee3 = new Employee("Olga", 53);
        employee3.setJobTitle("Manager");
        employee3.setCompany("Leepr");
        employee3.setSalary(3600);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        List<Employee> sortedList = list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList());
        for (Employee emp : sortedList) {
            emp.introduction();
        }
    }
}




