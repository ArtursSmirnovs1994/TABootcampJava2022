package sef.FinalActivity.SecondActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calc;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        calc = new Calculator();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSum() {
        int a = 3;
        int b = 7;
        assertEquals(a + b, calc.Sum(a, b));
        assertEquals(b + a, calc.Sum(b, a));

        a = -3;
        b = 7;
        assertEquals(a + b, calc.Sum(a, b));
        assertEquals(b + a, calc.Sum(b, a));

        a = -3;
        b = -7;
        assertEquals(a + b, calc.Sum(a, b));
        assertEquals(b + a, calc.Sum(b, a));
    }

    public void testSubstract() {

        int a = 7;
        int b = 3;
        assertEquals(a - b, calc.Substract(a, b));
        assertEquals(b - a, calc.Substract(b, a));

        a = 7;
        b = -3;
        assertEquals(a - b, calc.Substract(a, b));
        assertEquals(b - a, calc.Substract(b, a));

        a = -7;
        b = -3;
        assertEquals(a - b, calc.Substract(a, b));
        assertEquals(b - a, calc.Substract(b, a));
    }

    public void testMultiply() {

        int a = 8;
        int b = 4;
        assertEquals(a * b, calc.Multiply(a, b));
        assertEquals(b * a, calc.Multiply(b, a));

        a = -8;
        b = 4;
        assertEquals(a * b, calc.Multiply(a, b));
        assertEquals(b * a, calc.Multiply(b, a));

        a = -8;
        b = -4;
        assertEquals(a * b, calc.Multiply(a, b));
        assertEquals(b * a, calc.Multiply(b, a));
    }

    public void testDivide() {

        int a = 30;
        int b = 6;
        assertEquals((double)a / b, calc.Divide(a, b));
        assertEquals((double)b / a, calc.Divide(b, a));

        a = 30;
        b = -10;
        assertEquals((double)a / b, calc.Divide(a, b));
        assertEquals((double)b / a, calc.Divide(b, a));

        a = -30;
        b = -8;
        assertEquals((double)a / b, calc.Divide(a, b));
        assertEquals((double)b / a, calc.Divide(b, a));
    }
    public void testDivisionByZero() {

        int a = 30;
        int b = 0;
        if (b==0)
        System.out.println("You should not divide a number by zero");

    }
}
