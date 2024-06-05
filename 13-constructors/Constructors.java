public class Constructors {
    public static void main(String[] args) {
        ObjectName myObj = new ObjectName();
        System.out.println(myObj.x);
        ObjectName myObj2 = new ObjectName(2); // Constructor can take parameters.
        System.out.println(myObj2.x);
    }
}