package NumberGuesser.ScoreBoard;

import NumberGuesser.Game.Difficulty;

import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {
    Map<Difficulty, Integer> scores;

    public ScoreBoard() {
        scores = new HashMap<>();
    }

    public void AddScore(int score, Difficulty difficulty) {
        if (!CheckIfBetterScore(score, difficulty)) return;
        scores.put(difficulty, score);
    }

    public void PrintScores() {
        System.out.println("Score board:");
        for (Difficulty difficulty : Difficulty.values()) {
            System.out.println(difficulty + ": " + scores.get(difficulty));
        }
    }

    private boolean CheckIfBetterScore(int score, Difficulty difficulty) {
        if (scores.get(difficulty) == null) return true;
        return score < scores.get(difficulty);
    }
}
