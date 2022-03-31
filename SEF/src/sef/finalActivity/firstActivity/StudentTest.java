package sef.finalActivity.firstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    private Students student;
    static final String testSchoolName = "Vilnius University";

    protected void setUp() throws Exception {
        super.setUp();
        this.student = new Students("Laura", 22, testSchoolName);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetSchoolName() {
        assertEquals(testSchoolName, student.getSchoolName());
    }

    public void testSetSchoolName() {
        var newSchoolName = "KTU";
        student.setSchoolName(newSchoolName);
        assertEquals(newSchoolName, student.getSchoolName());
    }

    public void testIntroduction() {
        assertEquals("My name is Laura and I am 22 years old. I study in university Vilnius University", student.introduction());
    }
}
