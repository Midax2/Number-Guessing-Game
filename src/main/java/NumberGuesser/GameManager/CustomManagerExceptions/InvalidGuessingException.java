package NumberGuesser.GameManager.CustomManagerExceptions;

public class InvalidGuessingException extends RuntimeException {
    public InvalidGuessingException(String message) {
        super(message);
    }
}
