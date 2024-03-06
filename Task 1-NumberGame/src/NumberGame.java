import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain = true;
        int totalAttempts = 0;
        int totalRounds = 0;
        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            while (true) {
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + targetNumber +
                            " in " + attempts + " attempts.");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }
            totalAttempts += attempts;
            totalRounds++;
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }
        System.out.println("\nGame Over! Your total score: " + totalAttempts + " attempts across " + totalRounds + " rounds.");
    }
}