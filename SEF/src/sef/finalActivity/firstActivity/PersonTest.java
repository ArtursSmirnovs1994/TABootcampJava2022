package sef.finalActivity.firstActivity;

import junit.framework.TestCase;


public class PersonTest extends TestCase {

    private Person personToTest;
    String testName = "Alfa";
    int testAge = 40;

    protected void setUp() throws Exception {
        super.setUp();

        personToTest = new Person();
        personToTest.setName(testName);
        personToTest.setAge(testAge);

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetName() {

        assertEquals(personToTest.getName(), testName);
    }

    public void testSetName() throws CustomExceptionFirst {

        String newName = "Beta";
        personToTest.setName(newName);
        assertEquals(personToTest.getName(),newName);

    }

    public void testGetAge() {

        assertEquals(personToTest.getAge(), testAge);
    }


    public void testSetAge() {

        int newAge = 45;
        personToTest.setAge(newAge);
        assertEquals(personToTest.getAge(),newAge);

    }

    public void testIntroduceMe() {

        assertEquals("My name is Alfa and I am 40 years old", personToTest.introduceMe());

    }
}
