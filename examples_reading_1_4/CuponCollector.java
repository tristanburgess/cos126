package examples_reading_1_4;

public class CuponCollector {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as an int.");
        }

        int n = Integer.parseInt(args[0]);
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distinct = 0;

        while (distinct < n) {
            int r = (int) (Math.random() * n);
            count++;
            if (!isCollected[r]) {
                distinct++;
                isCollected[r] = true;
            }
        }

        System.out.println(count);
    }
}
