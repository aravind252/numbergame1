import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
