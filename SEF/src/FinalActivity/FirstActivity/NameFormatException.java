package FinalActivity.FirstActivity;

public class NameFormatException extends Exception {
    public String getMessage() {
        return "Name should not contain numbers";
    }
}