package sef.module2.activity;

public class Calculator {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int[] nums = {1, 2, 3, 4};

        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x, y));

    }

    private static int add(int x, int y) {
        return x + y;
    }

    private static int subtract(int x, int y) {
        // implement subtraction
        return x - y;
    }

    private static int multiply(int[] numbers) {
        int temp = 1;

        for (int number : numbers) {
            temp *= number;
        }

        return temp;
    }

    private static int divide(int x, int y) {
        int divValue = 0;

        if (x == 0 && y == 0) {
            // complete the code so message is printed that dividing 0 with 0 is not possible
            System.out.println("Dividing 0 with 0 is not possible");
        } else if (y == 0) {
            // complete the code so message is printed that division by 0 is not possible
            System.out.println("Division by 0 is not possible");
        } else {
            // complete the code so that division is done
            divValue = x / y;
        }

        return divValue;
    }

}

