package NumberGuesser.GameManager.CustomManagerExceptions;

public class InvalidInput extends RuntimeException {
    public InvalidInput(String message) {
        super(message);
    }
}
