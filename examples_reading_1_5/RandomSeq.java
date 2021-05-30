package examples_reading_1_5;

public class RandomSeq {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as an int.");
        }

        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            System.out.println(Math.random());
        }
    }
}
