package FinalActivity.FirstActivity;

import java.util.*;

public class EmployeeTest {

    public static void main(String[] args) throws AgeFormatException, NameFormatException {
        Employee raj = new Employee();
        raj.setName("Raj Chatterjee");
        raj.setAge(36);
        raj.setCompany("Luxoft");
        raj.setJobTitle("QA");
        raj.setSalary(50000);

        Employee fred = new Employee();
        fred.setName("Fred Brown");
        fred.setAge(48);
        fred.setCompany("Microsoft");
        fred.setJobTitle("Developer");
        fred.setSalary(90000);

        Employee susan = new Employee();
        susan.setName("Susan Bones");
        susan.setAge(51);
        susan.setCompany("Apple");
        susan.setJobTitle("Accountant");
        susan.setSalary(60000);

        Employee chow = new Employee();
        chow.setName("Chow Nguyen");
        chow.setAge(21);
        chow.setCompany("Accenture");
        chow.setCompany("Analyst");
        chow.setSalary(25000);

        List<Employee> employees = new ArrayList<>();
        employees.add(raj);
        employees.add(fred);
        employees.add(susan);
        employees.add(chow);
        Collections.sort(employees, (Employee a, Employee b) -> a.getSalary() - b.getSalary());
        employees.forEach(System.out::println);

    }

}
