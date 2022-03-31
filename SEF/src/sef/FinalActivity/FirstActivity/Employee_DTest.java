package sef.FinalActivity.FirstActivity;

import java.io.IOException;
import java.util.*;
import java.io.FileWriter;

public class Employee_DTest {

    public static void main (String[] args) throws IOException {

        Employee_D emp1 = new Employee_D();
        emp1.setName("John");
        emp1.setAge(22);
        emp1.setJobTitle("Analyst");
        emp1.setCompany("Google");
        emp1.setSalary(1500);

        Employee_D emp2 = new Employee_D();
        emp2.setName("Peter");
        emp2.setAge(32);
        emp2.setJobTitle("Developer");
        emp2.setCompany("Amazon");
        emp2.setSalary(3000);

        Employee_D emp3 = new Employee_D();
        emp3.setName("Anna");
        emp3.setAge(35);
        emp3.setJobTitle("Tester");
        emp3.setCompany("Accenture");
        emp3.setSalary(2000);

        Employee_D emp4 = new Employee_D();
        emp4.setName("Elsa");
        emp4.setJobTitle("Queen");
        emp4.setCompany("Arendelle");
        emp4.setSalary(5000);

        Employee_D emp5 = new Employee_D();
        emp5.setName("Olaf");
        emp5.setJobTitle("Snowman");
        emp5.setCompany("Arendelle");
        emp5.setSalary(200);

        List<Employee_D> emp = new ArrayList<>(Arrays.asList(
                emp1, emp2, emp3, emp4, emp5
        ));

        Comparator<Employee_D> bySalary = Comparator.comparing(Employee_D::getSalary);
        Collections.sort(emp, bySalary.reversed());

        System.out.println("An employee list sorted by salary");
        for (Employee_D str: emp) {
            System.out.println(str.getName() + "\t" + str.getJobTitle() + "\t" + str.getSalary());
        }

        // EXTRA activity 2
        FileWriter writer = new FileWriter("src/sef/FinalActivity/FirstActivity/Employees.txt");
        writer.write("List of employees sorted by salary:" + System.lineSeparator());
        writer.write("Name \tJob Title \t Salary" + System.lineSeparator());
        for (Employee_D str: emp) {
            writer.write(str.getName() + "\t" + str.getJobTitle() + "\t" + str.getSalary() + System.lineSeparator());
        }
        writer.close();


        //EXTRA activity 4
        // sorting by name
        Comparator<Employee_D> byName = Comparator.comparing(Employee_D::getName);
        Collections.sort(emp, byName);

        System.out.println("An employee list sorted by name");
        for (Employee_D str: emp) {
            System.out.println(str.getName() + "\t" + str.getJobTitle());
        }

    }
}
