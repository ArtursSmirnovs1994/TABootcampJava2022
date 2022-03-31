package sef.FinalActivity.FirstActivity;

public class PersonCustomException extends Exception {
    @Override
    public String getMessage()
    {
        return "Number is not allowed";
    }

}

