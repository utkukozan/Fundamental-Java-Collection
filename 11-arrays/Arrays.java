public class Arrays {
    public static void main(String[] args) {
        // Used to store multiple values.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // A string array
        int[] numbers = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18}; // An integer array
        
        // Print the whole numbers array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        /* Accessing an element */
        System.out.println(cars[0]); // Volvo
        
        /* Modifying an element */
        cars[3] = "Mercedes";
        System.out.println(cars[3]);
        
        /* Finding the length of an array */
        System.out.println(cars.length); // 4
        
        /* Loop */
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        
        /* Multidimensional Arrays */
        int[][] matrix = {{2, 3, 4, 6}, {4, 5, 3, 6}, {4, 6, 2, 8}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(""); // To move to the next line
        }
    }
}
