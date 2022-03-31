package sef.finalActivity.firstActivity;

import junit.framework.TestCase;

public class PersonTest {

    private Person person;

    int testAge = 21;
    String testName = "Jānītis";

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person(testAge, testName);
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetter () {
        assertEquals("getterTest Age", person.getAge(), testAge);
        assertEquals("getterTest Name", person.getName(), testName);
    }

    public void testSetter () {
        int setterTestAge = 21;
        String setterTestName = "Izlīte";

        person.setAge(setterTestAge);
        person.setName(setterTestName);

        assertEquals("runSettertest age", person.getAge(), setterTestAge);
        assertEquals("runSetterTest name", person.getName(), setterTestName);
    }

    // homies am a bit lost rn and am freestyling at this point
}
