package sef.Activity.First;

public class Employee extends Person {

    //	2.2) Create attributes: jobTitle, company, salary
    //	2.3) Add different constructors
    //	2.4) Add getters and setters
    //	2.5) Add method for introduce of person ->
    //	  "My name is <name> and i am <age> years old
    //	   I am work as <jobTitle> in <company>"

    private String jobTitle;
    private String company;
    private int salary;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void introduction() {
        System.out.printf("My Name is: %s and I am %d years old.\n", name, age);
        System.out.printf("I am work as: %s in %s and earn %d\n", jobTitle, company, salary);
    }

    public Employee(String name, int age) throws InvalidNameException {
        setName(name);
        this.age = age;
    }


    public static void main(String[] args) throws InvalidNameException {
        Employee employee = new Employee("Elena", 33);
        employee.setCompany("Clinic");
        employee.setJobTitle("Doctor");
        employee.setSalary(2500);
        employee.introduction();
    }
}
