package sef.FinalActivity.ExtraActivity;

import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter size of Fibonacci sequence (from 2 to 20):");
        try {
            size = sc.nextInt();
            if (size<2) size=2;
            if (size>20) size=20;
        }catch (Exception e){
            size=2;
        }

        //Initial elements for Fibonacci sequence
        int A=0;
        int B=1;
        int C;
        String Fibonacci = A + " " + B;

        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
        for (int i=2;i<size;i++){
            C = A+B;
            A = B;
            B = C;
            Fibonacci = Fibonacci + " " + C;
        }

        System.out.println("Fibonacci sequence [" + size + "]: " + Fibonacci);
    }
}