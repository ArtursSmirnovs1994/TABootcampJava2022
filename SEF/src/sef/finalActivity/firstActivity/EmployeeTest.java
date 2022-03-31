package sef.finalActivity.firstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class EmployeeTest  {
  public static void main(String[] args) {

    Employee employee[] = new Employee[3];
    employee[0] = new Employee();
    employee[0].setAge(34);
    employee[0].setName("Bill");
    employee[0].setSalary(3400.0);

    employee[1] = new Employee();
    employee[1].setAge(24);
    employee[1].setName("Janis");
    employee[1].setSalary(2990.0);

    employee[2] = new Employee();
    employee[2].setAge(56);
    employee[2].setName("James");
    employee[2].setSalary(1200.0);


    // Sorting and printing the list
    Arrays.sort(employee, new SalaryComparator());
    System.out.println("Employees sorted by their salaries: ");
    for(int i=0; i < employee.length; i++){
      System.out.println( "Employee " + (i+1) + " --> Name: " + employee[i].getName() + ", Salary: " + employee[i].getSalary());
    }

    testJobTitleGetterSetter(employee[0], "Cleaner");
    testCompanyGetterSetter(employee[1], "Director");
    // testSalaryGetterSetter(employee[2], 3000.0);
    testEmployeeIntroduction(employee[0], "Jake", 24, "Developer", "IBM");
    testEmployeeConstructor("Baker", "MikesBakery", 3500.0);
  }

  public static void testJobTitleGetterSetter(Employee employee, String jobTitle) {
    employee.setJobTitle(jobTitle);
    assertEquals(jobTitle, employee.getJobTitle());
  }

  public static void testCompanyGetterSetter(Employee employee, String company) {
    employee.setCompany(company);
    assertEquals(company, employee.getCompany());
  }

  public static void testSalaryGetterSetter(Employee employee, double salary) {
    employee.setSalary(salary);
    assertEquals(salary, employee.getSalary());
  }

  public static void testEmployeeIntroduction(
      Employee employee, String name, int age, String jobTitle, String company) {
    employee.setName(name);
    employee.setAge(age);
    employee.setJobTitle(jobTitle);
    employee.setCompany(company);
    assertEquals(
        "My name is "
            + name
            + " and I am "
            + age
            + " years old.\n I am work as "
            + jobTitle
            + " in "
            + company,
        "My name is "
            + employee.getName()
            + " and I am "
            + employee.getAge()
            + " years old.\n I am work as "
            + employee.getJobTitle()
            + " in "
            + employee.getCompany());
  }

  public static void testEmployeeConstructor(String jobTitle, String company, double salary) {
    Employee employee = new Employee(jobTitle, company, salary);
//    employee.setJobTitle(jobTitle);
//    employee.setCompany(company);
//    employee.setSalary(salary);
    assertEquals(jobTitle, employee.getJobTitle());
    assertEquals(company, employee.getCompany());
    // assertEquals(salary, employee.getSalary());
  }


}
