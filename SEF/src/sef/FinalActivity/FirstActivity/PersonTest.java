package sef.FinalActivity.FirstActivity;


import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSetAndGetName() throws PersonCustomException {
        String testName = "Ali";
        assertNull(person.getName());
        person.setName(testName);
        assertEquals(testName, person.getName());
    }
    public void testSetAndGetAge() {
        int testAge = 27;
        assertEquals(0, person.getAge());
        person.setAge(testAge);
        assertEquals(testAge, person.getAge());
    }
    public void  testIntroducePerson() throws PersonCustomException {
        person.setName("Ali");
        person.setAge(27);
    assertEquals("My Name is "+"Ali"+" and i am "+"27", (person.introducePerson()));
}



}
