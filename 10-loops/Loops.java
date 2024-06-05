public class Loops {
    public static void main(String[] args) {
        // Loops can be done with the while statement.
        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
            // The loop will exit when i becomes 5.
        }

        // Loops can also be done with the do-while statement. The difference from while is that it executes the loop first and then checks the condition.
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        // Loops can be done with the for statement. The difference from other statements is that it can combine the condition and increment in a single statement.
        for (int a = 3; a < 6; a++) {
            System.out.println("a = " + a);
        }

        // Loops can be done with the foreach statement. This requires a list or an array.
        String[] cars = {"Volvo", "BMW", "Mercedes", "Audi", "Volkswagen"};
        for (String car : cars) {
            System.out.println(car);
        }

        // To stop a loop, you can use the break statement.
        int x = 1;
        while (x < 3) {
            System.out.println(x);
            x++;
            break; // This statement will exit the loop. The condition being true will not change this.
        }
        System.out.println("Loop exited!");

        // To skip an iteration of a loop, you can use the continue statement.
        int y = 1;
        while (y < 3) {
            System.out.println(y);
            y++;
            continue; // This statement will skip the current iteration of the loop. The condition being true will not change this.
            // System.out.println("This will not be printed because the loop is skipped here due to the continue statement.");
        }
    }
}
