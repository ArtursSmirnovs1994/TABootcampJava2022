package sef.finalActivity.secondActivity;

public class Calculator {

//    My comment for "2) In Calculator class for method addition and subtraction create try catch block to handle
//    that no null values are used".
//
//    These are primitive types, so they can not be null.
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        double result = 0;
        try {
           result = a / b;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Division by 0 is impossible.");
        }
        return result;
    }
}
