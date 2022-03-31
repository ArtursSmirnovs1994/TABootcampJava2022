package sef.final_activities.second_activity;

public class Calculator {

    public Integer addition(Integer a, Integer b) {
        try {
            return a + b;
        } catch (NullPointerException exception) {
            System.out.println("Operations with null are not allowed");
            return null;
        }
    }

    public Integer subtraction(Integer a, Integer b) {
        try {
            return a - b;
        } catch (NullPointerException exception) {
            System.out.println("Operations with null are not allowed");
            return null;
        }
    }

    public Integer multiplication(int a, int b) {
        // Multiplication is a safe operation, we can't cause any exceptions, nothing to try or catch
        // so instead here is a check for a and b to be zero;
        if (a == 0 || b == 0) {
            System.out.println("This calculator does not allow multiplication by zero");
            return null;
        }
        return a * b;
    }

    public Integer division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero is not allowed");
            return null;
        }
    }

}
