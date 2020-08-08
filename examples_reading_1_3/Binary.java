package examples_reading_1_3;

public class Binary {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as an int.");
        }

        int n = Integer.parseInt(args[0]);

        // NOTE(tristan): find largest power of 2 <= n / 2;
        int power = 1;
        while (power <= n / 2) {
            power *= 2;
        }

        while (power > 0) {
            if (n >= power) {
                System.out.print(1);
                n -= power;
            }
            else {
                System.out.print(0);
            }
            power /= 2;
        }

        System.out.println();
    }
}
