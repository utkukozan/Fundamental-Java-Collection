import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int y = scanner.nextInt();
            System.out.println("Please select the operation you want to perform:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Modulo");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    result = x + y;
                    System.out.println(x + " + " + y + " = " + result);
                    break;
                case 2:
                    result = x - y;
                    System.out.println(x + " - " + y + " = " + result);
                    break;
                case 3:
                    result = x * y;
                    System.out.println(x + " * " + y + " = " + result);
                    break;
                case 4:
                    if (y != 0) {
                        result = x / y;
                        System.out.println(x + " / " + y + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    if (y != 0) {
                        result = x % y;
                        System.out.println("Remainder of " + x + " divided by " + y + ": " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation selected.");
                    break;
            }
        } finally {
            scanner.close();
        }
    }
}
