package sef.finalActivity.secondActivity;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        addition(2, 6);
        subtraction(4, 8);
        multiplication(0, 8);
        division(6, 0);
    }

    public static int addition(int a, int b) {
        int add = 0;
        try {
            add = a + b;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            ;
        }
        return add;
    }

    public static int subtraction(int a, int b) {
        int sub = 0;
        try {
            sub = a - b;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        return sub;
    }

    public static int multiplication(int a, int b) {
        int mul = 1;
        try {
            mul = a * b;
            return mul;
        } catch (NullPointerException n) {
            System.out.println("Cannot ne null");
        }
        return mul;
    }

    public static int division(int a, int b) {
        int div = 0;
        try {
            div = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            ;
        } catch (NullPointerException n) {
            System.out.println("Cannot ne null");
        } catch (Exception e) {
            System.out.println("Exception!!!");
        }
        return div;
    }

}
