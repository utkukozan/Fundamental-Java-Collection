import java.util.Scanner;

public class ReverseTrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("From which number should we start?");
        int number, i, j, k;
        number = input.nextInt();
        
        for (i = number; i >= 1; i--) {
            // Print numbers in descending order
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Print numbers in ascending order
            for (k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}
