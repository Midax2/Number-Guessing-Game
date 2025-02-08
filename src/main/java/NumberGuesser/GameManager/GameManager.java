package NumberGuesser.GameManager;

import NumberGuesser.Game.Game;

import java.util.Scanner;

public class GameManager {
    private Game game;
    private Scanner scanner;
    private long timeStart;
    private long timeEnd;

    GameManager() {
        game = new Game();
        scanner = new Scanner(System.in);
        timeStart = 0;
        timeEnd = 0;
    }

    public void Rum() {

    }

    private void PrintMenu() {
        System.out.println("Welcome to the Number Guessing Game");
    }
}
