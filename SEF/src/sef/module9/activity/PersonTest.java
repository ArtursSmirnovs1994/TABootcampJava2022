package sef.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    static final int testWeight = 60;
    static final float testHeight = 1.50f;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person(testWeight, testHeight);
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testGetWeight() {
        assertEquals(testWeight, person.getWeight());
    }

    public void testSetWeight() {
        int newWeight = 88;
        person.setWeight(newWeight);
        assertEquals(newWeight, person.getWeight());
    }

    public void testGetHeight() {
        assertEquals(testHeight, person.getHeight());
    }

    public void testSetHeight() {
        float newHeight = 1.90f;
        person.setHeight(newHeight);
        assertEquals(newHeight, person.getHeight());
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testGetBodyMassIndex() {
        assertEquals("26.666666", person.getBodyMassIndex());
    }

}
