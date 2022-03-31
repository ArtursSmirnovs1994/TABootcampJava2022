package FinalActivity.FirstActivity;

import org.junit.*;

public class PersonTest {
    private Person person;

    //TODO: create set up
    @Before
    public void setUp() throws Exception {
        person = new Person();
    }
    //TODO: create teardown
    @After
    public void tearDown() throws Exception {
    }
    //TODO: create unit tests for getters and setters
    @Test
    public void testSetAndGetName() throws NameFormatException {
        String name = "Fred";
        person.setName(name);
        Assert.assertEquals(name, person.getName());
    }

    @Test(expected = NameFormatException.class)
    public void testSetAndGetNameThrows() throws NameFormatException {
        String name = "Fred1234";
        person.setName(name);
    }

    @Test
    public void testSetAndGetAge() throws AgeFormatException {
        int age = 25;
        person.setAge(age);
        Assert.assertEquals(age, person.getAge());
    }

    @Test(expected = AgeFormatException.class)
    public void testSetAndGetAgeThrows() throws AgeFormatException{
        int age = -25;
        person.setAge(age);
    }
}
