package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    private Person person;
    private String testName = "John Doe";
    private int testAge = 23;

    //TODO: create set up
    protected void setUp() throws Exception {
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testSetAndGetName() throws PersonCustomException {
        assertNull(person.getName());
        person.setName(testName);
        assertEquals(testName, person.getName());
    }

    public void testSetAndGetAge() {
        assertEquals(0, person.getAge());
        person.setAge(testAge);
        assertEquals(testAge, person.getAge());
    }

    public void testConstructorParams() {
        person = new Person(testName, testAge);
        assertEquals(testName, person.getName());
        assertEquals(testAge, person.getAge());
    }

    public void testIntroduction() {
        person = new Person(testName, testAge);
        person.Introduction();
    }

    public void testInvalidName() {
        person = new Person();
        try {
            //try to set invalid name
            person.setName("Name with 123");
        } catch (PersonCustomException pce) {
            String expectedMessage = "Personal exception: Name is not correct, should be only letters a-z/A-Z";
            assertEquals(expectedMessage, pce.getMessage());
        }
    }
}