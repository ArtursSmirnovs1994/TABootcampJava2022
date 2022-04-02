package sef.FinalActivity;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Please, enter how many Fibonacci numbers to display");
    int Result = input.nextInt();

    int first=0;
    int second=1;
        System.out.println("Fibonacci "+Result+" numbers are: ");
    for (int i=1; i<=Result; i++){
        System.out.println(first);
       int  num=second+first;
        first=second;
        second=num;

    }


}
}
