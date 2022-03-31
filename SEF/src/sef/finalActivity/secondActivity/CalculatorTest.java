package sef.finalActivity.secondActivity;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setUp() {
        this.calc = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = 1;
        int b = 2;
        int expected = 3;
        int actual;

        actual = this.calc.add(a,b);
        assertEquals(expected, actual, 0);


    }
}
