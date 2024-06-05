public class Operators {
    public static void main(String[] args) {
        // Addition
        int x = 30 + 4;
        int a = x + 3;
        System.out.println("x: " + x + " a: " + a);
        System.out.println("x + a: " + (x + a));
        
        // Subtraction -
        // Multiplication *
        // Division /
        // Modulus %
        // Increment ++
        // Decrement --
        
        // Increment during declaration
        int number = 4;
        System.out.println("number = 4, number += 5 is");
        System.out.println(number += 5); // First increment the number by 5. Then assign and print it. It will print 9.
        System.out.println("number = 4, number =+ 5 is");
        System.out.println(number =+ 5); // First print the number. Then increment it by 5 and assign it. It will print 9.
    }
}
