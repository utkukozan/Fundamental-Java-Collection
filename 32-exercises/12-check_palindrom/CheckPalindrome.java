import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        // Example Output: "madam" -> palindrome
        // Example Output: "utku" -> not palindrome
        
        String input, reverse = "";
        System.out.println("Enter a word:");
        input = new Scanner(System.in).nextLine();
        
        int length = input.length();
        
        // Reverse the input string
        for (int i = 0; i < length; i++) {
            reverse += input.charAt(length - 1 - i);
        }
        
        // Check if the reversed string equals the original string
        if (input.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
