package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    Person testPerson;
    int testAge = 22;
    String testName = " Abigail Pittman ";
    String testNameWithNumbers = "Abigail0Pittman";
    String testNameBlank = " ";
    String expectedName = "Abigail Pittman";

    @Before
    public void setUp(){
        testPerson = new Person(testName, testAge);
    }

    @Test
    public void testGetter(){
        Assert.assertEquals("Testing age getter ", testAge, testPerson.getAge());
        Assert.assertEquals("Testing name getter ", expectedName, testPerson.getName());
    }

    @Test
    public void testSetter(){
        int setterAge = 44;
        String testName = " Grady Singleton ";
        String expectedName = "Grady Singleton";
        testPerson.setAge(setterAge);
        Assert.assertEquals("Testing age setter ", setterAge, testPerson.getAge());

        testPerson.setName(testName);
        Assert.assertEquals("Testing name setter ", expectedName, testPerson.getName());
    }

    @Test
    public void testDefaultConstructor(){
        new Person();
    }

    @Test(expected = InvalidNameException.class)
    public void testNameWithNumbersConstructor(){
        try {
            new Person(testNameWithNumbers, testAge);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = InvalidNameException.class)
    public void testBlankNameConstructor(){
        try {
            new Person(testNameBlank, testAge);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = InvalidNameException.class)
    public void testNameWithNumbers(){
        try {
            testPerson.setName(testNameWithNumbers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNameBlank(){
        try {
            testPerson.setName(testNameBlank);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIntroduction(){
        String introduction = testPerson.introduceYourself();
        Assert.assertFalse(introduction.isEmpty());
        String expectedIntroduction = String.format("My name is %s and I am %d years old", expectedName, testAge);
        Assert.assertEquals(expectedIntroduction, introduction);
    }
}
