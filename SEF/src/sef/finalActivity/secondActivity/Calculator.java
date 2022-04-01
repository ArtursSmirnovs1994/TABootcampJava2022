package sef.finalActivity.secondActivity;

public class Calculator {


    public int doAdd(int a, int b) {
        return a + b;
    }

    public int doSubtract(int a, int b) {
        return a - b;
    }

    public int doMultiply(int a, int b) {
        return a * b;
    }

    public int doDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException arex) {
            System.out.println("Division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("Exception!");
        }
        return a/b;
    }

}
