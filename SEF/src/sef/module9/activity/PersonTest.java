package sef.module9.activity;

import junit.framework.TestCase;
import sef.module9.activity.Person;
import static sef.module9.activity.Person.getBMI;

public class PersonTest extends TestCase {

    private Person person;
    int testWeight = 60;
    float testHeight = 1.8f;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        person = new Person(testWeight, testHeight);
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testGetters() {
        assertEquals(person.getWeight(), testWeight, 0);
        assertEquals(person.getHeight(), testHeight, 0);
    }

    public void testSetters() {
        int w = 80;
        float h = 1.7f;
        person.setWeight(w);
        person.setHeight(h);
        assertEquals(w, person.getWeight(), 0);
        assertEquals(h, person.getHeight(), 0);
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testGetBMI() {
        String expResult = Float.toString(testWeight / (testHeight * testHeight));
        String actResult = getBMI(person.getWeight(), person.getHeight());
        assertEquals(actResult, expResult);
    }
}
