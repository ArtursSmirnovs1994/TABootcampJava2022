package sef.module9.sample;

// Complete Code
class MyCalculator { // doesnt need attributes has methods only

    public int getSum(int a, int b) {

        return a + b;
    }
//We need to ensure that all methods are checked.
    //Good practice is to have 1 test for 1 method
    //Exception 1 for 1 is in exception testing
    public int getDifference(int a, int b) {
        return a - b;
    }

    public double getProduct(double a, double b) {
        return a * b;
    }

    public double getQuotient(double a, double b) {
        return a / b;
    }
}
