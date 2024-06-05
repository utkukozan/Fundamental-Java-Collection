import java.util.Scanner;

public class BinaryHexadecimalOctalConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a decimal number: ");
            int decimal = scanner.nextInt();
            System.out.println("Which number system do you want to convert the decimal number to: ");
            System.out.println("1. Binary");
            System.out.println("2. Hexadecimal");
            System.out.println("3. Octal");
            System.out.println("4. Convert to another decimal number");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    String binary = Integer.toBinaryString(decimal);
                    System.out.println("Binary: " + binary);
                    break;
                case 2:
                    String hexadecimal = Integer.toHexString(decimal).toUpperCase();
                    System.out.println("Hexadecimal: " + hexadecimal);
                    break;
                case 3:
                    String octal = Integer.toOctalString(decimal);
                    System.out.println("Octal: " + octal);
                    break;
                case 4:
                    System.out.println("Enter another decimal number: ");
                    int newDecimal = scanner.nextInt();
                    System.out.println("New Decimal: " + newDecimal);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        }
    }
}
