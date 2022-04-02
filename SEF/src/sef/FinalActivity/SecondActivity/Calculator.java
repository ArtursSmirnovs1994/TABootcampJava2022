package sef.FinalActivity.SecondActivity;

public class Calculator {

    // due to issues with doubles using int for sum and difference
    // could have been solved with Scanner usage, but will take too much time for me to study it :)
    public int getSum(int a, int b) {
        return a + b;
    }

    public int getDifference(int a, int b) {
        return a - b;
    }

    public double getMultiply(double a, double b) {
        return a * b;
    }

    public double getDivision(double a, double b) {
        return a / b;
    }


    public static void main(String[] args) {

        int a = 8, b = 0;

        try {

            int result = a / (int) b; //
            System.out.println(result);
            System.out.println("Try");

        } catch (Exception e) {

            System.out.println("division by zero exception");
            System.out.println("Catch");

        } finally {

            a = 8;
            b = 0;

            try {

                int result = a * (int) b;
                System.out.println(result);
                System.out.println("Try");

            } catch (Exception e) {

                System.out.println("Multiply by zero exception");
                System.out.println("Catch");


            }

        }
    }
}
