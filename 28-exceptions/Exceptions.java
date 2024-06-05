public class Exceptions {
    public static void main(String[] args) {
        // In Java, different errors can occur while writing code.
        // To handle and define the error, try-catch blocks are used.
        // try is the block where the code is executed.
        // catch is the block that catches and defines the error.
        // finally is used to write the code that will continue after the block.
        
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // error!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred.");
        } finally {
            System.out.println("This code block will execute.");
        }
    
        // If desired, an error message can be given using the throw keyword.
        int age = 10;
        if (age < 18) {
            throw new ArithmeticException("Access Denied");
        }
    }
}
