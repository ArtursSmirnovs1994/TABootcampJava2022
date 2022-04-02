package sef.FinalPackage.FirstActivity;

import org.w3c.dom.ls.LSOutput;

public class Employee extends Person {


    //Attributes
    private String jobTitle;
    private String company;
    private double salary;

    //Getters and Setters
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



    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Peter Parker");
        p.setAge(21);

        Employee e = new Employee();
        e.setCompany("your local neighborhood");
        e.setJobTitle("Spiderman");

        System.out.println("My name is " + p.getName() + " and I am " + p.getAge() + " years old.");
        System.out.println("I work as " + e.getJobTitle() + " in " + e.getCompany() + ".");

    }


}
