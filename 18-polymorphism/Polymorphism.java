public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism is the ability of an inherited class to override and use its own method.
        Animal myAnimal = new Animal(); // Creating an object of the Animal class.
        Animal myPig = new Pig(); // Creating an object of the Pig class.
        Animal myDog = new Dog(); // Creating an object of the Dog class.
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        // As a result, the reusability of the code has increased.
    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: woof woof");
    }
}
