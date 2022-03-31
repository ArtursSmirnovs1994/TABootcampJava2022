package sef.FinalActivity.FirstActivity;

public class Fibonacci {

    // EXTRA activity 3
    public static void main (String[] args) {

        int fibonacciLength = 10;
        int fib1 = 0;
        int fib2 = 1;
        int fib;
        for (int i = 1; i <= fibonacciLength; i++) {
            System.out.println(fib1);
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
    }
}
