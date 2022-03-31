package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;
import sef.module9.activity.Person;

public class Person_DTest extends TestCase {

        private Person_D person;
        String testName = "Jonas";
        int testAge = 40;

        protected void setUp() throws Exception {
            super.setUp();
            person = new Person_D();
            person.setName(testName);
            person.setAge(testAge);
        }

        protected void tearDown() throws Exception {
            super.tearDown();
        }

        public void testGetters() {
            assertEquals(person.getName(), testName);
            assertEquals(person.getAge(), testAge, 0);
        }

        public void testSetters() {
            String name = "Petras";
            int age = 17;
            person.setName(name);
            person.setAge(age);
            assertEquals(name, person.getName());
            assertEquals(age, person.getAge(), 0);
        }

}
