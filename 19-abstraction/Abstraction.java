public class Abstraction {
    public static void main(String[] args) {
        // Abstraction: It is the process of hiding important implementation details from the user while providing only the essential features.
        // Abstraction can be achieved by creating abstract classes or interfaces.
        // Animal myPig = new Animal(); // This line will result in an error because objects cannot be created directly from an abstract class.
        Pig myPig = new Pig(); // Object created from the class that inherits the abstract class.
        myPig.animalSound();
        myPig.sleep();
    }
}

// Abstract class: An object cannot be directly instantiated from an abstract class. Instead, another class must extend or inherit from this abstract class to access its features.
abstract class Animal { // Abstract class
    public abstract void animalSound();
    // Abstract method: A method declared without a body. The body of the method is provided by the subclass that implements the abstract method.
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal { // Inherits the abstract class
    public void animalSound() {
        System.out.println("Pig says: wee wee");
    }
}
