package NumberGuesser;

public enum Difficulty {
    EASY(10, "Easy"), MEDIUM(5, "Medium"), HARD(3, "Hard");

    private final int numberOfChances;
    private final String name;
    Difficulty(int numberOfChances, String name) {
        this.numberOfChances = numberOfChances;
        this.name = name;
    }

    public int getNumberOfChances() {
        return this.numberOfChances;
    }

    public String getName() {
        return this.name;
    }
}
