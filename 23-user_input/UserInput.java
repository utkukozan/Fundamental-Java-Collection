import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // To read input from the user, we use the Scanner class.
        // First, we create an object of the Scanner class.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their username.
        System.out.println("Please enter your username: ");
        
        // Read the input entered by the user and store it in a variable.
        String userName = scanner.nextLine();
        
        // Display the entered username to the user.
        System.out.println("Your username is: " + userName);
        
        // Remember to close the Scanner object to release resources.
        scanner.close();
    }
}
