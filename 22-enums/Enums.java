public class Enums {
    public static void main(String[] args) {
        // An enum is a class that defines a group of constants. These constants are immutable (similar to final).
        // To create an enum, use the keyword "enum".
        // To access enum values, use the dot notation.

        //Usage 1
        Level myVar = Level.HIGH;
        System.out.println(myVar);

        //Usage 2
        System.out.println(Level.LOW);
    }
}

enum Level {
    LOW, MEDIUM, HIGH
}
