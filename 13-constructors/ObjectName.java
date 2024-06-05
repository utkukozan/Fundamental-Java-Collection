class ObjectName {
    int x; // Attribute

    // Constructor: It is a special method that is automatically called when an object is created.
    // The method name should be the same as the class name. This method does not have a return type specifier (void, int, etc.).
    public ObjectName() { // Constructor without parameters
        x = 10;
    }

    public ObjectName(int a) { // Constructor with parameters
        x = a;
    }
}
