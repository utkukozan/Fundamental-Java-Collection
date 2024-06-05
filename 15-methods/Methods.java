public class Methods {
    static void myMethod(){ // Method without parameters
        System.out.println("A !"); 
    }
    static void myMethodWithParameters(int a, int b){ // Method with parameters
        int sum = a + b;
        System.out.println(sum);
    }
    static int myMethodWithReturn(int a, int b){ // Method that returns an integer
        int sum = a + b;
        return sum;
    }
    // Method overloading : A method can have the same name as another method in the same class.
    static int plusMethod(int x, int y) { //Overloaded method
        return x + y;
    }

    static double plusMethod(double x, double y) { //Overloaded method
        return x + y;
    }
    
    public static void main(String[] args) {
        // A method is a code block and does not run unless it is called. It cannot be written inside the main method!
        myMethod(); // Used to call the method.
        // We can call a method multiple times.
        /* Calling a method with parameters */
        int x = 10;
        int y = 20;
        myMethodWithParameters(x, y);
        /* Calling a method that returns a value */
        int summation = myMethodWithReturn(x, y);
        System.out.println(summation);
        /* A method can be overloaded. As a result, a method with the same name will take different parameters. */
        int myNum1 = plusMethod(3, 5);
        double myNum2 = plusMethod(4.2, 5.2);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
