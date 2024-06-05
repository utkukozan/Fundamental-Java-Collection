import java.util.Scanner;

public class FramedTriangle {
    public static void main(String args[]) {
        System.out.println("How many lines?");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int i, j, k, n = 1;

        // Print the upper part of the framed triangle
        for (i = 0; i < num; i++) {
            // Print spaces
            for (j = 0; j < num - 1 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            // Print stars
            for (k = 0; k < n; k++) {
                System.out.print("*");
            }
            System.out.print("\\");
            n += 2;
            System.out.print("\n");
        }
        
        // Print the horizontal line at the bottom of the framed triangle
        for (i = 0; i < n; i++) {
            System.out.print("-");
        }
    }
}
