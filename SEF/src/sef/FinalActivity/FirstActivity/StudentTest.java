package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
    private Students student;
    protected void setUp() throws Exception {
        super.setUp();
        student = new Students();

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSetAndGetSchoolName() {
        String testSchoolName = "RTU";
        assertNull(student.getSchoolName());
        student.setSchoolName(testSchoolName);
        assertEquals(testSchoolName, student.getSchoolName());
    }
    public void  testIntroduceStudent() {
        student.setSchoolName("RTU");
        assertEquals("I am Studying in University "+ "RTU", (student.introduceStudent()));
    }

}
