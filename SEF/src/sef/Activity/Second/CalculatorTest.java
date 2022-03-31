package sef.Activity.Second;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest extends TestCase {
    Calculator calculator;

    //TODO: create set up
    //TODO: create teardown
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    @After
    protected void myTearDown() throws Exception {
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    @Test
    public void testGetAdd() {

        int a = 7;
        int b = 5;
        //	Checks the sum of two (2) positive values
        assertEquals(12, (calculator.add(a, b)));
        assertEquals(12, (calculator.add(b, a)));

        a = -2;
        b = 3;
        //	Checks the sum of a positive value and a negative value
        assertEquals(1, (calculator.add(a, b)));
        assertEquals(1, (calculator.add(b, a)));

        a = -2;
        b = -3;
        //	Checks the sum of two (2) negative values
        assertEquals(-5, (calculator.add(a, b)));
        assertEquals(-5, (calculator.add(b, a)));
    }

    @Test
    public void testGetSub() {

        int a = 10;
        int b = 7;
        //	Checks if b is lesser than a
        assertEquals(3, (calculator.sub(a, b)));
        //	Checks if b is greater than a
        assertEquals(-3, (calculator.sub(b, a)));

        a = 10;
        b = -7;
        //	Checks if negative value is subtracted from positive value
        assertEquals(17, (calculator.sub(a, b)));
        //	Checks if positive value is subtracted from negative value
        assertEquals(-17, (calculator.sub(b, a)));

        a = -8;
        b = -6;
        //	Checks if negative value is subtracted from negative value: a > b
        assertEquals(-2, (calculator.sub(a, b)));
        //	Checks if negative value is subtracted from negative value: b < a
        assertEquals(2, (calculator.sub(b, a)));
    }

    @Test
    public void testGetMul() {

        double a = 3;
        double b = 5;
        //	Checks the product of two (2) positive values
        assertEquals(15, (calculator.mul(a, b)), 0);
        assertEquals(15, (calculator.mul(b, a)), 0);

        a = -3;
        b = 5;
        //	Checks the product of a postive value and a negative value
        assertEquals(-15, (calculator.mul(a, b)), 0);
        assertEquals(-15, (calculator.mul(b, a)), 0);

        a = -3;
        b = -5;
        //	Checks the product of two (2) negative values
        assertEquals(15, (calculator.mul(a, b)), 0);
        assertEquals(15, (calculator.mul(b, a)), 0);
    }

    @Test
    public void testGetDiv() {

        double a = 30;
        double b = 5;
        //	Checks if b is lesser than a
        assertEquals(6, (calculator.div(a, b)), 0);
        //	Checks if b is greater than a
        assertEquals(0.16666666666666666, (calculator.div(b, a)), 0);

        a = 8;
        b = -6;
        //	Checks if positive value is divided with negative value
        assertEquals(-1.3333333333333333, (calculator.div(a, b)), 0);
        //	Checks if negative value is divided with positive value
        assertEquals(-0.75, (calculator.div(b, a)), 0.007);

        a = -10;
        b = -2;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(5, (calculator.div(a, b)), 0);
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(0.2, (calculator.div(b, a)), 0);
    }

    @Test
    public void testThrowException() {

        try {

            calculator.add(2, 1);
            calculator.sub(3, 3);
            calculator.mul(0, 1);
            calculator.div(1, 0);
            new Calculator();

        } catch (Exception e) {
            fail();
        } catch (Error e) {
            fail();
        }
    }
}
