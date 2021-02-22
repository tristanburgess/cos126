package assignment2_loops;

public class Bits {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as a positive int.");
        }

        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            throw new IllegalArgumentException("Expected input arg to be a positive int.");
        }

        // == 1 + floor(log2(n)) when n > 0
        int bits = 0;
        while (n >= 1) {
            bits++;
            n /= 2;
        }

        System.out.println(bits);
    }
}
