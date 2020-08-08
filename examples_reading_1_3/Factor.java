package examples_reading_1_3;

public class Factor {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as a long.");
        }

        long n = Long.parseLong(args[0]);
        for (long factor = 2; factor < n / factor; factor++) {
            while (n % factor == 0) {
                n /= factor;
                System.out.print(factor + " ");
            }
        }

        if (n > 1) {
            System.out.print(n);
        }
        
        System.out.println();
    }
}
