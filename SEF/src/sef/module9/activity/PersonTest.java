package sef.module9.activity;

import junit.framework.TestCase;
import sef.FinalActivity.FirstActivity.PersonCustomException;
import sef.module9.activity.Person;

public class PersonTest extends TestCase {

    private Person person;
    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    //TODO: create unit tests for getters and setters
    public void testSetAndGetHeight()
    {
        float testHeight = 130;
        assertEquals(0.0,person.getHeight(),0);
        person.setHeight(testHeight);
        assertEquals(testHeight, person.getHeight(),0);
    }
    public void testSetAndGetWeight()
    {
        int testWeight = 60;
        assertEquals(0.0,person.getWeight(),0);
        person.setWeight(testWeight);
        assertEquals(testWeight, person.getWeight(),0);
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testGetBodyMassIndex() {
        assertEquals("0.00234375", (person.getBodyMassIndex(60,160)));
    }






}
