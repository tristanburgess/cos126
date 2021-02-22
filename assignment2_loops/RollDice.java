package assignment2_loops;

public class RollDice {
    static final int NUM_DIE = 10;
    static final int NUM_SIDES = 6;
    static final int NUM_TOTALS = 51;
    static final int TOTAL_OFFSET = 10;

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as a positive int.");
        }

        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            throw new IllegalArgumentException("Expected input arg to be a positive int.");
        }

        int[] totals = new int[NUM_TOTALS];
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < NUM_DIE; j++) {
                total += (int) (Math.random() * NUM_SIDES) + 1;
            }
            totals[total - TOTAL_OFFSET]++;
        }

        for (int i = 0; i < NUM_TOTALS; i++) {
            System.out.printf("%d: ", i + TOTAL_OFFSET);
            for (int j = 0; j < totals[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
