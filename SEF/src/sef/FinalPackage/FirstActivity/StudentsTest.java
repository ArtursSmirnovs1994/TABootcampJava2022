package sef.FinalPackage.FirstActivity;

import junit.framework.TestCase;

public class StudentsTest extends TestCase {

    private Students student;
    String testSchool = "Cambridge";

    protected void setUp() throws Exception {
        super.setUp();
        student = new Students();
        student.setSchoolName(testSchool);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetter() {
        assertEquals("Cambridge", student.getSchoolName());
    }

    public void testIntroductionOfStudents() {
        Students s = new Students();
        s.setSchoolName("Oxford");
        assertEquals("I study in the Oxford university.", s.introductionOfStudents());
    }


}
