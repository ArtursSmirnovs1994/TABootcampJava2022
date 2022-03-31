package sef.final_activities.second_activity;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static Calculator calc;


    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals("Addition", 125, calc.addition(25, 100).intValue());
        assertEquals("Addition", 777, calc.addition(777, 0).intValue());
        assertEquals("Addition", -134, calc.addition(0, -134).intValue());
        assertEquals("Addition", 0, calc.addition(12_345, -12_345).intValue());
        assertEquals("Addition", 50, calc.addition(-10_050, 10_100).intValue());
        assertEquals("Addition", 1_000_000, calc.addition(1, 999_999).intValue());
    }

    @Test
    public void testAdditionWithNull() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // saving original output target
        PrintStream originalOut = System.out;
        // redirecting console output to our byte stream
        System.setOut(new PrintStream(outContent));

        String expectedMessage = "Operations with null are not allowed\r\n";

        assertNull("Null plus number", calc.addition(null, 777));
        assertEquals("Null not allowed message", expectedMessage, outContent.toString());

        // resetting buffer to get new output
        outContent.reset();

        assertNull("Number plus null", calc.addition(0, null));
        assertEquals("Null not allowed message", expectedMessage, outContent.toString());

        // resetting buffer to get new output
        outContent.reset();

        assertNull("Null plus null", calc.addition(null, null));
        assertEquals("Null not allowed message", expectedMessage, outContent.toString());

        // returning normal output
        System.setOut(originalOut);
    }

    @Test
    public void testSubtraction() {
        assertEquals("Subtraction", -75, calc.subtraction(25, 100).intValue());
        assertEquals("Subtraction", 777, calc.subtraction(777, 0).intValue());
        assertEquals("Subtraction", 134, calc.subtraction(0, -134).intValue());
        assertEquals("Subtraction", 24_690, calc.subtraction(12_345, -12_345).intValue());
        assertEquals("Subtraction", -20_150, calc.subtraction(-10_050, 10_100).intValue());
        assertEquals("Subtraction", -999_998, calc.subtraction(1, 999_999).intValue());
    }

    @Test
    public void testSubtractionWithNull() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // saving original output target
        PrintStream originalOut = System.out;
        // redirecting console output to our byte stream
        System.setOut(new PrintStream(outContent));

        String expectedMessage = "Operations with null are not allowed\r\n";

        assertNull("Null minus number", calc.subtraction(null, 777));
        assertEquals("Null not allowed message", expectedMessage, outContent.toString());

        // resetting buffer to get new output
        outContent.reset();

        assertNull("Number minus null", calc.subtraction(0, null));
        assertEquals("Null not allowed message", expectedMessage, outContent.toString());

        // resetting buffer to get new output
        outContent.reset();

        assertNull("Null minus null", calc.subtraction(null, null));
        assertEquals("Null not allowed message", expectedMessage, outContent.toString());

        // returning normal output
        System.setOut(originalOut);
    }

    @Test
    public void testMultiplication() {
        assertEquals("Multiplication", 2500, calc.multiplication(25, 100).intValue());
        assertEquals("Multiplication", 1_111_111, calc.multiplication(239, 4649).intValue());
        assertEquals("Multiplication", -134, calc.multiplication(1, -134).intValue());
        assertEquals("Multiplication", 4, calc.multiplication(2, 2).intValue());
        assertEquals("Multiplication", -49, calc.multiplication(-7, 7).intValue());
        assertEquals("Multiplication", -999_998, calc.multiplication(-999_998, 1).intValue());
    }

    @Test
    public void testSubtractionWithZero() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // saving original output target
        PrintStream originalOut = System.out;
        // redirecting console output to our byte stream
        System.setOut(new PrintStream(outContent));

        String expectedMessage = "This calculator does not allow multiplication by zero\r\n";

        assertNull("Number * 0", calc.multiplication(777, 0));
        assertEquals("Zero not allowed message", expectedMessage, outContent.toString());

        // resetting buffer to get new output
        outContent.reset();

        assertNull("0 * Number", calc.multiplication(0, 777));
        assertEquals("Zero not allowed message", expectedMessage, outContent.toString());

        // resetting buffer to get new output
        outContent.reset();

        assertNull("0 * 0", calc.multiplication(0, 0));
        assertEquals("Zero not allowed message", expectedMessage, outContent.toString());

        // returning normal output
        System.setOut(originalOut);
    }

    @Test
    public void testDivision() {
        assertEquals("Division", 1, calc.division(1234, 1234).intValue());
        assertEquals("Division", 0, calc.division(567, 568).intValue());
        assertEquals("Division", -101, calc.division(1212, -12).intValue());
        assertEquals("Division", 10_000, calc.division(10_000_000, 1000).intValue());
        assertEquals("Division", 111, calc.division(-777, -7).intValue());
        assertEquals("Division", -999_998, calc.division(-999_998, 1).intValue());
        assertEquals("Division", 0, calc.division(0, 1).intValue());
    }

    @Test
    public void testDivisionByZero() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // saving original output target
        PrintStream originalOut = System.out;
        // redirecting console output to our byte stream
        System.setOut(new PrintStream(outContent));

        String expectedMessage = "Division by zero is not allowed\r\n";

        assertNull("Division by zero", calc.division(777, 0));
        assertEquals("Division by zero not allowed", expectedMessage, outContent.toString());

        // returning normal output
        System.setOut(originalOut);
    }

}
