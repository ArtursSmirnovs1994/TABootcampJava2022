package sef.finalActivity.firstActivity;

public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;

    public Employee(String name, int age, String jobTitle, String company, double salary) throws InvalidPersonNameException {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public Employee() {
        super();
        jobTitle = "";
        company = "";
        salary = 0;
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

    @Override
    public String introduction() {
        return super.introduction() + " I am working as " + jobTitle + " in " + company + ". My salary is " + salary;
    }
}
