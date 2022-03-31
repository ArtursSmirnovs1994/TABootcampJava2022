package sef.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    int testWeight = 18;
    float testHeight = 0.90f;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();

        person = new Person();
        person.setHeight(testHeight);
        person.setWeight(testWeight);

    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testGetWeightAndHeight() {
        assertEquals(person.getWeight(), testWeight);
        assertEquals(person.getHeight(), testHeight);

    }

    public void testSetWeightAndHeight() {
        int testWeight2 = 65;
        float testHeight2 = 1.72f;
        person.setWeight(testWeight2);
        assertEquals(testWeight2, person.getWeight());
        person.setHeight(testHeight2);
        assertEquals(testHeight2, person.getHeight());
    }


    public void testCalculateBMI() {
        assertEquals("22.222223", (person.calculateBMI(testWeight, testHeight)));
    }

}
