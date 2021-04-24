package by.jrr.learn.lecture7Methods.exception;

public class CalculateCostException extends RuntimeException {

    public CalculateCostException(String message) {
        super(message);
    }
}
