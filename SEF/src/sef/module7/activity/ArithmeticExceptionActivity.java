package sef.module7.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {
    public static void main(String[] args) {
        ArithmeticExceptionActivity aea = new ArithmeticExceptionActivity();
        aea.catchMe(10,0);
        aea.catchMe(10,2);
    }
    void catchMe(int num1, int num2) {
        //The following code results in an Exception.
        try {
            int result = num1 / num2;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.err.println(e);
//            e.printStackTrace();
        } finally {
            System.out.println("Thank you for using this program.\n");
        }

    }
}
