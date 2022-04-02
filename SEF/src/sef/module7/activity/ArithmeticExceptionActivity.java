package sef.module7.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {
    //TODO: 1 - Type main method
    public static void main(String[] args) {
        ArithmeticExceptionActivity aeActivity=new ArithmeticExceptionActivity();
        aeActivity.catchMe(10,0);
    }

    //TODO: 2  Create an instance of ArithmeticExceptionActivity and call catchMe with 10 and 0

    void catchMe(int num1, int num2) {
        //The following code results in an Exception.
        //TODO: 3 - Identify the exception and write code to handle this exception.
        try{
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        }

        catch(ArithmeticException e) {
            System.out.println("You should not divide a number with Zero");
        }

        //TODO: 4 - After handling the exception, write a finally block which
        //prints a message "Thank you for using this program."
        finally {

            System.out.println("Thank you for using this program");
        }
        //TODO: 5- try to call catchMe with 10 and 2 now and see which messages get printed.

    }

}
