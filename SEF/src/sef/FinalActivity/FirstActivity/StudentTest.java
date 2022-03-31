package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
    private Student stu;
    private String testName = "John Doe";
    private int testAge = 23;
    private String testSchool = "RTU";

    //TODO: create set up
    protected void setUp() throws Exception {
        stu = new Student();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testSetAndGetName() throws PersonCustomException {
        assertNull(stu.getName());
        stu.setName(testName);
        assertEquals(testName, stu.getName());
    }

    public void testSetAndGetAge() {
        assertEquals(0, stu.getAge());
        stu.setAge(testAge);
        assertEquals(testAge, stu.getAge());
    }

    public void testSetAndGetSchool(){
        assertNull(stu.getSchoolName());
        stu.setSchoolName(testSchool);
        assertEquals(testSchool, stu.getSchoolName());
    }

    public void testConstructorParams() throws PersonCustomException{
        stu = new Student(testName, testAge, testSchool);
        assertEquals(testName, stu.getName());
        assertEquals(testAge, stu.getAge());
        assertEquals(testSchool, stu.getSchoolName());
    }

    public void testIntroduction() throws PersonCustomException{
        stu = new Student(testName, testAge, testSchool);
        stu.Introduction();
    }

    public void testInvalidName() {
        stu = new Student();
        try {
            //try to set invalid name
            stu.setName("Name with 123");
        } catch (PersonCustomException pce) {
            String expectedMessage = "Personal exception: Name is not correct, should be only letters a-z/A-Z";
            assertEquals(expectedMessage, pce.getMessage());
        }
    }
}
