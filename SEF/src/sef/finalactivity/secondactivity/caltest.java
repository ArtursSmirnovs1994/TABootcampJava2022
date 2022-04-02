package sef.finalactivity.secondactivity;

import junit.framework.TestCase;
import sef.module9.sample.MyCalculatorTest;

public class caltest extends TestCase {
    private calculator calculatortest;

    protected void setUp() throws Exception{
        super.setUp();
        calculatortest = new calculator();

    }

    protected void tearDown() throws Exception{
        super.tearDown();
    }

    public void test_get_add(){
        int a = 10;
        int b = 5;
        int c = -6;
        int d = 0;

        assertEquals(15,(calculator.sum(a,b)));
        assertEquals(4,(calculator.sum(a,c)));
        assertEquals(10,(calculator.sum(a,d)));

    }
    public void test_get_sub(){
        int a = 10;
        int b = 5;
        int c = -6;
        int d = 0;

        assertEquals(5,(calculator.sub(a,b)));
        assertEquals(16,(calculator.sub(a,c)));
        assertEquals(10,(calculator.sub(a,d)));

    }

    public void test_get_mul(){
        int a = 10;
        int b = 5;
        int c = -6;
        int d = 0;

        assertEquals(50,(calculator.mul(a,b)));
        assertEquals(-60,(calculator.mul(a,c)));
        assertEquals(0,(calculator.mul(a,d)));
    }

    public void test_get_div(){
        int a = 10;
        int b = 5;
        int c = -6;
        int d = 0;

        assertEquals(2,(calculator.div(a,b)));
        assertEquals(-1,(calculator.div(a,c)));
        assertEquals(0,(calculator.div(a,d)));
    }
}
