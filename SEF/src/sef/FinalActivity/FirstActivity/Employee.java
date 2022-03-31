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

    public String getFirstName() {
        return getName().substring(0, getName().indexOf(' '));
    }

    public String getSecondName() {
        return getName().substring(getName().indexOf(' '));
    }

    public static class salaryComparator implements Comparator<Employee> {
        public int compare(Employee emp1, Employee emp2) {
            int salary1 = emp1.getSalary();
            int salary2 = emp2.getSalary();
            return salary2 - salary1;
        }
    }

    public static class firstNameComparator implements Comparator<Employee> {
        public int compare(Employee emp1, Employee emp2) {
            String firstName1 = emp1.getFirstName();
            String firstName2 = emp2.getFirstName();
            return firstName1.compareTo(firstName2);
        }
    }

    public static class secondNameComparator implements Comparator<Employee> {
        public int compare(Employee emp1, Employee emp2) {
            String secondName1 = emp1.getSecondName();
            String secondName2 = emp2.getSecondName();
            return secondName1.compareTo(secondName2);
        }
    }
}
