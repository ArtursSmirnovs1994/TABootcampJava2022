package sef.FinalActivity.FirstActivity;

public class Employee extends Person{
    String jobTitle;
    String company;
    int salary;

    public Employee() {

    }

    // Parameterized constructor
    public Employee(String name,int age) throws PersonCustomException {
        this.setAge(age);
        this.setName(name);
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getJobTitle(){
        return  jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public  void introduceEmployee()
    {
        System.out.println("My Name is "+name+" and i am "+age+ " years old"+ " I am Work as" +jobTitle+" in "+company);
    }
}

