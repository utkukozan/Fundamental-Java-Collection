import java.util.Scanner;

public class PrimeFactors {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        
        int divisor = 2; // Smallest prime number
        int dividend = number;
        
        System.out.println("Prime factors: ");
        while (divisor <= number) { // changed condition to include 'number'
            if (dividend % divisor == 0) {
                System.out.printf("%2d ", divisor); // Using printf for formatting with spaces
                dividend /= divisor;
            } else {
                divisor++;
            }
        }
        // Check if the input number is prime
        System.out.print(number == dividend ? "Enter a prime number" : "");
    }
}
