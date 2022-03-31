package sef.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    int testWeight = 6;
    float testHeight = 8.2f;

    //TODO: create set up
    protected void settUp() throws Exception {
        super.settUp();
        person = new Person(testWeight, testHeight);
        }

    //TODO: create teardown
    protected void tearrDown() throws Exception{
        super.tearrDown();
    }

    //TODO: create unit tests for getters and setters
    public void testGetter () {
        assertEquals("getterTest Height", person.getWeight(), testHeight, 0);
        assertEquals("gettertTest weight", person.getWeight(), testWeight, 0);
        //int a = 50;
        //int b = 100;
        //int c = 150;
    }

    public void testSetter () {
        int setterTestWeight = 77;
        float setterTestHeight = 168.4f;
        person.setWeight(setterTestWeight);
        person.setHeight(setterTestHeight);
        assertEquals("runSetterTest Height", person.getHeight(), setterTestHeight, 0);
        assertEquals("rusSetter weight", person.getWeight(), setterTestWeight,0);


        //float x = 0.9f;
        //float y = 1.5f;
        //float z = 1.9f;

    }

    //TODO: create unit test for getBodyMassIndex method
    public void testGetBodyMassIndex () {
        String testResult = person.bmi(person.getWeight(), person.getHeight());
        String expectedResult = Float.toString(testWeight/(testHeight*testHeight));
        assertEquals("runCalculateBMITest",expectedResult,testResult);

    }


}





