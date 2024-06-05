public class Encapsulation {
    public static void main(String[] args) {
        // Encapsulation: Hiding sensitive data from the user.
        // To hide data, classes and attributes should be defined as private.
        // Then, public get and set methods can be used to access the private values.
        // For example, let's create an object of the Person class and access its private values.

        Person myObj = new Person();
        
        // Set values using setter methods
        myObj.setName("Utku");
        myObj.setAge(24);

        // Get values using getter methods
        System.out.println("Name: " + myObj.getName());
        System.out.println("Age: " + myObj.getAge());
    }
}

class Person {
    // The name and age variables are defined as private. Another class cannot directly access them.
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // Ensure the age is positive
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
}

// Benefits of Encapsulation:
// Better control over attributes and methods.
// Attributes can be made read-only (immutable) if desired, or vice versa.
// Flexibility: The programmer can change a part of the program without affecting other parts.
// Ensures security.
