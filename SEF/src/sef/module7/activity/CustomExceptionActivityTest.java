package sef.module7.activity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;

public class CustomExceptionActivityTest {

    //1 - Type main method and call validateUser() from it.
    //Call this method with different names to test it
    public static void main(String[] args) throws CustomExceptionActivity {
        try {
            validateUser("Jason");
        } catch (CustomExceptionActivity e) {
            e.printStackTrace();
        }
        try {
            validateUser("Mike");
        } catch (CustomExceptionActivity e) {
            e.printStackTrace();
        }
        try {
            validateUser("Chuck Norris");
        } catch (CustomExceptionActivity e) {
            e.printStackTrace();
        }
        try {
            validateUser("Shanti");
        } catch (CustomExceptionActivity e) {
            e.printStackTrace();
        }
    }

    public static void validateUser(String name) throws CustomExceptionActivity {
        //array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
//flag stores 1 if a match is found else it should remain 0 
        int flag = 0;
//2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
        for (String name0 : validUsers) {
            if (name0.equals(name)) {
                flag = 1;
                break;
            }
        }
//3 - check if flag is zero, throw CustomExceptionActivity Exception.
//You may also have to declare this exception in the method call using throws.
        if (flag == 0) {
            throw new CustomExceptionActivity();
        } else {
            System.out.println("Welcome to Payroll program");
        }

//4 - else if flag is one, print a message "Welcome to Payroll program". 

    }
}
