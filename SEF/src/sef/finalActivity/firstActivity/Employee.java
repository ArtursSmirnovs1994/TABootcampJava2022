package sef.finalActivity.firstActivity;

import java.util.Comparator;

public class Employee extends Person implements Comparable<Employee> {

    private String jobTitle;
    private String company;
    private int salary;

    public Employee () {
        setName("John");
        setAge(32);
        //System.out.println("I'm an Employee");
    }

    public Employee(String jobTitle, String company, int salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;

    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




    public String introducePerson() {
        return ("My name is " + getName() + "and I am " + getAge() +
                "years old\nI am working as " + getJobTitle() + "in " + getCompany());
    }

        public int compareTo(Employee compareEmployee) {

        int compareSalary = ((Employee) compareEmployee).getSalary();
        return compareSalary - this.salary;
}

 }


