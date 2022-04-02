package sef.FinalActivity.SecondActivity;

public class Calculator {
    public int Sum(int a, int b) {
        try {
            int sum = a + b;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null Pointer Exception");
        }
        return a + b;
    }

    public int Substract(int a, int b) {
        try {
            int sub = a - b;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null Pointer Exception");
        }
        return a - b;
    }

    public int Multiply(int a, int b) {
        return a * b;
    }

    public double Divide(int a, int b) {
        try {
            double result = (double) (a / b);

        } catch (ArithmeticException arithmeticException) {
            System.out.println("You should not divide a number by zero");
        }
        return (double) a / b;
    }
}
