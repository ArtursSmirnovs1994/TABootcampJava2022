package sef.finalActivity.secondActivity;


import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator theLastCalculator;

    protected void setUp() throws Exception {
        super.setUp();

        theLastCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testDoAdd() {

        int a = 3;
        int b = 7;
        assertEquals(10, (theLastCalculator.doAdd(a, b)));
        assertEquals(10, (theLastCalculator.doAdd(b, a)));

        a = -3;
        b = 7;
        assertEquals(4, (theLastCalculator.doAdd(a, b)));
        assertEquals(4, (theLastCalculator.doAdd(b, a)));

        a = -3;
        b = -7;
        assertEquals(-10, (theLastCalculator.doAdd(a, b)));
        assertEquals(-10, (theLastCalculator.doAdd(b, a)));

    }

    public void testDoSubtract() {

        int a = 3;
        int b = 7;
        assertEquals(-4, (theLastCalculator.doSubtract(a, b)));
        assertEquals(4, (theLastCalculator.doSubtract(b, a)));

        a = -3;
        b = 7;
        assertEquals(-10, (theLastCalculator.doSubtract(a, b)));
        assertEquals(10, (theLastCalculator.doSubtract(b, a)));

        a = -3;
        b = -7;
        assertEquals(4, (theLastCalculator.doSubtract(a, b)));
        assertEquals(-4, (theLastCalculator.doSubtract(b, a)));

    }

    public void testDoMultiply() {
        int a = 3;
        int b = 7;
        assertEquals(21, (theLastCalculator.doMultiply(a, b)));
        assertEquals(21, (theLastCalculator.doMultiply(b, a)));

        a = -3;
        b = 7;
        assertEquals(-21, (theLastCalculator.doMultiply(a, b)));
        assertEquals(-21, (theLastCalculator.doMultiply(b, a)));

        a = -3;
        b = -7;
        assertEquals(21, (theLastCalculator.doMultiply(a, b)));
        assertEquals(21, (theLastCalculator.doMultiply(b, a)));

    }


    public void testDoDivide() {
        int a = 3;
        int b = 7;
        assertEquals(0, (theLastCalculator.doDivide(a, b)));
        assertEquals(2, (theLastCalculator.doDivide(b, a)));

        a = -3;
        b = 7;
        assertEquals(0, (theLastCalculator.doDivide(a, b)));
        assertEquals(-2, (theLastCalculator.doDivide(b, a)));

        a = -3;
        b = -7;
        assertEquals(0, (theLastCalculator.doDivide(a, b)));
        assertEquals(2, (theLastCalculator.doDivide(b, a)));


    }

    public void testCatcher() {

        try {
            theLastCalculator.doDivide(6, 0);
        } catch (ArithmeticException arex) {
            assertEquals("java.lang.ArithmeticException: / by zero", String.valueOf(arex));
        }

    }

}







