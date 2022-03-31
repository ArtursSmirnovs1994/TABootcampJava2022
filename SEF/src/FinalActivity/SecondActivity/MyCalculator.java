package FinalActivity.SecondActivity;

public class MyCalculator implements Calculator {
    public MyCalculator() {
        int x = 1;
        int y = 1;
    }

    public  int add(int x, int y) {
        return x+y;
    }

    public  int subtract(int x, int y) {
        return x-y;
    }

    public  int multiply(int x, int y) {
        try {
           if(x==0 || y==0){
               throw new Exception("One of arguments is zero");
           }
           return x*y;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public  int divide(int x, int y) {
        try {
            return x/y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        calculator.multiply(4,0);
    }
}
