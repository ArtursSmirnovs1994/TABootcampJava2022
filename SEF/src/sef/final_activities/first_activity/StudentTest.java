package sef.final_activities.first_activity;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class StudentTest {

    private static Student student;

    private static String testName = "Maksims";
    private static int testAge = 19;
    private static String schoolName = "Global Overseas";

    @Before
    public void setUp() {
        student = new Student(testName, testAge, schoolName);
    }

    //  |   tests inherited from Person   |
    //  v   I'm not sure if I need them   v
    @Test
    public void testGetAge() {
        assertEquals("Get age test", student.getAge(), testAge);
    }

    @Test
    public void testGetName() {
        assertEquals("Get name test", student.getName(), testName);
    }

    @Test
    public void testSetAge() {
        int[] ages = {0, 1, 18, 45, 48, 150};

        for (int age : ages) {
            student.setAge(age);
            assertEquals("Set age test", age, student.getAge());
        }

    }

    @Test
    public void testSetInvalidAge() {
        int[] invalidAges = {-2, 155, 10_000};

        for (int age : invalidAges) {
            try {
                student.setAge(age);
                fail("Uncaught exception");
            } catch (PersonParametersException exception) {
                assertEquals("Exception message", "Invalid age value", exception.getMessage());
            } catch (Exception e) {
                fail("Exception of wrong type thrown");
            }
        }
    }

    @Test
    public void testSetName() {
        String[] names = {"Sergey", "Xi", "Really really really long but still perfectly valid multi-word name"};

        for (String name : names) {
            student.setName(name);
            assertEquals("Set name test", name, student.getName());
        }

    }

    @Test
    public void testSetNameTrim() {
        // Not an ideal approach, but I have no time for better right now
        String[] names = {"Anna", " Anna", "  Anna  ", "Anna  ", "\nAnna", "\tAnna\t\n", " \t Anna \n\t  "};

        for (String name : names) {
            student.setName(name);
            assertEquals("Trim name test", "Anna", student.getName());
        }

    }

    @Test
    public void testSetInvalidName() {
        String[] namesWithNumbers = {"Niki666", "0lga", "Clari55a", "01010", "1lllIII11lllII11I"};

        for (String name : namesWithNumbers) {
            try {
                student.setName(name);
                fail("Uncaught exception");
            } catch (PersonParametersException exception) {
                assertEquals("Exception message", "Name contains digit(s)", exception.getMessage());
            } catch (Exception e) {
                fail("Exception of wrong type thrown");
            }
        }

        String[] blankNames = {"", " ", "      ", "\n", "\t", "\n\n", "  \t \n \t\t", "   \t \t  \t", "\n\t\t\n"};

        for (String name : blankNames) {
            try {
                student.setName(name);
                fail("Uncaught exception");
            } catch (PersonParametersException exception) {
                assertEquals("Exception message", "Name is empty or blank", exception.getMessage());
            } catch (Exception e) {
                fail("Exception of wrong type thrown");
            }
        }
    }

    // ^ tests inherited from Person ^

    @Test
    public void testGetSchoolName() {
        assertEquals("Get school name test", schoolName, student.getSchoolName());
    }

    @Test
    public void testSetSchoolName() {
        String newSchool = "MIT";
        student.setSchoolName(newSchool);
        assertEquals("Set school name test", newSchool, student.getSchoolName());
    }

    @Test
    public void testIntroduce() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // saving original output target
        PrintStream originalOut = System.out;
        // redirecting console output to our byte stream
        System.setOut(new PrintStream(outContent));

        // we expect \r\n in Windows, but \n in Linux and MacOS, should think more about it
        String expectedOutput = "I am study at university " + schoolName + "\r\n";

        student.introduce();

        assertEquals("Introduce test", expectedOutput, outContent.toString());

        // returning normal output
        System.setOut(originalOut);
    }

}
