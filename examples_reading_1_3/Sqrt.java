package examples_reading_1_3;

public class Sqrt {
    private static final double EPSILON = 1.0e-15;

    // NOTE(tristan): uses Newton's method.
    // x_n+1 = x_n - f(x_n) / f'(x_n)
    //       = x_n - (x_n^2 - a) / 2x_n
    //       = x_n - (x_n / 2) + ((a / x_n) / 2)
    //       = (x_n + (a / x_n)) / 2
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as a double.");
        }

        double c = Double.parseDouble(args[0]);
        double t = c;
        while (Math.abs(t - c / t) > EPSILON * t) {
            t = (c / t + t) / 2.0;
        }
        
        System.out.println(t);
    }
}
