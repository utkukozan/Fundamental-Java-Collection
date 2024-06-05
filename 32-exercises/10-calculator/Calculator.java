import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double result = 0.0;
        double a, b;
        boolean power = true;

        while (power) {
            // Display the menu
            System.out.println("_____________________________________");
            System.out.println("Which operation would you like to perform? ");
            System.out.println("Addition '1' ");
            System.out.println("Subtraction '2' ");
            System.out.println("Multiplication '3' ");
            System.out.println("Division '4' ");
            System.out.println("Modulus '5' ");
            System.out.println("GCD '6' ");
            System.out.println("LCM '7' ");
            System.out.println("Exit '8' ");
            System.out.println("_____________________________________");
            Scanner input = new Scanner(System.in);
            int operator = input.nextInt();
            switch (operator) {
                case 1:
                    System.out.println("First number: ");
                    a = input.nextDouble();
                    System.out.println("Second number: ");
                    b = input.nextDouble();
                    result = addition(a, b);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.println("First number: ");
                    a = input.nextDouble();
                    System.out.println("Second number: ");
                    b = input.nextDouble();
                    result = subtraction(a, b);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.println("First number: ");
                    a = input.nextDouble();
                    System.out.println("Second number: ");
                    b = input.nextDouble();
                    result = multiplication(a, b);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.println("First number: ");
                    a = input.nextDouble();
                    System.out.println("Second number: ");
                    b = input.nextDouble();
                    result = division(a, b);
                    System.out.println("Result: " + result);
                    break;
                case 5:
                    System.out.println("First number: ");
                    a = input.nextDouble();
                    System.out.println("Second number: ");
                    b = input.nextDouble();
                    result = modulus(a, b);
                    System.out.println("Result: " + result);
                    break;
                case 6:
                    System.out.println("First number: ");
                    a = input.nextDouble();
                    System.out.println("Second number: ");
                    b = input.nextDouble();
                    result = gcd(a, b);
                    System.out.println("Result: " + result);
                    break;
                case 7:
                    System.out.println("First number: ");
                    a = input.nextDouble();
                    System.out.println("Second number: ");
                    b = input.nextDouble();
                    result = lcm(a, b);
                    System.out.println("Result: " + result);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    power = false;
                    break;
            }
        }
    }

    // Addition operation
    static double addition(double a, double b) {
        return a + b;
    }

    // Subtraction operation
    static double subtraction(double a, double b) {
        return a - b;
    }

    // Multiplication operation
    static double multiplication(double a, double b) {
        return a * b;
    }

    // Division operation
    static double division(double a, double b) {
        return a / b;
    }

    // Modulus operation
    static double modulus(double a, double b) {
        return a % b;
    }

    // Greatest Common Divisor (GCD) operation
    static double gcd(double a, double b) {
        int i;
        double min, GCD = 0;
        if (a < b)
            min = a;
        else
            min = b;

        for (i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                GCD = i;
        }
        return GCD;
    }

    // Least Common Multiple (LCM) operation
    static double lcm(double a, double b) {
        double GCD = gcd(a, b);
        double LCM = (a * b) / GCD;
        return LCM;
    }
}
