package sef.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    int testWeight = 90;
    float testHeight = 190;


    //TODO: create set up

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
        person.setHeight(testHeight);
        person.setWeight(testWeight);
    }

    //TODO: create teardown

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters

    public void testGetWeight() {

        assertEquals(person.getWeight(),testWeight);
    }

    public void testSetWeight() {

        int settertestWeight = 95;
        person.setWeight(settertestWeight);
        assertEquals(person.getWeight(),settertestWeight);
    }

    public void testGetHeight() {

        assertEquals(person.getHeight(), testHeight);
    }

    public void testSetHeight() {

        float settertestHeight = 195;
        person.setHeight(settertestHeight);
        assertEquals(person.getHeight(),settertestHeight);
    }


    //TODO: create unit test for getBodyMassIndex method

    public void testBodyIndex() {


        assertEquals("0.0024930749", person.getBMI());

    }
}
