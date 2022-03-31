package sef.module9.activity;

import junit.framework.TestCase;
import sef.module9.sample.Product;

public class PersonTest extends TestCase {

    private Person person;

    int testWeight = 88;
    float testHeight = 188.8f;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person(testWeight, testHeight);
        person.setWeight(testWeight);
        person.setHeight(testHeight);
    }

    //TODO: create teardown
    protected void tearDown () throws Exception {
        super.tearDown();

    }

    //TODO: create unit tests for getters and setters
    public void testGetWeight() {

        assertEquals("runGetterTest weight", person.getWeight(), testWeight, 0);
        assertEquals("runGetterTest height", person.getHeight(), testWeight, 0);

    }

    public void testrunSetterTest() {
        int setterTestWeight = 77;
        float setterTestHeight = 177.7f;
        person.setHeight(setterTestHeight);
        person.setWeight(setterTestWeight);
        assertEquals("runGetterTest weight", person.getWeight(), testWeight, 0);
        assertEquals("runGetterTest height", person.getHeight(), testWeight, 0);

    }

    //TODO: create unit test for getBodyMassIndex method
   public void testrunCalculateBMITest() {
    String testResult = person.calculateBMI(person.getWeight(), person.getHeight());
    String expectedResult = Float.toString((testWeight/(testHeight*testHeight)));
        assertEquals("runCalculateBMITest" , expectedResult, testResult); ;

    }

}
