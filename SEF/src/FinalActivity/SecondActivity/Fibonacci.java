package FinalActivity.SecondActivity;

import java.util.Scanner;

class Fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }

    public static void main(String args[]) {
        int count;
        Scanner scanner = new Scanner(System.in);
        try {
            count = Integer.parseInt(scanner.nextLine());
            System.out.print(n1 + " " + n2);//printing 0 and 1
            printFibonacci(count - 2);//n-2 because 2 numbers are already printed
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}