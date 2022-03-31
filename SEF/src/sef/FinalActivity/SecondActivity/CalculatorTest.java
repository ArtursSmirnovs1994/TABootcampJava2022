package sef.FinalActivity.SecondActivity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        Double expectedResult = 3333.3333;
        Double operand1 = 1111.1111;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Addition:", expectedResult, calc.add(operand1, operand2),0.000001f);
    }

    @Test
    public void tesSubtract() {
        Double expectedResult = 1111.1111;
        Double operand1 =  3333.3333;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Subtraction:", expectedResult, calc.subtract(operand1, operand2),0.000001f);
    }

    @Test
    public void testMultiply() {
        Double expectedResult = 2_469_135.75308642;
        Double operand1 = 1111.1111;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Multiplication:", expectedResult, calc.multiply(operand1, operand2),0.000001f);
    }

    @Test
    public void testDivide() {
        Double expectedResult = 1.5;
        Double operand1 = 3333.3333;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Division:", expectedResult, calc.divide(operand1, operand2),0.000001f);
    }

    @Test
    public void testAddWithZero() {
        Double operand1 = 0.0;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Adding to 0:", operand2, calc.add(operand1, operand2),0.000001f);
        Assert.assertEquals("Adding 0:", operand2, calc.add(operand2, operand1),0.000001f);
    }

    @Test
    public void testSubtractWithZero() {
        Double operand1 = 0.0;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Subtracting from 0:", -operand2, calc.subtract(operand1, operand2),0.000001f);
        Assert.assertEquals("Subtracting 0:", operand2, calc.subtract(operand2, operand1),0.000001f);
    }

    @Test
    public void testMultiplyWithZero() {
        Double expectedResult = 0.0;
        Double operand1 = 0.0;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Multiplying 0:", expectedResult, calc.multiply(operand1, operand2),0.000001f);
        Assert.assertEquals("Multiplying by 0:", operand2, calc.multiply(operand2, operand1),0.000001f);
    }

    @Test
    public void testDivideWithZero() {
        Double expectedResult = 0.0;
        Double operand1 = 0.0;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Dividing 0:", expectedResult, calc.divide(operand1, operand2),0.000001f);
        Assert.assertEquals("Dividing by 0:", operand2, calc.divide(operand2, operand1),0.000001f);
    }

    @Test
    public void testAddWithNull() {
        Double operand1 = null;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Adding to Null:", operand2, calc.add(operand1, operand2),0.000001f);
        Assert.assertEquals("Adding Null:", operand2, calc.add(operand2, operand1),0.000001f);
    }

    @Test
    public void testSubtractWithNull() {
        Double operand1 = null;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Subtracting from Null:", 0.0, calc.subtract(operand1, operand2),0.000001f);
        Assert.assertEquals("Subtracting Null:", operand2, calc.subtract(operand2, operand1),0.000001f);
    }

    @Test
    public void testMultiplyWithNull() {
        Double operand1 = null;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Multiplying Null:", 0.0, calc.multiply(operand1, operand2),0.000001f);
        Assert.assertEquals("Multiplying by Null:", operand2, calc.multiply(operand2, operand1),0.000001f);
    }

    @Test
    public void testDivideWithNull() {
        Double operand1 = null;
        Double operand2 = 2222.2222;
        Assert.assertEquals("Dividing Null:", 0.0, calc.divide(operand1, operand2),0.000001f);
        Assert.assertEquals("Dividing by Null:", operand2, calc.divide(operand2, operand1),0.000001f);
    }


}
