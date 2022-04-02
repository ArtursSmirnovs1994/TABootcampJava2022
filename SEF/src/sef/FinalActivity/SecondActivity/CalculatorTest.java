package sef.FinalActivity.SecondActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator testedCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        testedCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetSum() {

        int a = 15;
        int b = 26;

        assertEquals(41, (testedCalculator.getSum(a, b)));
        assertEquals(41, (testedCalculator.getSum(b, a)));

        a = -15;
        b = 26;

        assertEquals(11, (testedCalculator.getSum(a, b)));
        assertEquals(11, (testedCalculator.getSum(b, a)));

        a = -15;
        b = -26;

        assertEquals(-41, (testedCalculator.getSum(a, b)));
        assertEquals(-41, (testedCalculator.getSum(b, a)));

    }

    public void testGetDifference() {

        int a = 15;
        int b = 2;
        //	Checks if b is lesser than a
        assertEquals(13, (testedCalculator.getDifference(a, b)));
        //	Checks if b is greater than a
        assertEquals(-13, (testedCalculator.getDifference(b, a)));
    }

    public void testGetMultiply() {

        double a = 3;
        double b = 7;
        //	Checks the multiply of two (2) positive values
        assertEquals(21, (testedCalculator.getMultiply(a, b)), 0);
        assertEquals(21, (testedCalculator.getMultiply(b, a)), 0);
    }

    public void testDivision() {

        double a = 10;	double b = 5;
        //	Checks if b is lesser than a
        assertEquals(2, (testedCalculator.getDivision(a,b)),0);
        //	Checks if b is greater than a
        assertEquals(0.5, (testedCalculator.getDivision(b,a)),0);

        a = 9;	b = -3;
        //	Checks if positive value is divided with negative value
        assertEquals(-3, (testedCalculator.getDivision(a,b)),0);
        //	Checks if negative value is divided with positive value
        assertEquals(-0.33, (testedCalculator.getDivision(b,a)),0.007);

        a = -10;	b = -5;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(2, (testedCalculator.getDivision(a,b)),0);
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(0.5, (testedCalculator.getDivision(b,a)),0);
    }

}


