package sef.finalActivity.firstActivity;

import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class PersonTest extends TestCase {

    private Person person;
    static final String testName = "Monica";
    static final int testAge = 18;

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person(testName, testAge);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetName() {
        assertEquals(testName, person.getName());
    }

    public void testGetAge() {
        assertEquals(testAge, person.getAge());
    }

    public void testSetValidName() throws InvalidPersonNameException {
        var newName = "Lucas";
        person.setName(newName);
        assertEquals(newName, person.getName());
    }

    public void testSetInvalidName() {
        var exceptionThrown = false;
        try {
            person.setName("Lucas7");
        }
        catch (InvalidPersonNameException e) {
            exceptionThrown = true;
        }
        assertTrue("expected exception to be thrown", exceptionThrown);
    }

    public void testSetAge() {
        int newAge = 55;
        person.setAge(newAge);
        assertEquals(newAge, person.getAge());
    }

    public void testIntroduction() {
        assertEquals("My name is Monica and I am 18 years old.", person.introduction());
    }
}
