package sef.FinalActivity.SecondActivity;


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

    public void testAdd() throws Exception {

        int a = 5;
        int b = 10;
        //	Checks the sum of two (2) positive values
        assertEquals(15, (calculator.add(a,b)));
        assertEquals(15, (calculator.add(b,a)));

        a = -5;
        b = 10;
        //	Checks the sum of a postive value and a negative value
        assertEquals(5, (calculator.add(a,b)));
        assertEquals(5, (calculator.add(b,a)));

        a = -5;
        b = -10;
        //	Checks the sum of two (2) negative values
        assertEquals(-15, (calculator.add(a,b)));
        assertEquals(-15, (calculator.add(b,a)));
    }

    public void testSub() throws Exception {

        int a = 3;
        int b = 2;
        //	Checks if b is lesser than a
        assertEquals(1, (calculator.sub(a,b)));
        //	Checks if b is greater than a
        assertEquals(-1, (calculator.sub(b,a)));

        a = 5;
        b = -4;
        //	Checks if negative value is subtracted from positive value
        assertEquals(9, (calculator.sub(a,b)));
        //	Checks if positive value is subtracted from negative value
        assertEquals(-9, (calculator.sub(b,a)));

        a = -10;
        b = -5;
        //	Checks if negative value is subtracted from negative value: a > b
        assertEquals(-5, (calculator.sub(a,b)));
        //	Checks if negative value is subtracted from negative value: b < a
        assertEquals(5, (calculator.sub(b,a)));
    }

    public void testMultiply() throws Exception {

        double a = 5;
        double b = 10;
        //	Checks the product of two (2) positive values
        assertEquals(50, (calculator.multiply(a,b)),0);
        assertEquals(50, (calculator.multiply(b,a)),0);

        a = -5;
        b = 10;
        //	Checks the product of a postive value and a negative value
        assertEquals(-50, (calculator.multiply(a,b)),0);
        assertEquals(-50, (calculator.multiply(b,a)),0);

        a = -3;
        b = -10;
        //	Checks the product of two (2) negative values
        assertEquals(30, (calculator.multiply(a,b)),0);
        assertEquals(30, (calculator.multiply(b,a)),0);
    }

    public void testDivide() throws Exception {

        double a = 10;	double b = 5;
        //	Checks if b is lesser than a
        assertEquals(2,(calculator.divide(a,b)), 0);
        //	Checks if b is greater than a
        assertEquals(0.5, (calculator.divide(b,a)),0);

        a = 9;	b = -3;
        //	Checks if positive value is divided with negative value
        assertEquals(-3, (calculator.divide(a,b)),0);
        //	Checks if negative value is divided with positive value
        assertEquals(-0.33, (calculator.divide(b,a)),0.007);

        a = -10;	b = -5;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(2, (calculator.divide(a,b)),0);
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(0.5, (calculator.divide(b,a)),0);
    }

    public void testThrowException(){

        try {

            calculator.add(3, 1);

        } catch (Exception e) {
            return;
        }
        catch (Error e) {
            fail();
        }
        try {
            calculator.sub(3, 3);

        } catch (Exception e) {
            return;
        }
        catch (Error e) {
            fail();
        }
        try {
            calculator.multiply(0, 1);

        } catch (Exception e) {
            return;
        }
        catch (Error e) {
            fail();
        }
        try {
            calculator.divide(1, 0);

        } catch (Exception e) {
            return;
        }
        catch (Error e) {
            fail();
        }
    }
}

