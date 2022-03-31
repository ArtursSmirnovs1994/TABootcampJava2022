package sef.FinalActivity.extra;

import junit.framework.TestCase;
import sef.FinalActivity.FirstActivity.Employee;

import java.util.Arrays;


public class EmployeeExtraTest extends TestCase {
    Employee[] employees = {
            new Employee("Jocelynn Allison", 24, "QA Tester", "Accenture"),
            new Employee("Robert Gibson", 20, "Java Developer", "Accenture"),
            new Employee("Lilianna Kaufman", 31, "AWS Cloud Engineer", "Accenture"),
            new Employee("Dylan Payne", 46, "DevOps specialist", "Accenture"),
            new Employee("Isabelle Guerrero", 37, "Test Lead", "Accenture")
    };

    public void testPrintByFirstName() {
        Arrays.sort(employees, new Employee.firstNameComparator() );
        System.out.println("\nEmployees sorted by first name:");
        for (Employee e : employees) {
            System.out.printf("%s :: %s\n", e.getName(), e.getFirstName());
        }
    }

    public void testPrintBySecondName() {
        Arrays.sort(employees, new Employee.secondNameComparator() );
        System.out.println("\nEmployees sorted by second name:");
        for (Employee e : employees) {
            System.out.printf("%s :: %s\n", e.getName(), e.getSecondName());
        }
    }

    public void testPrintEmployeesToFile() {

    }
}
