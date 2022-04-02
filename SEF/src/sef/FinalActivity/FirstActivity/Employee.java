package sef.FinalActivity.FirstActivity;

public class Employee extends Person {

    //Attributes
    private String jobTitle;
    private String company;
    private double salary;

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


    //Behavior
    //Default constructor
    public Employee() {
    }

    //Parametrized constructor
    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String introduction() {
       String message =super.introduction()+"I am work as " + jobTitle + " in " + company;
        return message;
    }
}
