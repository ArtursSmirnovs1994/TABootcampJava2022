package sef.FinalActivity.ExtraActivity;

import java.util.Scanner;

public class CalculatorActivity {
    public static void main(String[] args) {
        Integer x = 15;
        Integer y = 5;
        int[] mul = {2,3,4,5};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Calculator type - 'Basic' or 'Advanced'");
        String calcType = sc.next();
        Calculator calc = new Calculator(calcType);

        System.out.println("Enter integer X");
        x = sc.nextInt();
        System.out.println("Enter integer Y");
        y = sc.nextInt();
        System.out.println("Enter number of integers to be multiplied");
        int n = sc.nextInt();
        System.out.println("Enter [" + n + "] integers for multiplication array");
        mul = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("#" + i);
            mul[i]=sc.nextInt();
        }

        System.out.println("Addition: " + calc.add(x,y));
        System.out.println("Subtraction: " + calc.subtract(x,y));
        System.out.println("Multiply: " + calc.multiply(mul));
        System.out.println("Divide: " + calc.divide(x,y));
    }

}
