# Number Guessing Game (Java)

## 🎯 Overview
Welcome to the **Number Guessing Game**! This is a simple command-line game where the computer randomly selects a number, and the user has to guess it. The user will have a limited number of attempts based on the chosen difficulty level.

If the user guesses correctly, they win! Otherwise, they will receive hints until they either guess the number or run out of chances.

## 🕹️ How to Play
1. When the game starts, it will display a welcome message and explain the rules.
2. The computer randomly selects a number between **1 and 100**.
3. The user selects a **difficulty level**:
    - **Easy** (10 chances)
    - **Medium** (5 chances)
    - **Hard** (3 chances)
4. The user enters their guess.
5. The game provides feedback:
    - "Too high!" if the guess is greater than the selected number.
    - "Too low!" if the guess is less than the selected number.
    - "Congratulations!" if the guess is correct, along with the number of attempts.
6. The game ends when the user guesses the correct number or runs out of chances.

## 📝 Sample Output
```
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)
Enter your choice: 2

Great! You have selected the Medium difficulty level. Let's start the game!
Enter your guess: 50
Incorrect! The number is less than 50.
Enter your guess: 25
Incorrect! The number is greater than 25.
Enter your guess: 35
Incorrect! The number is less than 35.
Enter your guess: 30
Congratulations! You guessed the correct number in 4 attempts.
```

## 🚀 Additional Features (Enhancements)
- **Multiple Rounds**: Allow users to play again after each round.
- **Timer**: Track how long it takes for the user to guess the number.
- **Hint System**: Provide hints when the user is stuck.
- **High Score Tracking**: Record the fewest attempts for each difficulty level.

## 🛠️ Installation & Running the Game
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/number-guessing-game.git
   ```
2. Navigate to the project folder:
   ```bash
   cd number-guessing-game
   ```
3. Compile the Java file:
   ```bash
   javac NumberGuessingGame.java
   ```
4. Run the game:
   ```bash
   java NumberGuessingGame
   ```

## 📌 Project Page

Check out the page of this project here: 
<a href=https://roadmap.sh/projects/number-guessing-game>Number Guessing Game Roadmap</a>

## 📜 License
This project is open-source and available under the **MIT License**.

## 🤝 Contributing
Contributions are welcome! Feel free to fork the repo, make changes, and submit a pull request.


