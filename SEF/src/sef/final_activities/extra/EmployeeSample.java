package sef.final_activities.extra;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSample {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("John", "Smith", 35, "dev", "Comp", 1200),
                new Employee("Marta", "Smith", 29, "tester", "Comp", 1200),
                new Employee("Erika", "Holmes", 22, "engineer", "comp", 2000),
                new Employee("Lina", "Reine", 44, "director", "comp", 9000),
                new Employee("Sergey", "Propper", 55, "worker", "comp", 500),
                new Employee("Samantha", "Miln", 19, "secretary", "comp", 1700),
                new Employee("John", "Krombacher", 58, "driver", "comp", 1200),
                new Employee("Michael", "Scott", 46, "manager", "comp", 3000),
                new Employee("Anna", "Mann", 28, "dev", "comp", 1200),
                new Employee("Anna", "Heine", 35, "manager", "comp", 3000)
        };

        // print all employees before sort, in adding order
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                int compareNames = employee1.getFirstName().compareTo(employee2.getFirstName());

                // if first names are equal, we try second names
                if (compareNames == 0) {
                    return employee1.getLastName().compareTo(employee2.getLastName());
                }

                return compareNames;
            }
        });

        // after sort, notice employees with equal first names got sorted by second names
        System.out.println(Arrays.toString(employees));

    }

}
