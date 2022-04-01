package sef.finalActivity.firstActivity;

public class CustomExceptionFirst extends Exception{

    public String getMessage() {
        return "It is not possible to set a name with numbers";
    }
}
