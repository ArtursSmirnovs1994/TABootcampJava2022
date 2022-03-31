package sef.FinalActivity.SecondActivity;

public class Calculator {

    public int add(int a, int b) throws Exception {
//INT CANNOT BE NULL VALUES
        try {
            if (a == 0 || b == 0) {
                throw new ArithmeticException("Cannot Add Null Values");
            }
            return a + b;
        }
        catch(ArithmeticException e) {
            throw new Exception(" Cannot Add Null Values");
        }
    }

    public int sub(int a, int b) throws Exception {
        try {
                 if (a == 0 || b == 0){
                    throw new ArithmeticException("Cannot Subtract Null Values");
                }
            return a - b;
    }
    catch(ArithmeticException e) {
        throw new Exception(" Cannot Subtract Null Values");
    }
    }

    public double multiply(double a, double b) throws Exception {

        try {
            if (a == 0 || b == 0) {
            throw new ArithmeticException("You're multplying by zero!");
        }
            return a * b;
        }
        catch(ArithmeticException e) {
            throw new Exception(" Cannot Multiply By Zero");
        }
    }

    public double divide(double a, double b) throws Exception {
        try {
            return a / b;
        }
        catch (ArithmeticException e)
        {
            throw new Exception("Cannot Divide By Zero");
        }


    }
}
