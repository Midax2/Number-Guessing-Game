package NumberGuesser.CustomExeptions;

public class InvalidDifficulty extends RuntimeException {
    public InvalidDifficulty(String message) {
        super(message);
    }
}
