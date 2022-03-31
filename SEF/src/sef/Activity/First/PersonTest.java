package sef.Activity.First;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest extends TestCase {

    Person person;

    //TODO: create set up
    //TODO: create teardown
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    @After
    protected void myTearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    @Test
    public void testGetter() throws InvalidNameException {
        person.setName("Elena");
        person.setAge(33);
        assertEquals("Elena", person.getName());
        assertEquals(33, person.getAge());
    }

    //Don't know how make it working correctly.
    @Test(expected = InvalidNameException.class)
    public void invalidNameTest() throws InvalidNameException {
        person.setName("Demo1");
    }
}
