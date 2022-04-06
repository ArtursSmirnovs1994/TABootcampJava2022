package sef.FinalActivitySecondActivity;

import junit.framework.TestCase;

public class CalculatorfinalTest extends TestCase {

    private Calculatorfinal thisCalculator;

    protected void setUp() throws Exception{
        super.setUp();
        thisCalculator = new Calculatorfinal();
    }
    protected void tearDown() throws Exception{
        super.tearDown();
    }
    public void testAddition(){
        //minus digit
        int a=5;
        int b=-5; //expected 0
        assertEquals(0,(thisCalculator.addition(a,b)));
         a=-5;
         b=5; //expected 0
        assertEquals(0,(thisCalculator.addition(a,b)));
        //both minus
        a=-5;
        b=-10; //expected -15
        assertEquals(-15,(thisCalculator.addition(a,b)));

    }
    public void testSubstraction(){
        //minus digit
        int a=5;
        int b=-5; //expected 10
        assertEquals(10,(thisCalculator.substraction(a,b)));
        a=-5;
        b=5; //expected -10
        assertEquals(-10,(thisCalculator.substraction(a,b)));
        //both minus
        a=-5;
        b=-10; //expected 5
        assertEquals(5,(thisCalculator.substraction(a,b)));

    }
    public void testMultiply() {
        //minus digit
        double a = 5;
        double b = -5; //expected -25
        assertEquals(-25.0, (thisCalculator.multiply(a, b)));
        a = -5;
        b = 5; //expected -25
        assertEquals(-25.0, (thisCalculator.multiply(a, b)));
        //both minus
        a = -5;
        b = -10; //expected 50
        assertEquals(50.0, (thisCalculator.multiply(a, b)));
        //one is 0
        a = 0;
        b = -10; //expected -0.0
        assertEquals(-0.0, (thisCalculator.multiply(a, b)));
        a = 10;
        b = 0; //expected 0.0
        assertEquals(0.0, (thisCalculator.multiply(a, b)));

            }
    public void testDivision() {
        //minus digit
        double a = 5;
        double b = -5; //expected -1
        assertEquals(-1.0, (thisCalculator.division(a, b)));
        a = -5;
        b = 5; //expected -1
        assertEquals(-1.0, (thisCalculator.division(a, b)));
        //both minus
        a = -5;
        b = -10; //expected 0.5
        assertEquals(0.5, (thisCalculator.division(a, b)));
        //one is 0
        a = 0;
        b = -10; //expected 0.0
        assertEquals(-0.0, (thisCalculator.division(a, b)));
        //a = 5;
        //b = 0; //expected infinity
        //assertEquals("Infinity", (thisCalculator.division(a, b)));
        b=0;
        if (b==0){
            System.out.println("Not possible to devide on 0 will be INFINITY");

        }
        }
    public void testInserts() {
        //String a = "null";
        //int b = -10; //expected 0.0
        //assertEquals(-0.0, (thisCalculator.division(a, b)));

    }

    }

