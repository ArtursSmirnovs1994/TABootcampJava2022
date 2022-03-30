package sef.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    int testWeight = 75;
    float testHeight = 177.0f;

    // create set up
    public void setUp() {
        person = new Person(testWeight, testHeight);
    }

    // create teardown
    // not required

    // create unit tests for getters and setters
    public void testGetHeight() {
        assertEquals("Height getter test failed", testHeight, person.getHeight());
    }

    public void testGetWeight() {
        assertEquals("Weight getter test failed", testWeight, person.getWeight());
    }

    public void testSetHeight() {
        float updatedHeight = 175.0f;
        person.setHeight(updatedHeight);
        assertEquals("Height setter test failed", updatedHeight, person.getHeight());
    }

    public void testSetInvalidHeight() {
        float updatedHeight = 1175.0f;

        try {
            person.setHeight(updatedHeight);
            fail("Exception didn't occurred");
        } catch (IllegalArgumentException exception) {
            assertEquals("Invalid height setter message test failed",
                    "Height should be within 30..300 range",
                    exception.getMessage());
        } catch (Exception e) {
            fail("Exception of invalid type occurred");
        }
    }

    public void testSetWeight() {
        int updatedWeight = 73;
        person.setWeight(updatedWeight);
        assertEquals("Height setter test failed", updatedWeight, person.getWeight());
    }

    public void testSetInvalidWeight() {
        int updatedWeight = -1;

        try {
            person.setWeight(updatedWeight);
            fail("Exception didn't occurred");
        } catch (IllegalArgumentException exception) {
            assertEquals("Invalid weight setter message test failed",
                    "Weight should be within 1..200 range",
                    exception.getMessage());
        } catch (Exception e) {
            fail("Exception of invalid type occurred");
        }
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testGetBMI() {
        assertEquals("getBMI test failed", "0.0023939481", person.getBMI());
    }

}
