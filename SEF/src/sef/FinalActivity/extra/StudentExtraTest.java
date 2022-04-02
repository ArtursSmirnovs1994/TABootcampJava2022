package sef.FinalActivity.extra;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sef.FinalActivity.FirstActivity.Student;

import java.util.Random;

public class StudentExtraTest {
    Student testee;
    String testSchoolName = "Riga Technical University";
    int testAge = 22;
    String testName = " Zariah Stark ";
    @Before
    public void setup() {
        testee = new Student(testName, testAge, testSchoolName);
    }

    @Test
    public void testEverydayLife() {
        String expectedWork = String.format("%s goes to the lectures at %s",
                testee.getName(),
                testSchoolName);
        Assert.assertEquals(expectedWork, testee.doWork());

        String testHobbyStr = "skydive";
        String testCompany = "with a buddy";
        String testLocation = "in the city";
        String testFrequency = "sometimes";
        Hobby testHobby = new Hobby(Hobby.hobbiesList[Hobby.hobbiesList.length-1], testCompany, testLocation, testFrequency);
        testee.setPersonalHobby(testHobby);
        String expectedRest = String.format(
                "%s likes to %s %s %s %s",
                testee.getName(),
                testHobbyStr,
                testCompany,
                testLocation,
                testFrequency
        );
        String actualResult = testee.doRest();
        System.out.println(actualResult);
        Assert.assertEquals(expectedRest, testee.doRest());

        testee.setPersonalHobby(null);
        expectedRest = "do more work!";
        actualResult = testee.doRest();
        System.out.println(actualResult);
        Assert.assertEquals(expectedRest, actualResult.substring(11+testee.getName().length()-1, 11+testee.getName().length()-1 + "do more work!".length()));
    }
}
