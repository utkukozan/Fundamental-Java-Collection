import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("First to score 3 wins!");

        int computerScore = 0;
        int userScore = 0;

        // Continue the game until either the computer or the user reaches a score of 3
        while (computerScore < 3 && userScore < 3) {
            System.out.println("Rock, Paper, or Scissors?");
            System.out.println("0: Rock, 1: Paper, 2: Scissors");
            int userInput = new Scanner(System.in).nextInt();
            System.out.print("User: ");

            // Convert the user input to Rock, Paper, or Scissors
            switch (userInput) {
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("Paper");
                    break;
                case 2:
                    System.out.println("Scissors");
                    break;
                default:
                    System.out.println("Invalid input. Please enter 0, 1, or 2.");
                    continue;
            }

            System.out.print("Computer: ");
            int computerInput = (int) (Math.random() * 3);

            // Convert the computer's random choice to Rock, Paper, or Scissors
            switch (computerInput) {
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("Paper");
                    break;
                case 2:
                    System.out.println("Scissors");
                    break;
            }

            // Determine the winner and update scores
            if (userInput == computerInput) {
                System.out.println("Draw!");
            } else {
                if ((userInput == 0 && computerInput == 2) || (userInput == 1 && computerInput == 0) || (userInput == 2 && computerInput == 1)) {
                    System.out.println("User wins!");
                    userScore++;
                } else {
                    System.out.println("Computer wins!");
                    computerScore++;
                }
            }

            // Display current scores
            System.out.println("User Score = " + userScore + " Computer Score = " + computerScore);
        }

        // Determine the overall winner of the game
        if (userScore == 3) {
            System.out.println("User wins the game!");
        } else {
            System.out.println("Computer wins the game!");
        }
    }
}
