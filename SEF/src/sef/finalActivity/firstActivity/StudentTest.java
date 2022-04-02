package sef.finalActivity.firstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {


    private Students studentToTest;
    String newSchoolName = "BUSKU";

    protected void setUp() throws Exception {
        super.setUp();

        studentToTest = new Students();
        studentToTest.setSchoolName(newSchoolName);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetSchoolName() {

        assertEquals(studentToTest.getSchoolName(), newSchoolName);
    }

    public void testSetName() {

        String newName = "Beta";
        studentToTest.setSchoolName(newSchoolName);
        assertEquals(studentToTest.getSchoolName(), newSchoolName);

    }

    public void testIntroduceMe() throws CustomExceptionFirst {
        studentToTest.setName("Reinis");
        assertEquals("My name is Reinis and I study in university BUSKU", studentToTest.introduceMe());

    }


}
