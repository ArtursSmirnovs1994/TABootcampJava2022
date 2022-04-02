package sef.FinalPackage.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    String testName = "Gary";
    int testAge = 22;

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
        person.setName(testName);
        person.setAge(testAge);

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }


    public void testGetter() {
        assertEquals("Gary", person.getName());
        assertEquals(22, person.getAge());
    }


    public void testSetter() {
        String newName = "Tom";
        int newAge = 44;
        person.setName(newName);
        person.setAge(newAge);
        assertEquals("Tom", person.getName());
        assertEquals(44, person.getAge());
    }

    public void testAnnounce() {
        Person p = new Person();
        p.setAge(22);
        p.setName("Gary");

        assertEquals( "My name is Gary and I am 22 years old.", p.announce());


    }






}


