package sef.module9.activity;

import junit.framework.TestCase;


public class PersonTest extends TestCase {

    private Person person;
    int testWeight = 80;
    float testHeight = 1.80f;

    //TODO: create set up
    //TODO: create teardown
    protected void setUp() throws Exception {
        super.setUp();

        person = new Person();
        person.setHeight(testHeight);
        person.setWeight(testWeight);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testGetWeight() {

        assertEquals(person.getWeight(),testWeight);

    }

    public void testSetWeight() {

        int newWeight = 75;
        person.setWeight(newWeight);
        assertEquals(person.getWeight(),newWeight);

    }

    public void testGetHeight() {

        assertEquals(person.getHeight(),testHeight);
    }

    public void testSetHeight() {

        float newHeight = 1.45f;
        person.setHeight(newHeight);
        assertEquals(person.getHeight(),newHeight);

    }


    //TODO: create unit test for getBodyMassIndex method
    public void testBodyIndex() {

        assertEquals("24.69136", person.bodyIndex());

    }
}
