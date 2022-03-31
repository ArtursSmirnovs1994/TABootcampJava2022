package sef.final_activities.extra;

// class for demonstrating complex sort
public class Employee {

    private String firstName;
    private String lastName;

    private int age;

    private String jobTitle;
    private String companyName;

    private int salary;

    public Employee(String firstName, String lastName, int age, String jobTitle, String companyName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                "\n";
    }
}
