import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 0 and 100
        int randomNumber = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        int guess = 0;

        // Continuously prompt the user to guess the number until they guess correctly
        while (true) {
            // Prompt the user to enter their guess
            System.out.println("Enter your guess: ");
            guess = input.nextInt();

            // Check if the guess is within the valid range (0-100)
            if (guess >= 0 && guess <= 100) {
                // Check if the guess is correct
                if (guess == randomNumber) {
                    System.out.println("Correct guess!");
                    break; // Exit the loop if the guess is correct
                } else if (guess > randomNumber) {
                    System.out.println("Guess lower.");
                } else {
                    System.out.println("Guess higher.");
                }
            } else {
                System.out.println("Guess must be between 0 and 100!");
            }
        }
    }
}
