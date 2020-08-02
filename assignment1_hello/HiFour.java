package assignment1_hello;

public class HiFour {
    public static void main(String[] args) {
        if (args.length != 4) {
            throw new IllegalArgumentException("Expected exactly 4 first names as arguments.");
        }

        System.out.println(
                String.format("Hi %s, %s, %s, and %s.", args[3], args[2], args[1], args[0]));
    }
}
