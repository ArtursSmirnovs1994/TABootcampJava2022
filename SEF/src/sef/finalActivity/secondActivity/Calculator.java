package sef.finalActivity.secondActivity;

public class Calculator {

    public int getSum(int x, int y) {
        try {
            System.out.println( x - y );
        } catch (ArithmeticException a) {
            System.out.println(" fool ");
        } catch (Exception e) {
            System.out.println("congrats you broke this simple calculator");
        }

        return x + y;
    }

    public int getDiff(int x, int y) {
        try {
            System.out.println( x - y );
        } catch (ArithmeticException a) {
            System.out.println(" no *sparkle heart emoji*");
        } catch (Exception e) {
            System.out.println("congrats you broke this simple calculator");
        }
        return x - y;
    }

    public int getProd(int x, int y) {
        try {
            System.out.println( x * y);
        } catch (ArithmeticException a) {
            System.out.println("i could just tell that multiplying by zero is always zero but where's the fun in that :)");
        } catch (Exception e) {
            System.out.println("congrats you broke this simple calculator");
        }
        return x * y;
    }

    public int getQuot(int x, int y) {
        try {
            System.out.println( x / y );
        } catch (ArithmeticException a) {
            System.out.println("how dare you use these numbers?");
        } catch (Exception e) {
            System.out.println("congrats you broke this simple calculator");
        }
        return (x / y);
    }

 }
