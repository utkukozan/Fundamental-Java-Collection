import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        int letterCount, spaceCount, digitCount, specialCount, i;
        letterCount = spaceCount = digitCount = specialCount = 0;
        System.out.println("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        char[] characters = input.nextLine().toCharArray();

        // Iterate through each character in the string
        for (i = 0; i < characters.length; i++) {
            // Check if the character is a letter
            if (Character.isLetter(characters[i])) {
                letterCount++;
            }
            // Check if the character is a digit
            else if (Character.isDigit(characters[i])) {
                digitCount++;
            }
            // Check if the character is a space
            else if (Character.isSpaceChar(characters[i])) {
                spaceCount++;
            }
            // If the character is neither a letter, digit, nor space, it is considered a special character
            else {
                specialCount++;
            }
        }

        // Output the original string and the counts
        System.out.print("The string is: ");
        for (char c : characters) {
            System.out.print(c);
        }
        System.out.println("\nLetter count: " + letterCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Special character count: " + specialCount);
    }
}
