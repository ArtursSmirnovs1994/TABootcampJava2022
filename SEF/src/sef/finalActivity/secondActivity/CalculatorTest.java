package sef.finalActivity.secondActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAddition() {
        int a = 4;
        int b = -7;
        assertEquals(-3, (calculator.addition(a, b)));
        assertEquals(-3, calculator.addition(b, a));
    }

    public void testSubstraction() {
        int a = 4;
        int b = -7;
        assertEquals(11, (calculator.subtraction(a, b)));
        assertEquals(-11, calculator.subtraction(b, a));
    }

    public void testMultiplication() {
        int a = 4;
        int b = -7;
        assertEquals(-28, (calculator.multiplication(a, b)));
        assertEquals(-28, calculator.multiplication(b, a));

        a = 0;
        b = 0;
        assertEquals(0, (calculator.multiplication(a, b)));
        assertEquals(0, calculator.multiplication(b, a));
    }

    public void testDivision() {
        int a = 8;
        int b = -8;
        assertEquals(-1, (calculator.division(a, b)));
        assertEquals(-1, calculator.division(b, a));

        a = 8;
        b = 0;
        assertEquals(0, (calculator.division(a, b)));
        assertEquals(0, calculator.division(b, a));


    }


}
