package sef.module9.activity;

import junit.framework.TestCase;


public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
     protected void setUp() throws Exception {
         super.setUp();
         person = new Person();
    }
    //TODO: create teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    //TODO: create unit tests for getters and setters
    public void testSetAndGetWeight() {
        int weight = 100;
        person.setWeight(weight);
        assertEquals(weight, person.getWeight());
    }

    public void testSetAndGetHeight() {
        float height = 1.80f;
        person.setHeight(height);
        assertEquals(height, person.getHeight());
    }


    //TODO: create unit test for getBodyMassIndex method
    public void testGetBMI() {
        int weight = 100;
        float height = 1.80f;
        //	Checks the BMI of a person with weight 100 and height 1.80
        assertEquals("30.8642", (person.BMI(height, weight)));

    }
    public void testThrowException(){

        try {

            person.BMI(2, 100);
            person.BMI(-1.8f, 100);
            person.BMI(1.8f, -100);
            person.BMI(0,0);
            person.BMI(1.8f, 0);
            person.BMI(-1.8f, 100);
            person.setHeight(-1.8f);
            person.setWeight(-100);
            person.setHeight(0.4f);
            person.setHeight(2.5f);
            person.setHeight(100.0f);
            person.setWeight(1000);
        } catch (Exception e) {
            fail();
        }
        catch (Error e) {
            fail();
        }
    }
}
