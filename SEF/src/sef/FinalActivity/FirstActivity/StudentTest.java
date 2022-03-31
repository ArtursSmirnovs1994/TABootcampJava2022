package sef.FinalActivity.FirstActivity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student testStudent;
    String testSchoolName = "Riga Technical University";
    int testAge = 22;
    String testName = " Zariah Stark ";
    @Before
    public void setup() {
        testStudent = new Student(testName, testAge, testSchoolName);
    }

    @Test
    public void testGetter(){
        Assert.assertEquals("Testing school getter ", testSchoolName, testStudent.getSchoolName());
    }

    @Test
    public void testSetter(){
        int setterAge = 44;
        String testSchoolName = "Riga Stradins University";
        String expectedName = "Grady Singleton";
        testStudent.setSchoolName(testSchoolName);
        Assert.assertEquals("Testing school setter ", testSchoolName, testStudent.getSchoolName() );
    }

    @Test
    public void testDefaultConstructor(){
        new Student(testSchoolName);
    }
    
    @Test
    public void testIntroduction(){
        String introduction = testStudent.introduceYourself();
        Assert.assertFalse(introduction.isEmpty());
        String expectedIntroduction = String.format("I study in %s", testSchoolName);
        Assert.assertEquals(expectedIntroduction, introduction);
    }
}
