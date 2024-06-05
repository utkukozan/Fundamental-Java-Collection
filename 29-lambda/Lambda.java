import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        // Lambdas are similar to methods but they don't have names.
        // They are defined in the form of (parameter 1) (parameter 2) -> {code block}.
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // Creating an ArrayList
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {System.out.println(n);});
        // To store lambdas as a value, we can use the Consumer interface.
        Consumer<Integer> numbers2 = (n) -> {System.out.println(n);}; // This lambda is stored in the numbers2 variable.
        numbers.forEach(numbers2);
    }
}
