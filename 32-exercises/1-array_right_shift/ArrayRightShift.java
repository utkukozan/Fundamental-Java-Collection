import java.util.Scanner;

public class ArrayRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, temp, last, j;

        // Prompt the user to enter the number of elements
        System.out.println("Enter the number of elements: ");
        int count = input.nextInt();
        int[] arr = new int[count];

        // Prompt the user to enter the elements
        System.out.println("Enter " + count + " elements: ");
        for (i = 0; i < count; i++)
            arr[i] = input.nextInt();

        // Prompt the user to enter the number of shifts
        System.out.println("Enter the number of shifts to the right: ");
        int shift = input.nextInt();

        // Perform right shifts
        for (i = 0; i < shift; i++) {
            last = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        // Display the new array
        System.out.println("New array arrangement: ");
        for (i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
