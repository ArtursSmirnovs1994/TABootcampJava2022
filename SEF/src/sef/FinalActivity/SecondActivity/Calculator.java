package sef.FinalActivity.SecondActivity;

public class Calculator {

    public Double add(Double operand1, Double operand2) {
        try {
            if (operand1 == null) throw new IllegalArgumentException("Value 1 is null");
            if (operand2 == null) throw new IllegalArgumentException("Value 2 is null");
            return operand1 + operand2;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return operand1 != null ? operand1 :( operand2 != null ? operand2 : 0.0);
        }
    }

    public Double subtract(Double operand1, Double operand2) {
        try {
            if (operand1 == null) throw new IllegalArgumentException("Value 1 is null");
            if (operand2 == null) throw new IllegalArgumentException("Value 2 is null");
            return operand1 - operand2;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return operand1 != null ? operand1 : 0.0;
        }
    }

    public Double multiply(Double operand1, Double operand2) {
        try {
            if (operand1 == null) throw new IllegalArgumentException("Value 1 is null");
            if (operand2 == null) throw new IllegalArgumentException("Value 2 is null");
            if (operand2 == 0f) throw new ArithmeticException("Cannot multiply by zero");
            return operand1 * operand2;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return operand1;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return operand1 != null ? operand1 : 0.0;
        }
    }

    public Double divide(Double operand1, Double operand2) {
        try {
            if (operand1 == null) throw new IllegalArgumentException("Value 1 is null");
            if (operand2 == null) throw new IllegalArgumentException("Value 2 is null");
            if (operand2 == 0f) throw new ArithmeticException("Cannot divide by zero");
            return operand1 / operand2;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return operand1;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return operand1 != null ? operand1 : 0.0;
        }
    }
}
