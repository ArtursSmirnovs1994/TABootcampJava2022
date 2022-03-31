package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

import java.util.Arrays;


public class EmployeeTest extends TestCase {
    Employee[] employees = {
            new Employee("Jocelynn Allison", 24, "QA Tester", "Accenture"),
            new Employee("Robert Gibson", 20, "Java Developer", "Accenture"),
            new Employee("Lilianna Kaufman", 31, "AWS Cloud Engineer", "Accenture"),
            new Employee("Dylan Payne", 46, "DevOps specialist", "Accenture"),
            new Employee("Isabelle Guerrero", 37, "Test Lead", "Accenture")
    };

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        for (Employee e : employees) {
            System.out.println(e.introduceYourself() );
            System.out.println();
        }
    }

    public void testPrintSalaries() {
        Arrays.sort(employees, new Employee.salaryComparator() );
        System.out.println("Employees sorted by salary:");
        for (Employee e : employees) {
            System.out.printf("%s :: %d\n", e.getName(), e.getSalary());
        }
    }
}
