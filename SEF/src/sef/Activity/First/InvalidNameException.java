package sef.Activity.First;

public class InvalidNameException extends Exception {

    public String toString() {
        return "Name must contain only letters";
    }

    public String getMessage() {
        return "Name must contain only letters. Please, fix it.";
    }
}
