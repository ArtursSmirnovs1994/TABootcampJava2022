package sef.finalActivity.fibonacci;

public class fibonacciExtra {

    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;

        while (counter < N) {

            System.out.println(num1);

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String args[])
    {
        // Given Number N
        int N = 5;
        Fibonacci(N);
    }
}