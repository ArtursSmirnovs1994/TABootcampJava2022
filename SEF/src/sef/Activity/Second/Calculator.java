
package sef.Activity.Second;

public class Calculator {
//    In calculator class create methods for addition, subtraction, multiplication, division.
//In module SecondActivity create CalculatorTest class
//Add unit test for each of the method.

//In Calculator class for method division and multiplication create try catch block to handle multiplication or division by zero
//In Calculator class for method addition and subtraction create try catch block to handle that no null values are used
//Create unit tests to validate that try catch blocks are working properly for addition, subtraction, division, multiplication.

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int sub(int a, int b) {
        int diff = a - b;
        return diff;
    }

    //try catch block to handle that no null values are used

    /*Initializing only for String variable with null value String ptr = null;

    public static void main (String[] args){
        try
        {
            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
        }*/

    public double mul(double a, double b) {
        double mulValue = a * b;
        return mulValue;
    }

    public double div(double a, double b) {
        double divValue = a / b;
        return divValue;
    }

    //create try catch block to handle multiplication or division by zero

    /*Initializing only for division variable by z;
     */
    public int div(int a, int b) {
        int divValue = 0;
        try {
            divValue = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            divValue = 0;
        }
        return divValue;
    }
}
