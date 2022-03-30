package sef.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    int testWeight = 60;
    float testHeight = 172.5f;

    //TODO: create set up

    //TODO: create teardown

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        person = new Person();
        person.setHeight(testHeight);
        person.setWeight(testWeight);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }


    //TODO: create unit tests for getters and setters
    public void testGetterTest() {
        assertEquals(testHeight, person.getHeight());
        assertEquals(testWeight, person.getWeight());
    }

    public void testSetterTest() {
        int newWeight = 65;
        person.setWeight(newWeight);
        assertEquals(person.getWeight(),newWeight);
        float newHeight = 170.6f;
        person.setHeight(newHeight);
        assertEquals(person.getHeight(),newHeight);

    }

    //TODO: create unit test for getBodyMassIndex method
        public void testgetBMI() {
        assertEquals("0.0020163832", person.getBMI());

}

}
