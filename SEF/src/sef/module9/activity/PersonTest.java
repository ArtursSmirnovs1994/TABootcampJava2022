package sef.module9.activity;

import junit.framework.TestCase;


public class PersonTest extends TestCase {


    //TODO: create set up
    private Person person;
    int testWeight;
    float testHeight;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        person = new Person(testWeight, testHeight);
    }
    //TODO: create teardown
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
    //TODO: create unit tests for getters and setters
    public void testGetHeight() {
        assertEquals(testHeight, person.getHeight());
    }
    public void testSetHeight()  {
        person.setHeight(testHeight);
        assertEquals(testHeight, person.getHeight());
    }
    public void testGetWeight() {
        assertEquals(testWeight, person.getWeight());
    }
    public void testSetWeight()  {
        person.setHeight(testWeight);
        assertEquals(testWeight, person.getWeight());
    }
    //TODO: create unit test for getBodyMassIndex method
    public void testBMI()  {
        assertEquals(Double.toString(testWeight/(testHeight*testHeight)), person.BMI(testWeight, testHeight));
    }

}
