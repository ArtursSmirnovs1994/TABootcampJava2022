package sef.FinalActivity.FirstActivity;

public class Employee extends Person implements Comparable<Employee>{
    //Attributes
    private String jobTitle;
    private String company;
    private float salary;

    //Behavior
    //TODO: write default constructor
    public Employee(){
        System.out.println("I'm Employee's Default Constructor");
    }

    //TODO: Write parameterized constructor
    public Employee(String name, int age, String jobTitle, String company, float salary) throws PersonCustomException{
        this.setName(name);
        this.setAge(age);
        this.jobTitle=jobTitle;
        this.company=company;
        this.salary=salary;
        System.out.println("I'm Employee's Constructor, name: " + name + ", age: " + age);
        System.out.println("Company: " + company + ", job: " + jobTitle + ", salary: " + salary);
    }

    //TODO: write getter for jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    //TODO: write setter for jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //TODO: write getter for company
    public String getCompany() {
        return company;
    }

    //TODO: write setter for company
    public void setCompany(String company) {
        this.company = company;
    }

    //TODO: write getter for salary
    public float getSalary() {
        return salary;
    }

    //TODO: write setter for salary
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void Introduction(){
        //System.out.println("Intro: My name is " + this.getName() + " and I am " + this.getAge() + " years old");
        //System.out.println("I work as " + jobTitle + " in " + company + ", my salary is " + salary);
        System.out.println("Intro: My name is " + this.getName() + " and I am " + this.getAge() + " years old. I work as " + jobTitle + " in " + company + ", my salary is " + salary);
    }

    @Override
    public int compareTo(Employee o) {
        //return this.getName().compareTo(o.getName());
        return Float.compare(this.getSalary(),o.getSalary());
    }
}
