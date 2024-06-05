import java.util.LinkedList;

public class LinkedListUsage {
    public static void main(String[] args) {
        // To use the LinkedList class, import java.util.LinkedList.
        LinkedList<String> cars = new LinkedList<String>();
        // Adding, modifying, and deleting operations are the same as ArrayList.
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes");

        System.out.println(cars);
        // LinkedList is like an ArrayList, but items are linked to each other.
        // LinkedList is generally used for manipulating data, while ArrayList is used for storage and retrieval.
        // LinkedList is slower than ArrayList for storage and retrieval.
        // LinkedList is faster than ArrayList for adding, modifying, and deleting operations.
        // LinkedList is more memory efficient than ArrayList.
        // LinkedList is not thread-safe.
        // LinkedList is not synchronized.
    }
}
