package FinalActivity.FirstActivity;

public class Employee extends Person {
    private String jobTitle;

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }

    private String company;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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

    //default constructor
    public Employee() {
        this.jobTitle = "unknown";
        this.company = "unknown";
        this.salary = 0;
    }

    // custom constructor
    public Employee(String jobTitle, String company, int salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I work as a " + getJobTitle() + " at a company " + getCompany());
        System.out.println("I earn "+ getSalary());
    }

    public static void main(String[] args) throws AgeFormatException, NameFormatException {
        Employee fred = new Employee();
        fred.setName("Fred Brown");
        fred.setAge(48);
        fred.setSalary(70000);
        fred.setCompany("Microsoft");
        fred.setJobTitle("Developer");
        fred.introduce();
    }
}

