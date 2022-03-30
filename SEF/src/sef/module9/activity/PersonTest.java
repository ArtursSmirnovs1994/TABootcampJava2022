package sef.module9.activity;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest extends TestCase {

    private Person person;
    int testWeight = 88;
    float testHeight = 188.8f;

    //TODO: create set up
    //TODO: create teardown
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person(testWeight, testHeight);
    }

    @After
    protected void myTearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    @Test
    public void testGetter() {
        assertEquals("runGetterTest height", person.getHeight(), testHeight);
        assertEquals("runGetterTest weight", person.getWeight(), testWeight);
    }

    @Test
    public void testSetter() {
        int setterTestWeight = 77;
        float setterTestHeight = 1.777f;
        person.setHeight(setterTestHeight);
        person.setWeight(setterTestWeight);
        assertEquals("runSetterTest height", setterTestHeight, person.getHeight());
        assertEquals("runSetterTest weight", setterTestWeight, person.getWeight());
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testRunCalculateBMITest() {
        String testResult = person.calculateBMI();
        String expectResult = Float.toString(testWeight / (testHeight * testHeight));
        assertEquals("runCalculateBMITest", expectResult, testResult);
    }
}
