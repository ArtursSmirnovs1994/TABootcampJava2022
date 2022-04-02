package sef.FinalActivity.ExtraActivity;

public class Calculator {
    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";
    public static final String CALC_TYPE_ADVANCED = "Advanced";

    // Default constructor
    public Calculator() {}

    // Parameterized constructor
    public Calculator(String calculatorType) {
        System.out.println("New Calculator: " + calculatorType);
        this.calculatorType = calculatorType;
    }

    // Getter for CalculatorType
    public String getCalculatorType() {
        return calculatorType;
    }

    // Setter for CalculatorType
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Add
    public int add(Integer x, Integer y) {
        int sum;
        try {
            if ((x == null) || (y == null))
                throw new ArithmeticException();
            sum = x + y;
        } catch (ArithmeticException ae){
            System.out.println("Addition with NULL is not allowed");
            sum=0;
        }
        return sum;
    }

    // Subtract
    public int subtract(Integer x, Integer y) {
        int diff;
        try {
            if ((x == null) || (y == null))
                throw new ArithmeticException();
            diff = x - y;
        } catch (ArithmeticException ae){
            System.out.println("Subtraction with NULL is not allowed");
            diff=0;
        }
        return diff;
    }

    // Multiply
    public int multiply(int[] numbers) {
        int temp = 1;

        try {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]==0)
                    throw new ArithmeticException();
                temp = temp * numbers[i];
            }
        } catch (ArithmeticException ae){
            System.out.println("Multiply with 0 is not allowed");
            temp = 0;
        }
        return temp;
    }

    // Divide
    public int divide(Integer x, Integer y) {
        int divValue=0;
        try{
            if (y==0)
                throw new ArithmeticException();
            divValue=x/y;
        }catch (ArithmeticException ae){
            System.out.println("Division with 0 is not allowed");
        }
        return divValue;
    }
}
