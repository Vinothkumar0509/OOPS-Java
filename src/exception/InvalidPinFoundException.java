package exception;

public class InvalidPinFoundException extends RuntimeException {

    public InvalidPinFoundException(String message) {
        super(message);
    }
}
