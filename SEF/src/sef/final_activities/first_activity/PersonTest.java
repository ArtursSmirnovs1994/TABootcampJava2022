package sef.final_activities.first_activity;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PersonTest {

    private static Person person;

    private static int testAge = 48;
    private static String testName = "Sergey";

    @Before
    public void setUp() {
        person = new Person(testName, testAge);
    }

    @Test
    public void testGetAge() {
        assertEquals("Get age test", person.getAge(), testAge);
    }

    @Test
    public void testGetName() {
        assertEquals("Get name test", person.getName(), testName);
    }

    @Test
    public void testSetAge() {
        int[] ages = {0, 1, 18, 45, 48, 150};

        for (int age : ages) {
            person.setAge(age);
            assertEquals("Set age test", age, person.getAge());
        }

    }

    @Test
    public void testSetInvalidAge() {
        int[] invalidAges = {-2, 155, 10_000};

        for (int age : invalidAges) {
            try {
                person.setAge(age);
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
            person.setName(name);
            assertEquals("Set name test", name, person.getName());
        }

    }

    @Test
    public void testSetNameTrim() {
        // Not an ideal approach, but I have no time for better right now
        String[] names = {"Anna", " Anna", "  Anna  ", "Anna  ", "\nAnna", "\tAnna\t\n", " \t Anna \n\t  "};

        for (String name : names) {
            person.setName(name);
            assertEquals("Trim name test", "Anna", person.getName());
        }

    }

    @Test
    public void testSetInvalidName() {
        String[] namesWithNumbers = {"Niki666", "0lga", "Clari55a", "01010", "1lllIII11lllII11I"};

        for (String name : namesWithNumbers) {
            try {
                person.setName(name);
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
                person.setName(name);
                fail("Uncaught exception");
            } catch (PersonParametersException exception) {
                assertEquals("Exception message", "Name is empty or blank", exception.getMessage());
            } catch (Exception e) {
                fail("Exception of wrong type thrown");
            }
        }
    }

    @Test
    public void testIntroduce() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // saving original output target
        PrintStream originalOut = System.out;
        // redirecting console output to our byte stream
        System.setOut(new PrintStream(outContent));

        String expectedOutput = String.format("My name is %s and I am %d years old\n", testName, testAge);

        person.introduce();

        assertEquals("Introduce test", expectedOutput, outContent.toString());

        // returning normal output
        System.setOut(originalOut);
    }
}
