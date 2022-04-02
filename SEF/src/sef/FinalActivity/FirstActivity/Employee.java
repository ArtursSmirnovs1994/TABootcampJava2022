package sef.FinalActivity.FirstActivity;

import java.util.Comparator;

public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;

    //Default constructor

    public Employee() {

        this.jobTitle = "Unknown";
        this.company = "Unknown";
        this.salary = 0;
    }

    //Parametrized constructor for paid Employee
    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    //Parametrized constructor for unpaid Employee
    public Employee(String jobTitle, String company) {
        this.jobTitle = jobTitle;
        this.company = company;

    }

    //Getters and setters
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Method announceEmployee to introduce a person with name, age, jobTitle and company

    public void announceEmployee() {
        System.out.println("My name is: " +getName() +" and I am " +getAge() + " years old. I work as " +jobTitle +" in " +company +".");
    }

    //We have created a method "compare" to sort employees by salary, descending. To use in EmployeeTest

    public static Comparator<Employee> EmployeeSalaryAmount = new Comparator<Employee>() {

        public int compare(Employee s1, Employee s2) {

            double salary1 = s1.getSalary();
            double salary2 = s2.getSalary();
            return Double.compare(salary2,salary1);


        }
    };

}