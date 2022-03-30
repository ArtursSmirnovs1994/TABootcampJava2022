package sef.module7.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {

    //TODO: 1 - Type main method
    //TODO: 2  Create an instance of ArithmeticExceptionActivity and call catchMe with 10 and 0
    //TODO: 5- try to call catchMe with 10 and 2 now and see which messages get printed.

    public static void main(String arg[]) {

        ArithmeticExceptionActivity activity = new ArithmeticExceptionActivity();
        activity.catchMe(10, 0);
        activity.catchMe(10, 2);
    }
    void catchMe(int num1, int num2) {

        //TODO: 3 - Identify the exception and write code to handle this exception.
        //TODO: 4 - After handling the exception, write a finally block which
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException arithmeticException);
        System.out.println("Some arithmetic exception happened");
        } finally {
        System.out.println("Thank you for using this program.");

        //prints a message "Thank you for using this program."
    }

}
