package sef.FinalActivity.extra;

import junit.framework.TestCase;
import org.junit.Assert;
import sef.FinalActivity.FirstActivity.Employee;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;

import static sef.FinalActivity.FirstActivity.Employee.printToFile;


public class EmployeeExtraTest extends TestCase {
    Employee[] employees = {
            new Employee("Jocelynn Allison", 24, "QA Tester", "Accenture"),
            new Employee("Robert Gibson", 20, "Java Developer", "Accenture"),
            new Employee("Lilianna Kaufman", 31, "AWS Cloud Engineer", "Accenture"),
            new Employee("Dylan Payne", 46, "DevOps specialist", "Accenture"),
            new Employee("Isabelle Guerrero", 37, "Test Lead", "Accenture")
    };

    public void testPrintByFirstName() {
        Arrays.sort(employees, new Employee.firstNameComparator());
        System.out.println("\nEmployees sorted by first name:");
        for (Employee e : employees) {
            System.out.printf("%s :: %s\n", e.getName(), e.getFirstName());
        }
    }

    public void testPrintBySecondName() {
        Arrays.sort(employees, new Employee.secondNameComparator());
        System.out.println("\nEmployees sorted by second name:");
        for (Employee e : employees) {
            System.out.printf("%s :: %s\n", e.getName(), e.getSecondName());
        }
    }

    public void testPrintEmployeesToFile() {
        try {
            String fileName = "src\\sef\\FinalActivity\\extra\\fileOutput\\hello.txt";
            String fileNameCopy = "src\\sef\\FinalActivity\\extra\\fileOutput\\Copy of hello.txt";

            printToFile(employees, fileName);
            File f = new File(fileName);
            assertTrue(f.exists() );
            printToFile(employees, fileName);
            File f2 = new File(fileNameCopy);
            assertTrue(f.exists() );

            f.delete();
            f2.delete();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testEverydayLife() {
        Employee testee = employees[new Random().nextInt(employees.length)];

        String expectedWork = String.format(
                "%s goes to %s to do %s stuff",
                testee.getName(),
                testee.getCompany(),
                testee.getJobTitle()
        );
        String actualResult = testee.doWork();
        System.out.println(actualResult);
        assertEquals(expectedWork, actualResult);

        String testHobbyStr = "have dinner";
        String testCompany = "with other people";
        String testLocation = "in the countryside";
        String testFrequency = "two times per week";
        Hobby testHobby = new Hobby(Hobby.hobbiesList[2], testCompany, testLocation, testFrequency);
        testee.setPersonalHobby(testHobby);
        String expectedRest = String.format(
                "%s likes to %s %s %s %s",
                testee.getName(),
                testHobbyStr,
                testCompany,
                testLocation,
                testFrequency
        );
        actualResult = testee.doRest();
        System.out.println(actualResult);
        assertEquals(expectedRest, testee.doRest());

        testee.setPersonalHobby(null);
        expectedRest = "do more work!";
        actualResult = testee.doRest();
        System.out.println(actualResult);
        assertEquals(expectedRest, actualResult.substring(11+testee.getName().length()-1, 11+testee.getName().length()-1 + "do more work!".length()));
    }
}
