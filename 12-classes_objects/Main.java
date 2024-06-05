class Main {
    // This is our main class.
    // We can also create objects from other classes in this class.
    public static void main(String[] args) {
        ObjectName myObj1 = new ObjectName(); // Objects can be created from one class.
        System.out.println(myObj1.x); // Accessing x from the myObj class.
        ObjectName myObj2 = new ObjectName(); // Multiple objects can also be created.
        myObj2.x = 25; // Changing the value of x in the myObj2 object.
        System.out.println(myObj2.x);
    }
}