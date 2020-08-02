package assignment1_hello;

public class Ordered {
    // WARN(tristan): Assignment restriction - no branch statements except for
    // arg checking!
    public static void main(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "Expected exactly three input arguments to parse as ints.");
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        boolean isOrdered = (x < y && y < z) || (z < y && y < x);
        System.out.print(isOrdered);
    }
}
