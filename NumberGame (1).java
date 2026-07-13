import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            int randomNumber = random.nextInt(100) + 1;
            int maxAttempts = 5;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Correct! You guessed the number.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("Too High!");
                }

                System.out.println("Attempts Left: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("You lost!");
                System.out.println("The correct number was: " + randomNumber);
            }

            System.out.println("Current Score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
        }

        System.out.println("Final Score: " + score);
        System.out.println("Thank you for playing!");

        sc.close();
    }
}
