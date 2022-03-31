package sef.finalActivity.firstActivity;

import java.util.*;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Alex");
        emp1.setAge(30);
        emp1.setJobTitle("Analyst");
        emp1.setSalary(50000);
        emp1.setCompany("Accenture");
        System.out.println("My name is " + emp1.getName() + " and I am " + emp1.getAge() +
                " years old\nI am working as " + emp1.getJobTitle() + " in " + emp1.getCompany() + " my salary is " + emp1.getSalary());

        Employee emp2 = new Employee();
        emp2.setName("Fiona");
        emp2.setAge(29);
        emp2.setJobTitle("Junior Developer");
        emp2.setSalary(40000);
        emp2.setCompany("Accenture");
        System.out.println("My name is " + emp2.getName() + " and I am " + emp2.getAge() +
                " years old\nI am working as " + emp2.getJobTitle() + " in " + emp2.getCompany() + " my salary is " + emp2.getSalary());


        Employee emp3 = new Employee();
        emp3.setName("Andris");
        emp3.setAge(39);
        emp3.setJobTitle("Senior Developer");
        emp3.setSalary(90000);
        emp3.setCompany("Accenture");
        System.out.println("My name is " + emp3.getName() + " and I am " + emp3.getAge() +
                " years old\nI am working as " + emp3.getJobTitle() + " in " + emp3.getCompany() + " my salary is " + emp3.getSalary());


        Employee emp4 = new Employee();
        emp4.setName("Berta");
        emp4.setAge(35);
        emp4.setJobTitle("Developer");
        emp4.setSalary(75000);
        emp4.setCompany("Accenture");
        System.out.println("My name is " + emp4.getName() + " and I am " + emp4.getAge() +
                " years old\nI am working as " + emp4.getJobTitle() + " in " + emp4.getCompany() + " my salary is " + emp4.getSalary());


        Employee emp5 = new Employee();
        emp5.setName("Fred");
        emp5.setAge(32);
        emp5.setJobTitle("Developer");
        emp5.setSalary(70000);
        emp5.setCompany("Accenture");
        System.out.println("My name is " + emp5.getName() + " and I am " + emp5.getAge() +
                " years old\nI am working as " + emp5.getJobTitle() + " in " + emp5.getCompany() + " my salary is " + emp5.getSalary());

        System.out.println("----------------------------------------------------");

        Employee[] employee = new Employee[5];

        Employee emp1s = new Employee(emp1.getJobTitle(),emp1.getCompany(), emp1.getSalary());
        Employee emp2s = new Employee(emp2.getJobTitle(),emp2.getCompany(), emp2.getSalary());
        Employee emp3s = new Employee(emp3.getJobTitle(),emp3.getCompany(),emp3.getSalary());
        Employee emp4s = new Employee(emp4.getJobTitle(),emp4.getCompany(),emp4.getSalary());
        Employee emp5s = new Employee(emp5.getJobTitle(),emp5.getCompany(),emp5.getSalary());

        employee[0]=emp1s;
        employee[0].setName("Alex");
        employee[1]=emp2s;
        employee[1].setName("Fiona");
        employee[2]=emp3s;
        employee[2].setName("Andris");
        employee[3]=emp4s;
        employee[3].setName("Berta");
        employee[4]=emp5s;
        employee[4].setName("Fred");
        Arrays.sort(employee);

    int i=0;
    for(Employee temp: employee){
    System.out.println("Employee " + ++i + " " + temp.getName() + " " + temp.getJobTitle() + " Salary: " + temp.getSalary());}


    }
    }

