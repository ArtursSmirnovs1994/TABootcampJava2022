package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class StudentsTest extends TestCase {

    private Students student;
    String testschoolName = "Hogwarts";

    // set up

    protected void setUp() throws Exception {
        super.setUp();
        student = new Students();
        student.setSchoolName(testschoolName);
    }

    //teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //unit tests for getters and setters
    public void testGetSchoolName() {
        assertEquals(student.getSchoolName(), testschoolName);
    }

    public void testSetSchoolName() {

        String setterTestSchoolName = "Hogwarts";
        student.setName(setterTestSchoolName);
        assertEquals(student.getName(), setterTestSchoolName);
    }
    //unit test for Student Announcement

    public void testStudentAnnounce() {
        assertEquals("I study in the Hogwarts.", student.announceStudents());
    }
}