import java.util.Scanner;

public class SentenceContainsWordCheck {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        // Prompt the user to enter the word to search for
        System.out.println("Now enter the word you want to search for: ");
        String word = input.nextLine();

        // Loop through the sentence to check if it contains the word
        for (int i = 0; i <= sentence.length() - word.length(); i++) {
            if (sentence.charAt(i) == word.charAt(0)) {
                flag = true;
                for (int j = 0; j < word.length(); j++) {
                    if (sentence.charAt(i + j) != word.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) // If the word is found, set the flag to true and break the loop
                    break;
            }
        }

        // Display the result based on the flag
        if (flag)
            System.out.println("Contains");
        else
            System.out.println("Does not contain");
    }
}
