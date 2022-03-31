package sef.finalActivity.firstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {


    private Person person;
    String testName = "Marvin";
    int testAge = 99;

    protected void setUp() throws Exception {
        super.setUp();

        person = new Person();
        person.setName(testName);
        person.setAge(testAge);

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetNameAndAge() {
        assertEquals(person.getName(), testName);
        assertEquals(person.getAge(), testAge);
    }

    public void testSetNameAndAge() {

        person.setName(testName);
        assertEquals(testName, person.getName());
        person.setAge(testAge);
        assertEquals(testAge, person.getAge());
    }

    public void testIntroduce() {
        String expected = "My name is " + testName + " and i am " + testAge + " years old";

        assertEquals(expected, person.introduce());
    }
}