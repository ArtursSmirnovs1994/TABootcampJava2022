package sef.module7.activity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class CustomExceptionActivityTest {
    public static void main(String[] args) throws CustomExceptionActivity {
        CustomExceptionActivityTest activityTest = new CustomExceptionActivityTest();
        activityTest.validateUser("Shanti");
        activityTest.validateUser("Mr. Pumpkins");

    }
    //1 - Type main method and call validateUser() from it.
    //Call this method with different names to test it


    private static void validateUser(String name) throws CustomExceptionActivity {

        //array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

//flag stores 1 if a match is found else it should remain 0 
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            if (name == validUsers[i]) { // better with equalsTo(), because this is a String, Strings should be better compared using equals
                flag = 1;
            } else {
                System.out.println("Hello " + name + "!");
            }
            //if this is true - flag number now is 1 so next if doesn't run
//2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly 
            if (flag == 0) {
                throw new CustomExceptionActivity();
            }
            System.out.println("Sth written");
        }
    }
//3 - check if flag is zero, throw CustomExceptionActivity Exception.
//You may also have to declare this exception in the method call using throws.


//4 - else if flag is one, print a message "Welcome to Payroll program". 

}
