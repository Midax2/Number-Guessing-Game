package NumberGuesser.Game.CustomGameExceptions;

public class InvalidGuess extends RuntimeException {
    public InvalidGuess(String message) {
        super(message);
    }
}
