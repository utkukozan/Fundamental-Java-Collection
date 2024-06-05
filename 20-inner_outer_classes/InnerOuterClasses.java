public class InnerOuterClasses {
    public static void main(String[] args) {
        // Java supports nested classes, which makes the code more efficient and readable.
        // To create an instance of the inner class, first create an object of the outer class, then create an object of the inner class.
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

class OuterClass { // Outer Class
    int x = 10;

    class InnerClass { // Inner Class
        int y = 5;
    }
}
