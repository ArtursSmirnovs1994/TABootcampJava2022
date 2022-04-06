package sef.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    int testWeight=80;
    float testHeight=150;


    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person(testWeight,testHeight);
        //person.getWeight();
        //person.getHeight();


    }
    //TODO: create teardown
    protected void tearDown() throws Exception {
            super.tearDown();
    }
    //TODO: create unit tests for getters and setters
    public void testGetterstest(){
        assertEquals("",person.getHeight(),testHeight);
        assertEquals("",person.getWeight(),testWeight);
    }
public void testSetterstest(){

        person.setHeight(testHeight);
        person.setWeight(testWeight);

        assertEquals("RunTestSettersWeight",testWeight,person.getWeight());
        assertEquals("RunTestSettersHeight",testHeight,person.getHeight());
}


    //TODO: create unit test for getBodyMassIndex method
public void testBMItest(){

        String testResultBMI=person.BMIcalculator(person.getWeight(), person.getHeight());
        String expectedResult=Float.toString(testWeight/(testHeight*testWeight));
        assertEquals("",testResultBMI,expectedResult);
}

}
