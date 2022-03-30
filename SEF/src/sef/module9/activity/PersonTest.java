package sef.module9.activity;

import junit.framework.TestCase;


public class PersonTest extends TestCase {

    private Person person;
    private int testWeight = 100;
    private float testHeight = 2.00f;

    //TODO: create set up
    protected void setUp() throws Exception {
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        System.out.println("Running: tearDown");
        person = null;
        assertNull(person);
    }

    //TODO: create unit tests for getters and setters
    public void testSetAndGetWeight() {
        assertEquals(0, person.getWeight());
        person.setWeight(testWeight);
        assertEquals(testWeight, person.getWeight());
    }

    public void testSetAndGetHeight() {
        assertEquals(0f,person.getHeight());
        person.setHeight(testHeight);
        assertEquals(testHeight, person.getHeight());
    }


    //TODO: create unit test for getBodyMassIndex method
    public void testGetBodyIndex() {
        String BMI = "25.0";
        person.setWeight(testWeight);
        person.setHeight(testHeight);
        assertEquals(BMI, person.getBodyIndex());
    }

}
