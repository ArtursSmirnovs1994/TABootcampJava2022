package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
    private Employee employee1;
    private Employee employee2;
    private Employee employee3;

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        employee1 = new Employee("Anandu" ,25);
        employee1.setSalary(1000);
        employee1.setCompany("Accenture");
        employee1.setJobTitle("Developer");
        employee2 = new Employee("Sergey" ,27);
        employee2.setSalary(2000);
        employee2.setCompany("IBS");
        employee2.setJobTitle("Developer");
        employee3 = new Employee("Artus" ,28);
        employee3.setSalary(2800);
        employee3.setCompany("Accenture");
        employee3.setJobTitle("Tester");


    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void testSalary()
    {
        employee3.introduceEmployee();
        employee2.introduceEmployee();
        employee1.introduceEmployee();
    }

}
