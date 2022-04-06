package sef.FinalActivitySecondActivity;

public class Calculatorfinal {

    public int addition(int a, int b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }

    public double multiply(double a, double b) {

           try {
                double result = a * b;
               System.out.println("The result is :" + result);
            } catch (ArithmeticException Calculatorfinal) {
                System.out.println("Multiply by zero iz 0");

            } finally {

                return a * b;
            }
        }

        public double division ( double a, double b){
            try {
                double result = a / b;
                System.out.println("The result is :" + result);

            } catch (ArithmeticException Calculatorfinal) {
                System.out.println("No posible to devide by 0");

            } finally {

                return a / b;
            }
        }
    }


