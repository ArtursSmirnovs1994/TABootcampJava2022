package sef.finalActivity.firstActivity;

public class Employee extends Person{               //2.1 extending person class

    public String jobTitle;                         //2.2 create some more attributes
    public String company;
    public double salary;                           //2.3 i guess this is different constructor

    public Employee(int age, String name) {
        super(age, name);
    }

    public Employee () {
        super();
        this.jobTitle = "jobless";
        this.company = "no job place";
        this.salary = 0;
    }


    public String getJobTitle() {                   //2.4 generate getters and setters
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


    public void fullIntro () {                      //2.5 intro two - electric boogaloo
        intro();
        System.out.println("I work as " + jobTitle + "in " + company);
    }


}
