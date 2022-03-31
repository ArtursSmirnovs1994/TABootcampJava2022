package FinalActivity.FirstActivity;

public class AgeFormatException extends Exception {
        public String getMessage() {
        return "Age should be positive";
    }
}