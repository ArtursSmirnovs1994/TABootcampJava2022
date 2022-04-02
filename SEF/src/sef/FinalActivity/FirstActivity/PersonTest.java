package sef.FinalActivity.FirstActivity;
import junit.framework.TestCase;

public class PersonTest extends TestCase{

    private Person person;

    public void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetName() throws CustomizedException {
        assertNull(person.getName());

        String testName = "Liene Upite";
        person.setName(testName);
        assertEquals(testName, person.getName());
    }

    public void testSetName() throws CustomizedException {
        String testName = "Liene Brivkalne";
        person.setName(testName);
        assertEquals(testName, person.getName());
    }

    public void testGetAge() {
        assertEquals(0, person.getAge());
        System.out.println(person.getAge());

        int testAge = 25;
        person.setAge(testAge);
        assertEquals(testAge, person.getAge());
    }
    public void testSetAge() {
        int testAge = 30;
        person.setAge(testAge);
        assertEquals(testAge, person.getAge());
    }

    public void testIntroduction() throws CustomizedException {
        assertEquals("My name is "+person.getName()+" and I am "+person.getAge()+" years old", person.introduction());
        person.setName("Liga");
       person.setAge(28);
        assertEquals("My name is "+person.getName()+" and I am "+person.getAge()+" years old", person.introduction());
    }
}
