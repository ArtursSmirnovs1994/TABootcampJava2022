package sef.FinalActivity.FirstActivity;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTest {


    public static void main(String[] args) {

        System.out.println("-----------------------------");
        Employee e = new Employee(); //
        e.setSalary(77999.11);
        e.setJobTitle("Pilot");
        e.setAge(32);
        e.setName("Mark Bezos");
        e.setCompany("SpaceX");

        Employee f = new Employee(); //
        f.setSalary(1);
        f.setJobTitle("CEO");
        f.setAge(60);
        f.setName("Gabe Newell");
        f.setCompany("Valve");

        Employee g = new Employee(); //
        g.setSalary(100000);
        g.setJobTitle("Miner");
        g.setAge(15);
        g.setName("Ryzen Geforce");
        g.setCompany("Binance");

        //Sorting employees by salary, descending

        ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
        EmployeeList.add(e);
        EmployeeList.add(f);
        EmployeeList.add(g);

        System.out.println("Employee salary sorting:");
        Collections.sort(EmployeeList, Employee.EmployeeSalaryAmount);

        for(Employee emp: EmployeeList){
            System.out.println(emp.getName() + " " + emp.getSalary());
        }

    }
}
