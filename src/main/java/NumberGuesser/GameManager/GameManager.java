package NumberGuesser.GameManager;

import NumberGuesser.Game.Game;
import NumberGuesser.GameManager.CustomManagerExceptions.InvalidInput;

import java.util.Scanner;

public class GameManager {
    private final Game game;
    private Scanner scanner;

    public GameManager() {
        game = new Game();
        scanner = new Scanner(System.in);
    }

    public void Rum() {
        while (true) {
            MainMenu();

            System.out.print("Enter your choice: ");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        long timeStart = System.currentTimeMillis();
                        game.Start();
                        game.SelectDifficulty();
                        GameProcess();
                        long timeEnd = System.currentTimeMillis();
                        System.out.println("Time taken: " + ((timeEnd - timeStart) / 1000) + "s");
                        break;
                    }
                    case 2: ;
                    case 3: {
                        System.out.println("Thank you for playing!");
                        return;
                    }
                    default: throw new InvalidInput("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
                scanner = new Scanner(System.in);
            }
        }
    }

    private void MainMenu() {
        System.out.println("1. Play");
        System.out.println("2. High score board");
        System.out.println("3. Exit game");
    }

    private void GameProcess() {
        int attempts = 0;
        while (!game.IsGuess()) {
            attempts++;
            if (attempts >= game.getDifficulty().getNumberOfChances()) {
                break;
            }
        }
        if (attempts > game.getDifficulty().getNumberOfChances()) {
            System.out.println("Unfortunately, you lost!");
        } else {
            System.out.println("Congratulations! You guessed the correct number in " + (attempts + 1) + " attempts.");

        }
    }
}
