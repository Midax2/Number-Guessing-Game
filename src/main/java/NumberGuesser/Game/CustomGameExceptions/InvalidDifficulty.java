package NumberGuesser.Game.CustomGameExceptions;

public class InvalidDifficulty extends RuntimeException {
    public InvalidDifficulty(String message) {
        super(message);
    }
}
