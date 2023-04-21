package ch8.ex8.exceptions;

public class BaseIllegalArgumentException extends Exception {
    public BaseIllegalArgumentException(String errorMessage) {
        super("DataIncrement Exception: " + errorMessage);
    }
}
