public class Variables {
    public static void main(String[] args) {
        long number0 = 43; // long value, stores all WHOLE numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Uses 8 bytes.
        int number = 10; // integer value, stores all WHOLE numbers from -2,147,483,648 to 2,147,483,647. Uses 4 bytes.
        short number2 = 5; // short value, stores all WHOLE numbers from -32,768 to 32,767. Uses 2 bytes.
        byte number3 = 4; // byte value, stores all WHOLE numbers from -128 to 127. Uses 1 byte.
        String name = "Utku"; // Stores text. Uses double quotes.
        float decimal1 = 4.5f; // Stores decimal numbers. Sufficient for storing 6 to 7 decimal digits. Uses 4 bytes. 
        double decimal2 = 8.9; // Stores decimal numbers. Sufficient for storing 15 decimal digits. Uses 8 bytes.
        char ch = 'a'; // Stores a single character/letter or ASCII values. Uses single quotes. Uses 2 bytes.
        boolean trueFalse = true; // Stores true or false value. Uses 1 byte.

        // Printing variable values:
        System.out.println("number0 = " + number0);
        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);
        System.out.println("number3 = " + number3);
        System.out.println("name = " + name);
        System.out.println("decimal1 = " + decimal1);
        System.out.println("decimal2 = " + decimal2);
        System.out.println("ch = " + ch);
        System.out.println("trueFalse = " + trueFalse);
        // Or:
        System.out.println(number3);

        // final: This keyword makes the variable constant. If it's changed again, it gives an error.
        final int num = 3;
        System.out.println(num);
        /* This code will give an error:
        num = 4;
        */

        // Declaring multiple variables of the same type in one line:
        int x = 5, y = 6, z = 50;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        // Scientific notations: Done with 'e'.
        float f1 = 35e3f; // 35000.0
        double d1 = 12E4d; // 120000.0
        System.out.println(f1);
        System.out.println(d1);

        // Casting variables to another type
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("Widening Casting (int to double): " + myDouble);

        // Narrowing Casting
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println("Narrowing Casting (double to int): " + myInt2);
    }
}
