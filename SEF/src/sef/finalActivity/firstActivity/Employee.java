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
        jobTitle = "president";
        company = "Galaxy";
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

    public String introduce() {
        String statement = "My name is " + getName() + " and i am " + getAge() + " years old\nI am work as " + getJobTitle() + " in " + getCompany();
        return statement;
    }
}
