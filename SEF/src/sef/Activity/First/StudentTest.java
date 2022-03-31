package sef.Activity.First;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StudentTest extends TestCase {

    Students st1;

    //TODO: create set up
    //TODO: create teardown
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        st1 = new Students();
    }

    @After
    protected void myTearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    @Test
    public void testGetter() throws InvalidNameException {
        st1.setName("Elena");
        st1.setAge(33);
        st1.setSchoolName("Accenture bootcamp");
        assertEquals("Elena", st1.getName());
        assertEquals(33, st1.getAge());
        assertEquals("Accenture bootcamp", st1.getSchoolName());
    }

    @Rule
    public ExpectedException exceptionRule = null;

    //Don't know how make it working correctly.
    @Test//(expected = InvalidNameException.class)
    public void invalidNameTest() throws InvalidNameException {
        exceptionRule.expect(InvalidNameException.class);
        st1.setName("Demo1");
    }
}

