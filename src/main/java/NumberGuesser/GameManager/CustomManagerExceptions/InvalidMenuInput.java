package NumberGuesser.GameManager.CustomManagerExceptions;

public class InvalidMenuInput extends RuntimeException {
    public InvalidMenuInput(String message) {
        super(message);
    }
}
