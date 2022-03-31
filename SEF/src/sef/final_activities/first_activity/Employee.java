package sef.final_activities.first_activity;

public class Employee extends Person {

    private String jobTitle;
    private String company;

    private int salary;

    public Employee(String name, int age, String jobTitle, String companyName, int salary) {
        super(name, age);
        setJobTitle(jobTitle);
        setCompany(companyName);
        setSalary(salary);
    }

    public Employee(Person person, String jobTitle, String companyName, int salary) {
        this(person.getName(), person.getAge(), jobTitle, companyName, salary);
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary <= 0) {
            throw new PersonParametersException("Salary must be positive");
        }
        this.salary = salary;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("I am working as a %s in %s\n", getJobTitle(), getCompany());
    }

    public String toString() {
        return String.format("Employee{name: %s, age: %d, job title: %s, company: %s, salary: %d}\n",
                getName(), getAge(), getJobTitle(), getCompany(), getSalary());
    }
}
