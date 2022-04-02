package sef.FinalPackage.SecondActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator theCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        theCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAddMethod() {
        int a = 5;
        int b = 10;
        // Testing two positive numbers
        assertEquals(15, theCalculator.addMethod(a, b));
        assertEquals(15, theCalculator.addMethod(b, a));

        a = -5;
        b = 10;
        // Testing one negative numbers
        assertEquals(5, theCalculator.addMethod(a, b));
        assertEquals(5, theCalculator.addMethod(b, a));

        a = -5;
        b = -10;
        // Testing two negative numbers
        assertEquals(-15, theCalculator.addMethod(a, b));
        assertEquals(-15, theCalculator.addMethod(b, a));

    }

    public void testSubstractMethod() {
        int a = 10;
        int b = 5;
        //Testing two positive numbers
        assertEquals(5, theCalculator.substractMethod(a, b));

        //Testing two negative numbers
        a = -10;
        b = -5;
        assertEquals(-5, theCalculator.substractMethod(a, b));

    }

    public void testMultiplyMethod() {
        double a = 10;
        double b = 5;
        //Testing with two positive numbers
        assertEquals(50.0, theCalculator.multiplyMethod(a, b));

        a = 10;
        b = 0;
        //Testing with one zero
        assertEquals(0.0, theCalculator.multiplyMethod(a, b));
}



    public void testDivideMethod() {
        double a = 10;
        double b = 5;
        //Testing with two positive numbers
        assertEquals(2.0, theCalculator.divideMethod(a, b));

        }


    public void testThrowException(){

        try {
            theCalculator.divideMethod(1, 5);
            theCalculator.multiplyMethod(0,5);
            new Calculator();

        } catch (Exception e) {
            fail();
        }
        catch (Error e) {
            fail();
        }
    }

    // I failed to complete tasks 2 and 3 from Second Activity. I need more java lessons and hands-on practice



}
