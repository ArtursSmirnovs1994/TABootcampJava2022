package sef.finalActivity.firstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    private Employee employee;
    private Employee employee1;
    private Employee employee2;
    String testCompany = "Smth";
    String testJobTitle = "Smth2";
    String testName = "Slartibartfast";

    protected void setUp() throws Exception {
        super.setUp();

        employee = new Employee();
        employee.setCompany(testCompany);
        employee.setJobTitle(testJobTitle);

        Employee employee1 = new Employee();
        employee1.setName("Slartibartfast");
        employee1.setJobTitle("No idea");
        employee1.setSalary(43214.56);
        employee1.setCompany("Universe");

        Employee employee2 = new Employee();
        employee2.setName("Marvin");
        employee2.setJobTitle("depressionator");
        employee2.setSalary(1234.56);
        employee2.setCompany("And Everything");

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetJobTitleAndCompany() {
        assertEquals(testCompany, employee.getCompany());
        assertEquals(testJobTitle, employee.getJobTitle());
        // assertEquals("And Everything", employee2.getCompany());
        //assertEquals(43214.56, employee1.getSalary());

    }

    public void testSetJobTitleAndCompany() {

        employee.setCompany(testCompany);
        assertEquals(testCompany, employee.getCompany());
        employee.setJobTitle(testJobTitle);
        assertEquals(testJobTitle, employee.getJobTitle());
    }

    public void testIntroduce() {
        String expected = "My name is " + employee.getName() + " and i am " + employee.getAge() + " years old\nI am work as " + employee.getJobTitle() + " in " + employee.getCompany();
        assertEquals(expected, employee.introduce());
    }


}
