package examples_reading_1_3;

public class PowersOfTwo {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as an int.");
        }

        int n = Integer.parseInt(args[0]);
        int power = 1;
        int i = 0;
        while (i <= n) {
            System.out.println(String.format("%d %d", i, power));
            power *= 2;
            i++;
        }
    }
}
