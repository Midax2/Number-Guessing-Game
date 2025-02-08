package NumberGuesser.Game;

import NumberGuesser.Game.CustomGameExceptions.InvalidDifficulty;
import NumberGuesser.Game.CustomGameExceptions.InvalidGuess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Difficulty difficulty;
    private int numberToGuess;
    private final Scanner scanner;
    private final Random random;
    private final int minRandomBound = 1;
    private final int maxRandomBound = 100;

    public Game() {
        random = new Random();
        Reset();
        scanner = new Scanner(System.in);
    }

    public void Start() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have "
                + this.difficulty.getNumberOfChances()
                + " chances to guess the correct number.");

    }

    public void Reset() {
        difficulty = Difficulty.MEDIUM;
        numberToGuess = random.nextInt((maxRandomBound - minRandomBound) + 1) + minRandomBound;
    }

    public void SelectDifficulty() {
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Normal (5 chances)");
        System.out.println("3. Hard (3 chances)");

        System.out.print("Enter your choice:");
        try {
            int chosenDifficulty = scanner.nextInt();
            this.difficulty = switch(chosenDifficulty) {
                case 1 -> Difficulty.EASY;
                case 2 -> Difficulty.MEDIUM;
                case 3 -> Difficulty.HARD;
                default -> throw new InvalidDifficulty("Invalid difficulty");
            };
            System.out.println("Great! You have selected the " + this.difficulty.getName() + " difficulty level.");
            System.out.println("Let's start the game!");
        } catch (Exception e) {
            System.out.println("You entered an invalid number. Reason: " + e.getMessage());
        }
    }

    public boolean IsGuess() {
        System.out.print("Enter your guess: ");
        int guess = 0;
        try {
            guess = scanner.nextInt();
            if (guess < minRandomBound || guess > maxRandomBound) {
                throw new InvalidGuess("Invalid guess number. Number should be between "
                        + minRandomBound + " and " + maxRandomBound);
            }
        } catch (Exception e) {
            System.out.println("You entered an invalid number. Reason: " + e.getMessage());
        }
        if (guess < numberToGuess) {
            System.out.println("Incorrect! The number is greater than " + guess + ".");
            return false;
        } else if (guess > numberToGuess) {
            System.out.println("Incorrect! The number is less than " + guess + ".");
            return false;
        } else {
            return true;
        }
    }

    public void Hint() {
        int minHintBound = Math.max(numberToGuess - 15, 0);
        int maxHintBound = Math.min(numberToGuess + 15, 100);
        System.out.println("Your number is around " + minHintBound + " to " + maxHintBound + ".");
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
}
