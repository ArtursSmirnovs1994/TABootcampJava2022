package sef.module2.activity;

public class PrintNumWithWhile {

    public static void main(String[] args) {

        // Print all even numbers less than 100
        int i = 0;

        while (i < 100) {
            System.out.println(i);
            i = i + 2;
        }

        // write code to Print all odd numbers less than 100

        int oddNum = 1;

        while (oddNum < 100) {
            System.out.println(oddNum);
            oddNum += 2;
        }
    }
}
