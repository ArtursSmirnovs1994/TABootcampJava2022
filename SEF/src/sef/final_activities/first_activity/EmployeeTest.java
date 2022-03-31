package sef.final_activities.first_activity;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee janis = new Employee(
                "Janis", 30, "Developer", "Accenture", 2200);
        Employee ilga = new Employee(
                "Ilga", 22, "Junior Developer", "Accenture", 2100);
        Employee sergey = new Employee(
                "Sergey", 22, "Junior tester", "Accenture", 1100);
        Employee harry = new Employee(
                "Harry", 29, "Director", "Hogwarts", 99_000);
        Employee elizabeth = new Employee(
                "Elizabeth", 90, "Queen", "England", 1_100_000);

        List<Employee> employees = Arrays.asList(janis, ilga, sergey, harry, elizabeth);

        // list before sort, in adding order
        System.out.println(employees);

        // sorting list by salary in descending order
        employees.sort((employee1, employee2) -> employee2.getSalary() - employee1.getSalary());

        System.out.println(employees);
    }

}
