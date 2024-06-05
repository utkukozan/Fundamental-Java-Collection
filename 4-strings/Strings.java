public class Strings {
    public static void main(String[] args) {
        // Strings are used to store text.
        /* String Declaration */
        String str = "Hello";
        /* Print String */
        System.out.println(str);
        /* Find Length using length() */
        System.out.println(str.length());
        /* Convert to Upper or Lower Case using toUpperCase(), toLowerCase() */
        System.out.println(str.toUpperCase());
        /* Find the index of a character in a string using indexOf() */
        String sentence = "Hello, my name is Utku";
        System.out.println(sentence.indexOf("U"));
        /* String Concatenation using + operator */
        System.out.println(str + " " + sentence);
        /* String Concatenation using concat() */
        System.out.println(str.concat(sentence));
        /* Adding numbers with Strings */
        String x = "30";
        String y = "40";
        System.out.println(x + y); //3040
        System.out.println(Integer.parseInt(x) + Integer.parseInt(y)); //70
    }
}
