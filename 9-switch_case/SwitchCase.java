public class SwitchCase {
    public static void main(String[] args) {
        // Switch statements are conditional statements. The difference from if-else is that it can handle multiple conditions.
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // Similar to else, this condition is executed if none of the conditions above are met.
                System.out.println("Error");
                break;
        }
        // Outputs "Thursday" (day 4)
    }
}
