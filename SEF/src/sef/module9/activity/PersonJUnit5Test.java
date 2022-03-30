package sef.module9.activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonJUnit5Test
{

    private Person person;
    int testWeight = 88;
    float testHeight = 1.888f;
    float testHeightCM = 188.8f;

    @Before
    public void setUp(){
        person = new Person(testWeight,testHeight);
    }

    @After
    public void myTearDown(){
    }

    @Test
    public void runGetterTest() {
        assertEquals("runGetterTest height", person.getHeight(), testHeight, 0f );
        assertEquals("runGetterTest weight", person.getWeight(), testWeight, 0f );
    }

    @Test
    public void runSetterTest() {
        int setterTestWeight = 77;
        float setterTestHeight = 1.777f;
        person.setHeight(setterTestHeight);
        person.setWeight(setterTestWeight);
        assertEquals("runSetterTest height", person.getHeight(), setterTestHeight, 0f );
        assertEquals("runSetterTest weight", person.getWeight(), setterTestWeight, 0f );
    }

    @Test
    public void runCalculateBMITest() {
        String testResult = person.calculateBMI(person.getWeight(), person.getHeight());
        String expectedResult = Float.toString(testWeight/(testHeight*testHeight) );
        System.out.println(expectedResult);
        assertEquals("runCalculateBMITest", expectedResult, testResult);
    }

}
