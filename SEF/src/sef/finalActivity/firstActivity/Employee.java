package sef.finalActivity.firstActivity;

public class Employee extends Person {

    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = "jobTitle";
    }

    public Employee(String name, int age) {
        super(name, age);
        this.jobTitle = "Architect";
    }

    public Employee(String name) {
        super(name, 0);
        this.jobTitle = "Architect";
    }

    public void introduction() {
        System.out.println("My name is " + this.name + " and I work as an " + this.jobTitle);
    }

}


