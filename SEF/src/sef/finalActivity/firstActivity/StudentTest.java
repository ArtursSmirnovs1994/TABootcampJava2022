package sef.finalActivity.firstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
    private Student student;
    String testSchoolName = "RTU";

    protected void setUp() throws Exception {
        super.setUp();
        student = new Student();
        student.setSchoolName(testSchoolName);
    }
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSetSchoolName(){
        assertEquals(testSchoolName, student.getSchoolName());
    }
    public void testGetSchoolName(){
        assertEquals(testSchoolName,student.getSchoolName());
    }
    public void testIntroduceStudent(){
        assertEquals("I study in university " + testSchoolName, "I study in university " + student.getSchoolName());
    }
}
