package sef.finalActivity.firstActivity;

public class Employee extends Person {
    private String jobTitle;
    private String company;
    private double salary;

    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public Employee() {
        this.jobTitle = "Unknown title";
        this.company = "Unknown company";
        this.salary = 100.0;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void employeeIntroduction(String name, int age, String jobTitle, String company) {
        System.out.println("My name is " + name + " and I am " + age + " years old.\n I am work as " + jobTitle + " in " + company);
    }
}
