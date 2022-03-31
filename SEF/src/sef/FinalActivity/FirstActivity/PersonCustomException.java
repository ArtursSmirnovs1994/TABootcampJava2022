package sef.FinalActivity.FirstActivity;

public class PersonCustomException extends Exception{
    private static String PersonalMessage;

    PersonCustomException (String PersonalMessage){
        this.PersonalMessage=PersonalMessage;}

    @Override
    public String getMessage() {
        return "Personal exception: " + PersonalMessage;
    }
}
