package sef.FinalPackage.SecondActivity;

public class Calculator {

    public int addMethod(int a, int b) {
        return a + b;
    }

    public int substractMethod(int a, int b) {

        return a - b;
    }

    public double multiplyMethod(double a, double b) {
        try {
            if (a == 0 || b == 0) {
                System.out.println(">>>>>>Multiplication by zero gives zero");
                }
            } catch (Exception e) {
            } finally  {
            return a * b;
        }
    }

    public double divideMethod(double a, double b) {
        try {
            if (a == 0 || b == 0) {
                System.out.println("\n>>>>>>It is not possible to divide zero");
            }
        } catch (Exception e) {
        } finally  {
            return a / b;
        }
    }


}
