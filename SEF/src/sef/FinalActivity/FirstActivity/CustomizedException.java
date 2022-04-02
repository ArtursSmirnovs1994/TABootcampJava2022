package sef.FinalActivity.FirstActivity;

public class CustomizedException extends Exception{
    public String getMessage(){
        return "Name can contain only letters";
    }
}
