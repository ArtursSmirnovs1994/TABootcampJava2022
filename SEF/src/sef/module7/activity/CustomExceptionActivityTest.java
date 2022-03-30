package sef.module7.activity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import java.nio.file.attribute.UserPrincipal;

public class CustomExceptionActivityTest {

    public static void main(String[] args) throws CustomExceptionActivity {
        validateUser("Mike");
        validateUser("Stacie");
        validateUser("Yana");
    }
    //1 - Type main method and call validateUser() from it.
    //Call this method with different names to test it


    static void validateUser(String name) throws CustomExceptionActivity {
        //array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
//flag stores 1 if a match is found else it should remain 0

        int flag = 0;
        for (int i = 0; i < 4; i++)

            // 2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly

            if (name.equals(validUsers[i])) {
                flag = 1;
            }
        {
            //3 - check if flag is zero, throw CustomExceptionActivity Exception.
//You may also have to declare this exception in the method call using throws.
            if (flag == 0) {
                throw new CustomExceptionActivity();
            }
            System.out.println("Welcome to Payroll program");
        }

//4 - else if flag is one, print a message "Welcome to Payroll program".

    }
}
