package sef.module9.activity;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {

    private Person person;
    int testWeight = 88;
    float testHeight = 1.888f;
    float testHeightCM = 188.8f;
    float testHeightMM = 1888f;
    //TODO: create set up
    //TODO: create teardown
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person(testWeight,testHeight);
    }

    protected void myTearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testGetter() {
        assertEquals("runGetterTest height", testHeight, person.getHeight() );
        assertEquals("runGetterTest height cm", testHeightCM/100, person.getHeight() );
        assertEquals("runGetterTest height mm", testHeightMM/1000, person.getHeight() );

        assertEquals("runGetterTest weight", testWeight, person.getWeight() );
    }

    public void testSetter() {
        int setterTestWeight = 77;
        float setterTestHeight = 1.777f;
        float setterTestHeightCM = 177.7f;
        float setterTestHeightMM = 1777f;
        person.setHeight(setterTestHeight);
        person.setWeight(setterTestWeight);
        assertEquals("runSetterTest height", setterTestHeight, person.getHeight() );
        person.setHeight(setterTestHeightCM);
        assertEquals("runSetterTest height cm", setterTestHeight, person.getHeight() );

        person.setHeight(setterTestHeightMM);
        assertEquals("runSetterTest height mm", setterTestHeight, person.getHeight() );
        assertEquals("runSetterTest weight", setterTestWeight,  person.getWeight() );
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSetterExceptionLowerBoundary() {
        try {
            person.setHeight(-0.1f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSetterExceptionUpperBoundary() {
        try {
            person.setHeight(10001);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testCalculateBMI() {
        String testResult = person.calculateBMI(person.getWeight(), person.getHeight());
        String expectedResult = Float.toString(testWeight/(testHeight*testHeight) );
        System.out.println(expectedResult);
        assertEquals("runCalculateBMITest", expectedResult, testResult);
    }

}
