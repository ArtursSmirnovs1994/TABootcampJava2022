package sef.module7.activity;
//Needs to be completed
//1 - extend this class from Exception class
public class CustomExceptionActivity extends Exception{
    private static String name;
	//2 - Override getMessage() and provide the following message 
	// "You are not allowed to use this program"

    CustomExceptionActivity (String name){
        this.name=name;}

    @Override
    public String getMessage() {
        return "You are not allowed to use this program: " + name;
    }
}
