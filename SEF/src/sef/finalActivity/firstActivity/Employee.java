package sef.finalActivity.firstActivity;

public class Employee extends Person {

    String jobTitle;
    String company;
    double salary;


    // Default constructor
    public Employee() {
        this.company = "Unknown";
        this.jobTitle = "Unknown";
        this.salary = 0;
    }

    // Parameterized constructor
    public Employee(String jobTitle, String company, double salary) {

        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public Employee(double salary){
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduceMe() {
        return ("My name is " + name + " and I am " + age + " years old\nI work as " + jobTitle + " in " + company);

    }



//    @Override
//    public String toString() {
//        return "Employee{" +
//                "salary=" + salary +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
