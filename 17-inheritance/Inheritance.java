public class Inheritance {
    public static void main(String[] args) {
        // In Java, we can transfer the properties and attributes of one class to another class through inheritance.
        // Subclass (Child): It is a class that is created through inheritance.
        // Superclass (Parent): It is the main class.
        // To inherit a class, we use the keyword "extends".

        // Creating objects of Dog and Cat classes and demonstrating inheritance
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.eat(); // From Animal class
        myDog.bark(); // Dog-specific method

        myCat.eat(); // From Animal class
        myCat.meow(); // Cat-specific method
    }
}

class Animal  { // Superclass
    // General method applicable to all animals
    public void eat() {
        System.out.println("This animal eats food.");
    }
    protected String color = "White"; // Protected variable
    // IMPORTANT NOTE: If the modifier is set to "private", it will not be accessible. But if we use "protected" for safety, it can be accessed.

}

class Dog extends Animal { // Subclass
    // Dog-specific method
    public void bark() {
        System.out.println("The dog barks.");
    }

    @Override
    public void eat() { // Overriding the eat method
        System.out.println("The dog eats bones.");
    }
}

class Cat extends Animal { // Another subclass
    // Cat-specific method
    public void meow() {
        System.out.println("The cat meows.");
    }
    
    @Override
    public void eat() { // Overriding the eat method
        System.out.println("The cat eats fish.");
    }
}

