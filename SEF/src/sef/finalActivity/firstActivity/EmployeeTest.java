package sef.finalActivity.firstActivity;

import junit.framework.TestCase;

public class EmployeeTest {

    private Employee employee = new Employee();         //4.2 create a few employees, so far i made one
    int age = 21;
    String name = "Plantera";                           // <3
    String jobTitle = "Jungle boss";
    String company = "Underground Jungle";
    double salary = 300.00;

    private Employee employee1 = new Employee();        // would you look at that another employee
    int age1 = 21;
    String name1 = "The Twins";
    String jobTitle1 = "Surface boss";
    String company1 = "Surface";
    double salary1 = 430.00;

    protected void setUp() throws Exception {}

    protected void tearDown() throws Exception {
        tearDown();
    }

    //TODO 4.3 prints from top salary to less
    // gon be honest i do not know

}
