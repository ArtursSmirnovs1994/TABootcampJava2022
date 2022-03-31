package sef.finalActivity.firstActivity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeTest {
    public static void main(String[] args) throws Exception {
        var employees = new Employee[]{
                new Employee("Mark", 22, "Accountant", "Bellanova", 1500),
                new Employee("Lucy", 30, "Manager", "Top Center", 3000),
                new Employee("Ben", 45, "Cleaner", "Bellanova", 800),
                new Employee("Agatha", 18, "Developer", "Telia", 4500),
        };

        Arrays.sort(employees, new SalaryComparator());
        System.out.println("Order of employee after sorting by employee salary is");
        System.out.println(buildEmployeeList(employees));

//        EXTRA Activity 4)
        Arrays.sort(employees, new NameComparator());
        System.out.println("Order of employee after sorting by name is");
        System.out.println(buildEmployeeList(employees));
    }

    static String buildEmployeeList(Employee[] employees) {
        var str = "";
        for (int i = 0; i < employees.length; i++) {
            var employee = employees[i];
            str += "Employee " + (i + 1) + " name :: " + employee.getName() +
                    ", Age :: " + employee.getAge() + ", Job tittle :: " + employee.getJobTitle() +
                    ", Company :: " + employee.getCompany() + ", Salary :: " + employee.getSalary() + "\n";
        }
        return str;
    }

    //    EXTRA Activity 2)
    static void textToFile(Employee[] employees) throws IOException {
        String text = buildEmployeeList(employees);
        Path fileName = Path.of("employees.txt");
        Files.writeString(fileName, text);
    }

}

