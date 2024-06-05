import java.util.Scanner;

public class PyramidPattern {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for(int i = 0; i <= number - 1; i++) {

            int pow = 1;
            for(int j = 1; j <= number * 2 - 1; j++) { // Will iterate 2n-1 times each time.

                if(j >= number - i && j <= number + i) { // If within this range, print number, else print space.

                    System.out.printf("%6d", pow); // Using printf to format the spaces.

                    if(j <= number - 1) // Multiply by 4 until the middle number, then divide by 4.
                        pow *= 4;
                    else
                        pow /= 4;
                } else {
                    System.out.printf("%6s", ""); // Print spaces if not in range.
                }
            }
            System.out.println();
        }
    }
}
