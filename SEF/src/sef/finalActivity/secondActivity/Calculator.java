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


    // I know, that int cannot return null,
    // so this way it will try to make the illegal division by 0 anyway.
    // But it will also catch the illegal argument message and present it.

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
