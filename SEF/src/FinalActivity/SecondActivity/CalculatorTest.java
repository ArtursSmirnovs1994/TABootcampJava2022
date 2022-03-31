package FinalActivity.SecondActivity;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private MyCalculator calculator;
    @Before
    public void setUp() {
        calculator = new MyCalculator();
    }
    @After
    public void tearDown() {
    }
    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        //	Checks the sum of two positive values
        Assert.assertEquals(5, (calculator.add(a, b)));
        Assert.assertEquals(5, (calculator.add(b, a)));

        a = -2;
        b = 3;
        //	Checks the sum of a positive value and a negative value
        Assert.assertEquals(1, (calculator.add(a, b)));
        Assert.assertEquals(1, (calculator.add(b, a)));

        a = -2;
        b = -3;
        //	Checks the sum of two negative values
        Assert.assertEquals(-5, (calculator.add(a, b)));
        Assert.assertEquals(-5, (calculator.add(b, a)));
    }
    @Test
    public void testSubtract() {

        int a = 3;
        int b = 2;
        //	Checks if b is lesser than a
        Assert.assertEquals(1, (calculator.subtract(a, b)));
        //	Checks if b is greater than a
        Assert.assertEquals(-1, (calculator.subtract(b, a)));

        a = 5;
        b = -4;
        //	Checks if negative value is subtracted from positive value
        Assert.assertEquals(9, (calculator.subtract(a, b)));
        //	Checks if positive value is subtracted from negative value
        Assert.assertEquals(-9, (calculator.subtract(b, a)));

        a = -10;
        b = -5;
        //	Checks if negative value is subtracted from negative value: a > b
        Assert.assertEquals(-5, (calculator.subtract(a, b)));
        //	Checks if negative value is subtracted from negative value: b < a
        Assert.assertEquals(5, (calculator.subtract(b, a)));
    }
    @Test
    public void testMultiply() {

        int a = 5;
        int b = 10;
        //	Checks the product of two (2) positive values
        Assert.assertEquals(50, (calculator.multiply(a, b)), 0);
        Assert.assertEquals(50, (calculator.multiply(b, a)), 0);

        a = -5;
        b = 10;
        //	Checks the product of a positive value and a negative value
        Assert.assertEquals(-50, (calculator.multiply(a, b)), 0);
        Assert.assertEquals(-50, (calculator.multiply(b, a)), 0);

        a = -3;
        b = -10;
        //	Checks the product of two (2) negative values
        Assert.assertEquals(30, (calculator.multiply(a, b)), 0);
        Assert.assertEquals(30, (calculator.multiply(b, a)), 0);
    }

    @Test
    public void testDivide() {

        int a = 10;
        int b = 5;
        //	Checks if b is lesser than a
        Assert.assertEquals(2, (calculator.divide(a, b)), 0);
        //	Checks if b is greater than a
        Assert.assertEquals(0, (calculator.divide(b, a)), 0);

        a = 9;
        b = -3;
        //	Checks if positive value is divided with negative value
        Assert.assertEquals(-3, (calculator.divide(a, b)), 0);
        //	Checks if negative value is divided with positive value
        Assert.assertEquals(0, (calculator.divide(b, a)), 0.007);

        a = -10;
        b = -5;
        //	Checks if negative value is divided with negative value: a > b
        Assert.assertEquals(2, (calculator.divide(a, b)), 0);
        //	Checks if negative value is divided with negative value: b < a
        Assert.assertEquals(0, (calculator.divide(b, a)), 0);
    }

    @Test
    public void testDivideByZero() {
        Assert.assertEquals(0,calculator.divide(4,0));
    }
    @Test
    public void testMultiplyByZero() {
        Assert.assertEquals(0,calculator.multiply(4,0));
    }
}



