package sef.finalActivity.secondActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calc;

    protected void setUp() throws Exception {
        super.setUp();
        calc = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAddition() {
        int a = 7;
        int b = -7;
        assertEquals(0, calc.addition(a, b));
        assertEquals(0, calc.addition(b, a));

        a = -15;
        b = -15;
        assertEquals(-30, calc.addition(a, b));
        assertEquals(-30, calc.addition(b, a));

        a = 10;
        b = 8;
        assertEquals(18, calc.addition(a, b));
        assertEquals(18, calc.addition(b, a));

        a = 0;
        b = 5;
        assertEquals(5, calc.addition(a, b));
        assertEquals(5, calc.addition(b, a));

    }

    public void testSubtraction() {
        int a = 7;
        int b = -7;
        assertEquals(14, calc.subtraction(a, b));
        assertEquals(-14, calc.subtraction(b, a));

        a = -15;
        b = -15;
        assertEquals(0, calc.subtraction(a, b));
        assertEquals(0, calc.subtraction(b, a));

        a = 10;
        b = 8;
        assertEquals(2, calc.subtraction(a, b));
        assertEquals(-2, calc.subtraction(b, a));

        a = 0;
        b = 5;
        assertEquals(-5, calc.subtraction(a, b));
        assertEquals(5, calc.subtraction(b, a));
    }

    public void testMultiplication() {
        double a = 7;
        double b = -7;
        assertEquals(-49, calc.multiplication(a, b), 0);
        assertEquals(-49, calc.multiplication(b, a), 0);

        a = -15;
        b = -15;
        assertEquals(225, calc.multiplication(a, b), 0);
        assertEquals(225, calc.multiplication(b, a), 0);

        a = 10;
        b = 8;
        assertEquals(80, calc.multiplication(a, b), 0);
        assertEquals(80, calc.multiplication(b, a), 0);

        a = 0;
        b = 5;
        assertEquals(0, calc.multiplication(a, b), 0);
        assertEquals(0, calc.multiplication(b, a), 0);
    }

    public void testDivision() {
        double a = 7;
        double b = -7;
        assertEquals(-1, calc.division(a, b), 0);
        assertEquals(-1, calc.division(b, a), 0);

        a = -15;
        b = -15;
        assertEquals(1, calc.division(a, b), 0);
        assertEquals(1, calc.division(b, a), 0);

        a = 10;
        b = 8;
        assertEquals(1.25, calc.division(a, b), 0);
        assertEquals(0.8, calc.division(b, a), 0);

        a = 0;
        b = 5;
        assertEquals(0, calc.division(a, b), 0);
    }

    public void testThrowingException() {
        try {
            calc.division(2, 0);
            new Calculator();

        } catch (Exception e) {
            fail();
        }
        catch (Error e) {
            fail();
        }
    }


}
