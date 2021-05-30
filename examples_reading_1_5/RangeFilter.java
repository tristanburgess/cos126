package examples_reading_1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class RangeFilter {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Expected exactly two input args parseable as ints.");
        }

        int lo = Integer.parseInt(args[0]);
        int hi = Integer.parseInt(args[1]);

        if (lo > hi) {
            throw new IllegalArgumentException(
                    String.format("Expected lo to be <= hi, got lo %d, hi %d", lo, hi)
            );
        }

        while (!StdIn.isEmpty()) {
            int val = StdIn.readInt();
            if (val >= lo && val <= hi) {
                StdOut.print(val + " ");
            }
        }

        StdOut.println();
    }
}
