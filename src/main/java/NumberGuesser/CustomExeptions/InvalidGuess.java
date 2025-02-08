package NumberGuesser.CustomExeptions;

public class InvalidGuess extends RuntimeException {
    public InvalidGuess(String message) {
        super(message);
    }
}
