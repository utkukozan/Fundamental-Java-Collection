public class Interface {
    public static void main(String[] args) {
        // An interface is a completely abstract class that contains methods.
        // It is created by adding the keyword "interface" before the class name.
        // The methods inside an interface are not implemented with a block of code, they only consist of their signatures.
        // To use the methods inside an interface, another class must inherit from it.
        // However, instead of using "extends", we use "implements" in this case.
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        // Just like abstract classes, objects cannot be created from interfaces.
        // A class that implements an interface must override all the methods in the interface without a block of code.
        // Additionally, a class can implement multiple interfaces by separating them with commas.
    }
}

interface Animal {
    public void animalSound();
    public void sleep();
}

interface SecondInterface {
    public void secondInterfacesMethod();
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog implements Animal, SecondInterface {
    public void animalSound() {
        System.out.println("The dog says: woof woof");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
    public void secondInterfacesMethod() {
        System.out.println("Second Interface was implemented");
    }
}
