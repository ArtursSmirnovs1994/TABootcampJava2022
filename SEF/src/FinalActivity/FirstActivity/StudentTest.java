package FinalActivity.FirstActivity;

import org.junit.*;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() {
        student = new Student();
    }
    @After
    public void tearDown() {
    }
    @Test
    public void testSetAndGetName() throws NameFormatException {
        String name = "Fred";
        student.setName(name);
        Assert.assertEquals(name, student.getName());
    }

    @Test(expected = NameFormatException.class)
    public void testSetAndGetNameThrows() throws NameFormatException {
        String name = "Fred1234";
        student.setName(name);
    }

    @Test
    public void testSetAndGetAge() throws AgeFormatException {
        int age = 25;
        student.setAge(age);
        Assert.assertEquals(age, student.getAge());
    }

    @Test(expected = AgeFormatException.class)
    public void testSetAndGetAgeThrows() throws AgeFormatException{
        int age = -25;
        student.setAge(age);
    }

    @Test
    public void testSetAndGetSchoolName(){
        String school = "Harvard";
        student.setSchoolName(school);
        Assert.assertEquals(school, student.getSchoolName());
    }
}
