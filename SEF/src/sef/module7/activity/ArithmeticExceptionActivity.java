package sef.module7.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {
    //TODO: 1 - Type main method
    public static void main(String[] args) {
//        ArithmeticExceptionActivity activity = new ArithmeticExceptionActivity();// ja catchMe() nav static, tad jāveido objekts
//        activity.catchMe(10, 0);
//        activity.catchMe(10, 2);
        catchMe(10, 0);
        catchMe(10, 2);
    }
        //TODO: 2  Create an instance of ArithmeticExceptionActivity and call catchMe with 10 and 0
         static void catchMe ( int num1, int num2){
            //The following code results in an Exception.
            //TODO: 3 - Identify the exception and write code to handle this exception.
            try {
                int result = num1 / num2;
                System.out.println("The result is :" + result);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("This is arithmetic exception");
            } finally {
                System.out.println("Thank you for using this program.");
            }

            //TODO: 4 - After handling the exception, write a finally block which
            //prints a message "Thank you for using this program."
            //TODO: 5- try to call catchMe with 10 and 2 now and see which messages get printed.

        }
    }

