package sef.FinalActivity.FirstActivity;

import java.util.Comparator;
import java.util.Random;

public class Employee extends Person {

    public Employee(String jobTitle, String company) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = assignSalary();
    }

    public Employee(String name, int age, String jobTitle, String company) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = assignSalary();

    }
    private String jobTitle;
    private String company;

    int salary;

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

    @Override
    public String introduceYourself() {
        String introduction = super.introduceYourself();
        introduction += String.format("\nI work as %s at %s. My salary is %d", jobTitle, company, salary);
        return introduction;
    }

    private int assignSalary() {
        int min = 15;
        int max = 50;
        int newSalary = new Random().nextInt(max - min) + min;
        newSalary *= 100;
        return newSalary;
    }

    public static class salaryComparator implements Comparator {
        public int compare(Object emp1, Object emp2) {
            int salary1 = ((Employee) emp1).getSalary();
            int salary2 = ((Employee) emp2).getSalary();
            return salary2 - salary1;
        }
    }
}
