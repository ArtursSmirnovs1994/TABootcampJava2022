package sef.final_activities.extra;

import java.math.BigInteger;
import java.util.Scanner;

// extra activity 2
public class Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // should be good up to 1000, but no checks
        System.out.print("Enter positive number of Fibonacci numbers: ");
        int input = scan.nextInt();
        scan.close();

        if (input <= 0) {
            System.out.println("Number must be positive, run again");
            return;
        }

        BigInteger[] fibos = new BigInteger[input];

        fibos[0] = BigInteger.ZERO;

        if (input > 1) {
            fibos[1] = BigInteger.ONE;
        }

        for (int i = 2; i < input; i++) {
            fibos[i] = fibos[i - 1].add(fibos[i - 2]);
        }

        for (BigInteger fibo : fibos) {
            System.out.println(fibo);
        }

    }

}
