import java.util.Scanner;

public class DecimalToHexadecimal {
    public static char[] hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; // Global variable
    
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a decimal number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.println("Hexadecimal representation of your number: " + DecToHex(number));
    }
    
    static String DecToHex(int number) {
        int remainder;
        String result = "";
        while (number > 0) {
            remainder = number % 16;
            result = hex[remainder] + result;
            number = number / 16;
        }
        return result;
    }
}
