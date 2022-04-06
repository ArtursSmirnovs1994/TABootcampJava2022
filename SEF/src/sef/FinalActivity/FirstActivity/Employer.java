package sef.FinalActivity.FirstActivity;

public class Employer extends Person{
    private String jobTitle;
    private String company;
    private int salary;



    public Employer(){
    this.company="SEVERSTAL";
    this.jobTitle="BRIDER";
    this.salary=0;}


    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    public void EmployerIntroduce() {
        System.out.println("My name is\t" + getName()+" i am\t"+getAge()+" years old. I am work as\t"+getJobTitle()+" in\t"+getCompany()+" my salary is\t"+getSalary() );}
}
