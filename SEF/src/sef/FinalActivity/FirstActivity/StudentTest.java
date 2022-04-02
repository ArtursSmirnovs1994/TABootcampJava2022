package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
    private Students student;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        student = new Students();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetSchoolName() {
        assertNull(student.getSchoolName());
        System.out.println(student.getSchoolName());

        String testSchool = "Latvijas Universitate";
        student.setSchoolName(testSchool);
        assertEquals(testSchool, student.getSchoolName());
        System.out.println(student.getSchoolName());
    }

    public void testSetSchoolName() {
        String testSchool = "RTU";
        student.setSchoolName(testSchool);
        assertEquals(testSchool, student.getSchoolName());
        System.out.println(student.getSchoolName());
    }

    public void testIntroduction() {
        assertEquals("I am study in university " + student.getSchoolName(), student.introduction());
        student.setSchoolName("RSEBA");


        assertEquals("I am study in university " + student.getSchoolName(), student.introduction());
    }
}
