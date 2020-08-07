package examples_reading_1_3;

public class HarmonicNumber {
    // NOTE(tristan): Given n, calculates sigma(1, n){ 1/n }, the nth harmonic number.
    // Harmonic numbers are the discrete analog of the logarithm, as in they (over) approximate
    // the area under the curve of ln(x).
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as an int.");
        }

        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
