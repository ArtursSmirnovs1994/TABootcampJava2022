package sef.finalactivity.firstactivity;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import sef.finalactivity.secondactivity.calculator;
import sef.module3.sample.Person;

public class EmployeeTest extends TestCase {
    // private person Persontest;


    protected void setUp() throws Exception {

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void test_with_all_upercase() {

        person per = new person();
        assertEquals(true,(per.Employee("SIVA",11,"dev","acc",2000,"bishop")));

    }

    @Test
    public void test_with_all_lowercase() {

        person per = new person();
        assertEquals(true,(per.Employee("siva",11,"dev","acc",2000,"bishop")));

    }

    @Test
    public void test_with_uppercand_and_lowercase() {

        person per = new person();
        assertEquals(true,(per.Employee("Siva",11,"dev","acc",2000,"bishop")));

    }

    @Test
    public void test_with_uppercase_and_numbers() {

        person per = new person();
        assertEquals(false,(per.Employee("SIVA123",11,"dev","acc",2000,"bishop")));

    }

    @Test
    public void test_with_lowercase_and_numbers() {

        person per = new person();
        assertEquals(false,(per.Employee("siva123",11,"dev","acc",2000,"bishop")));

    }

    @Test
    public void test_with_numbers() {
        person per = new person();
        assertEquals(false,(per.Employee("123",11,"dev","acc",2000,"bishop")));

    }


    //Salary test
    @Test
    public void test_with_greater_than_1() {
        person per = new person();
        assertEquals(true,(per.Employee("Siva",11,"dev","acc",2,"bishop")));

    }

    @Test
    public void test_with_5000() {
        person per = new person();
        assertEquals(true,(per.Employee("Siva",11,"dev","acc",5000,"bishop")));

    }

    @Test
    public void test_with_minus_value() {
        person per = new person();
        assertEquals(true,(per.Employee("Siva",11,"dev","acc",-5000,"bishop")));

    }

    @Test
    public void test_with_greater_than_100000() {
        person per = new person();
        assertEquals(true,(per.Employee("Siva",11,"dev","acc",200000,"bishop")));

    }


}