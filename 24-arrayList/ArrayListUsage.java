import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUsage {
    // ArrayList behaves like an array. The main difference is that it doesn't have a predefined capacity. It can grow dynamically.
    // To create an object from the ArrayList class, you need to import java.util.ArrayList.
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object that stores strings.
        // Adding elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);
        // Accessing an element
        System.out.println(cars.get(1));
        // Modifying an element
        cars.set(2, "Mercedes");
        // Removing an element
        cars.remove(2);
        // Getting the size
        System.out.println(cars.size());
        // Sorting the elements
        // To sort the elements, you need to import java.util.Collections.
        Collections.sort(cars); // Sort in alphabetical order.
        System.out.println(cars);
        // Clearing all elements
        cars.clear();
    }
}
