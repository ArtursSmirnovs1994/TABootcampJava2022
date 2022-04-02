package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonTest extends TestCase {

    private Person person;
    String testName = "Samurai Akira";
    int testAge = 99;

    // set up

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
        person.setName(testName);
        person.setAge(testAge);
    }
    //tearDown
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //unit tests for getters and setters

    public void testGetName() {
        assertEquals(person.getName(), testName);
    }

    public void testSetName() {

        String setterTestName = "Samurai Akira";
        person.setName(setterTestName);
        assertEquals(person.getName(), setterTestName);
    }

    public void testGetAge() {
        assertEquals(person.getAge(), testAge);
    }

    public void testSetAge() {

        String setterTestName = "Samurai Akira";
        person.setName(setterTestName);
        assertEquals(person.getName(), setterTestName);
    }

    public void testPersonAnnounce() {
        assertEquals("My name is: Samurai Akira and I am 99 years old", person.announcePerson());
    }
}



