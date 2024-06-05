public class IfElse {
    public static void main(String[] args) {
        // If else blocks are used to determine conditions.
        if (20 < 18) { // Returns true. This block will be executed.
            System.out.println("20 is less than 18");
        } else { // If the previous if block is false, this block will be executed.
            System.out.println("20 is greater than 18");
        }
        
        // "Else if" is used if the previous if condition is false.
        int x = 3;
        boolean y = true;
        if (x != 3) {
            System.out.println("x is not equal to 3.");
        } else if (y) {
            System.out.println("y is true.");
        } else {
            System.out.println("x is equal to 3 and y is false.");
        }
        
        /* Shortcut for writing if else blocks */
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening"; // First part is if, second part is else
        System.out.println(result);
    }
}
