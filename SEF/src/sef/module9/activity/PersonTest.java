package sef.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    int testWeight = 70;
    float testHeight = 1.70f;

    //TODO: create set up

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
        person.setHeight(testHeight);
        person.setWeight(testWeight); // Without the constructor

    }
    //TODO: create teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters

    public void testGetterTest() {
        assertEquals( testHeight, person.getHeight());
        assertEquals( testWeight, person.getWeight());
    }

    public void testSetterTest() {
        float newHeight = 1.2f;
        int newWeight = 90;
        person.setWeight(newWeight);
        person.setHeight(newHeight);
        assertEquals(1.2f, person.getHeight(), newHeight);
        assertEquals(90, person.getWeight(), newWeight);
    }

    //TODO: create unit test for getBodyMassIndex method

    public void testBMITest() {
        assertEquals("20.37037", person.calculateBMI(66, 1.8f));

    }




}
