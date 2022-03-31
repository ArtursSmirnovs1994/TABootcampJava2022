package sef.finalActivity.secondActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator calculator;

    protected void mySetUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    protected void myTearDown() throws Exception {
        super.tearDown();
    }

    public void testGetSum() {

        int x = 6;
        int y = 9;

        assertEquals(15, (calculator.getSum(x,y)));
        assertEquals(15, (calculator.getSum(y,x)));
    }

    public void testGetDiff() {

        int x = 6;
        int y = 9;

        assertEquals(-3,(calculator.getDiff(x,y)));
        assertEquals(3, (calculator.getDiff(y,x)));
    }

    public void testGetProd() {

        int x = 6;
        int y = 9;

        assertEquals(54, (calculator.getDiff(x,y)));
        assertEquals(54, (calculator.getDiff(y,x)));
    }

    public void testGetQuot() {

        int x = 6;
        int y = 9;

        assertEquals(0.66, calculator.getProd(x,y));
        assertEquals(1.5, calculator.getProd(y,x));
    }

    public void testThrowException() {
        try {

            calculator.getSum(5, 7);
            calculator.getDiff(8,8);
            calculator.getProd(4,7);
            calculator.getQuot(18,6);
            new Calculator();

        } catch (Exception e) {
            fail();
        } catch (Error e) {
            fail();
        }
    }
}
