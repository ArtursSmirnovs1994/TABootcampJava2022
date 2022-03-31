package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class Student_DTest extends TestCase {

    private Student_D student;
    String testName = "Emma";
    int testAge = 20;
    String testSchoolName = "VU MIF";

    protected void setUp() throws Exception {
        super.setUp();
        student = new Student_D();
        student.setName(testName);
        student.setAge(testAge);
        student.setSchoolName(testSchoolName);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetters() {
        assertEquals(student.getName(), testName);
        assertEquals(student.getAge(), testAge, 0);
        assertEquals(student.getSchoolName(), testSchoolName);
    }

    public void testSetters() {
        String name = "Anna";
        int age = 17;
        String school = "Yale";
        student.setName(name);
        student.setAge(age);
        student.setSchoolName(school);
        assertEquals(name, student.getName());
        assertEquals(age, student.getAge(), 0);
        assertEquals(school, student.getSchoolName());
    }

}
