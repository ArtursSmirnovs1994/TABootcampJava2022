package sef.FinalActivity.SecondActivity;

import junit.framework.TestCase;
import sef.FinalActivity.FirstActivity.Person;
import sef.FinalActivity.FirstActivity.PersonCustomException;

public class CalculatorTest extends TestCase {
    private Calculator calc;
    private Integer X = 15;
    private Integer Y = 5;
    private Integer YNull = null;
    private Integer Y0 = 0;
    private int[] mul = {2,3,4,5};
    private int[] mul0 = {0,3,4,5};

    //TODO: create set up
    protected void setUp() throws Exception {
        calc = new Calculator();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //Test Addition, with valid and NULL values
    public void testAdd() {
        assertEquals(20, calc.add(X,Y));
        assertEquals(0, calc.add(X,YNull));
    }

    //Test Subtraction, with valid and NULL values
    public void testSubtr() {
        assertEquals(10, calc.subtract(X,Y));
        assertEquals(0, calc.subtract(X,YNull));
    }

    //Test Multiplication, with valid and 0 values
    public void testMult() {
        assertEquals(120, calc.multiply(mul));
        assertEquals(0, calc.multiply(mul0));
    }

    //Test Division, with valid and 0 values
    public void testDiv() {
        assertEquals(3, calc.divide(X,Y));
        assertEquals(0, calc.divide(X,Y0));
    }
}
