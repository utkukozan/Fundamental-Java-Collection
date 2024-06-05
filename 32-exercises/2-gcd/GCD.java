import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");
        int num1 = new Scanner(System.in).nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number: ");
        int num2 = new Scanner(System.in).nextInt();
        
        // Find the smaller number
        int smallerNumber = Math.min(num1, num2);
        int gcd = 0;
        
        // Find the greatest common divisor (GCD)
        for (int i = smallerNumber; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }
        
        // Display the greatest common divisor (GCD)
        System.out.println("GCD: " + gcd);
    }
}
