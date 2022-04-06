package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    int testage=40;
    String testname="Jelena";

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person(testname, testage);}

    protected void tearDown() throws Exception {
            super.tearDown();}

    public void testAgenull(){
        int p= person.getAge();
        if (p==0){
            System.out.println("Cannot be 0");
        }}
    public final void testAgeminustoohigh(){
        int c= person.getAge();
        if(c<0) {
            System.out.println("Canot be less then 0");
            int k= person.getAge();
            if(k>150)
                System.out.println("Canot be less then 0");
        }
    }
}

