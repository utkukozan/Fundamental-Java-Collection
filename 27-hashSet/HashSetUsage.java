import java.util.HashSet;

public class HashSetUsage {
    public static void main(String[] args) {
        // To use HashSet, the java.util.HashSet library must be imported.
        // HashSet is a collection that stores elements in a hash table.
        // The most important feature of the HashSet class is that all elements are unique.
        HashSet<String> cars = new HashSet<String>();
        // Adding elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // This will not be added. It is a duplicate. All elements must be unique in a HashSet.
        System.out.println(cars);
        // Checking if an element exists. Returns true if the item is present, false otherwise.
        System.out.println(cars.contains("Volvo"));
        // Removing an element
        cars.remove("Ford");
        // Getting the size
        System.out.println(cars.size());
        // Clearing all elements
        cars.clear();
    }
}
