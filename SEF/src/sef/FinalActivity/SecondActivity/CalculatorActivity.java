package sef.FinalActivity.SecondActivity;

public class CalculatorActivity {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Integer x = 15;
        Integer y = 5;
        Integer yNull = null;
        Integer y0 = 0;
        int[] mul = {2,3,4,5};
        int[] mul0 = {0,3,4,5};

        System.out.println("Addition: " + calc.add(x,y));
        System.out.println("Subtraction: " + calc.subtract(x,y));
        System.out.println("Multiply: " + calc.multiply(mul));
        System.out.println("Divide: " + calc.divide(x,y));

        System.out.println("*** Exception cases ***");
        System.out.println("Addition with NULL: " + calc.add(x,yNull));
        System.out.println("Subtraction with NULL: " + calc.subtract(x,yNull));
        System.out.println("Multiply with 0: " + calc.multiply(mul0));
        System.out.println("Divide with 0: " + calc.divide(x,y0));
    }

    }
