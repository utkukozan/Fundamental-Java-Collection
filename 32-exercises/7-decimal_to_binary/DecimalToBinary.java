import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
        int number;
        int result[] = new int[100];
        System.out.println("Enter a decimal number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        result = DecToBin(number);
        System.out.println("Binary representation of your number: ");
        for(int i = 7; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }
    
    static int[] DecToBin(int number) {
        int remainder[] = new int[100];
        int index = 0;
        if (number == 0) {
            remainder[0] = 0;
            return remainder;
        }
        while (number != 0) {
            remainder[index++] = number % 2;
            number = number / 2;
        }
        return remainder;
    }
}
