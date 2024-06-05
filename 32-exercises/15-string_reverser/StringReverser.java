import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        char[] letters = input.nextLine().toCharArray();
        reverseString(letters); // Call the reverseString method
    }
    
    // Method to reverse the input string
    public static void reverseString(char[] letters) {
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
