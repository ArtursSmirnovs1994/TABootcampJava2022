package sef.FinalActivity.SecondActivity;


public class Calculator_D {

    public int getSum(int a, int b) {
        return a + b;
    }

    public int getDifference(int a, int b) {
        return a - b;
    }

    public double getProduct(double a, double b) {
        return a * b;
    }

    public double getQuotient(double a, double b) {
        return a / b;
    }

    void divZero (int a, int b) {
        try {
            getProduct(a, b);
            getQuotient(a, b);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Cannot divide or multiply by zero");
        }
    }

    void sumNull (int a, int b) {
        try {
            getSum(a, b);
            getDifference(a, b);
        } catch (NullPointerException nullPointerException) {
            System.out.println("Cannot add or subtract null values");
        }
    }
}
