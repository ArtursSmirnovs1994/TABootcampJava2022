package sef.finalActivity.secondActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


  public static void main(String[] args) {
    Calculator theCalculator = new Calculator();
    // positive tests
    testAddition(theCalculator, 3, 7);
    testSubtraction(theCalculator, 2, 3);
    testMultiplication(theCalculator, 3, 4);
    testDivision(theCalculator, 5, 6);

    // negative tests
    testAddition(theCalculator, 3, 0);
    testSubtraction(theCalculator, 5, 0);
    testMultiplication(theCalculator, 3, 0);
    testDivision(theCalculator, 5, 0);
  }

  public static void testAddition(Calculator theCalculator, int a, int b) {
    int result = theCalculator.addition(a, b);
    assertEquals(a + b, result);
  }

  public static void testSubtraction(Calculator theCalculator, int a, int b) {
    int result = theCalculator.subtraction (a, b);
    assertEquals(a - b, result);
  }

  public static void testMultiplication(Calculator theCalculator, int a, int b) {
    int result = theCalculator.multiplication (a, b);
    assertEquals(a * b, result);
  }

  public static void testDivision(Calculator theCalculator, int a, int b) {
    int result = theCalculator.division (a, b);
    assertEquals(a / b, result);
  }



}
