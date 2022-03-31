package sef.finalActivity.firstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
    private Students students;
    String testSchoolName = "School Name";

    protected void setUp() throws Exception {
        super.setUp();

        students = new Students();
        students.setSchoolName(testSchoolName);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }


    public void testGetSchoolName() {
        assertEquals(testSchoolName, students.getSchoolName());
    }


    public void testSetSchoolName() {
        String testSchoolName2 = "School Name 2";
        students.setSchoolName(testSchoolName2);
        assertEquals(testSchoolName2, students.getSchoolName());
    }

    public void testIntroduce() {
        String expected = "I am study in university " + students.getSchoolName();
        assertEquals(expected, students.introduce());
    }
}
