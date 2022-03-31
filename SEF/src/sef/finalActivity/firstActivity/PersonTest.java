package sef.finalActivity.firstActivity;

import junit.framework.TestCase;

import java.util.InvalidPropertiesFormatException;

public class PersonTest extends TestCase {
    private Person person;
    String testName = "Ivan";
    int testAge = 30;

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
        person.setName(testName);
        person.setAge(testAge);
    }
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void testGetName(){
        assertEquals(testName, person.getName());
        System.out.println("Test GetName executed");
    }

    public void testSetName() {
        String newName = "Berta";
        person.setName(newName);
        assertEquals(person.getName(),newName);
        System.out.println("Test SetName executed");
    }


    public void testGetAge(){
        assertEquals(testAge,person.getAge());
        System.out.println("Test GetAge executed");
    }

    public void testSetAge(){
        int newAge = 35;
        person.setAge(newAge);
        assertEquals(person.getAge(),newAge);
        System.out.println("Test SetAge executed");
    }
    public void testIntroducePerson(){
        assertEquals("My name is " + testName + " and I am " + testAge + " years old","My name is " + person.getName() + " and I am " + person.getAge() + " years old");
        System.out.println("Test IntroducePerson executed");
    }
}
