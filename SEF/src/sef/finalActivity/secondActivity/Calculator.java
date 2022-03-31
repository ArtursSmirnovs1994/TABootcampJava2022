package sef.finalActivity.secondActivity;

public class Calculator {

    public int getSum(int x, int y) {
        return x + y;
    }

    public int getSubtraction(int x, int y) {
        return x - y;
    }

    public double getMultiplication(double x, double y) {
        return x * y;
    }


    public double getDivision(double x, double y) {
        return x/ y;}

    public static void main (String args[]) {


        try { int x = 1, y = 0;
            int result=x/y;
            System.out.println("Result: " + result);}
        catch(ArithmeticException e) { System.out.println("Division by zero is impossible");}

        try {
            int x = 0;
            int y =1;
            int result = x*y;
            if(result == 0) {throw new ArithmeticException("Multiplication by zero is not allowed");}}
        catch(ArithmeticException a)
        { System.out.println("Multiplication by zero is not allowed");}

        try {  Integer x = null;
            Integer y = null;
            int result=x+y;
            System.out.println("Result: " + result);}
        catch(NullPointerException nullPointerException)
        { System.out.println("No null values can be used while summing");}

        try {  Integer x = null;
            Integer y = null;
            int result=x-y;
            System.out.println("Result: " + result);}
        catch(NullPointerException nullPointerException)
        { System.out.println("No null values can be used while subtraction");}

    }
    }



