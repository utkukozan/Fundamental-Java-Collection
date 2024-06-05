import java.util.HashMap;

public class HashMapUsage {
    public static void main(String[] args) {
        // HashMap class is accessed by importing the java.util.HashMap library.
        // HashMap is a collection that stores data in key-value pairs.
        // It stores data in key-value pairs. The data types for key and value do not have to be the same.
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        // Adding elements to the HashMap
        // The put() method is used to add elements to the HashMap.
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        
        System.out.println(capitalCities);
        
        // Accessing data using the key
        System.out.println(capitalCities.get("England"));
        
        // Removing data using the key
        capitalCities.remove("England");
        
        // Getting the size of the HashMap
        System.out.println(capitalCities.size());
        
        // Clearing all the data in the HashMap
        capitalCities.clear();
    }
}
