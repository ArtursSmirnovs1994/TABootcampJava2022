package sef.finalActivity.extra;

import java.util.Scanner;

//EXTRA activity 3)

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a positive number of how long Fibonacci numbers sequence should be:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int f1 = 0, f2 = 1, i;
        if (n < 1)
            return;
        System.out.print(f1 + " ");
        for (i = 1; i < n; i++)
        {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
}
