package exercises_1_3;

public class Ex_5_RollLoadedDie {
    private static int roll() {
        double p = Math.random();
        int die = 0;

        if (p < 1.0 / 8.0) {
            die = 1;
        }
        else if (p < 2.0 / 8.0) {
            die = 2;
        }
        else if (p < 3.0 / 8.0) {
            die = 3;
        }
        else if (p < 4.0 / 8.0) {
            die = 4;
        }
        else if (p < 5.0 / 8.0) {
            die = 5;
        }
        else {
            die = 6;
        }

        return die;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as an int.");
        }

        int trials = Integer.parseInt(args[0]);
        int[] results = new int[6];

        for (int i = 0; i < trials; i++) {
            int roll = roll();
            results[roll - 1]++;
        }

        System.out.printf("Rolling weighted die with %d trials\n", trials);

        for (int i = 0; i < 6; i++) {
            System.out.printf("Got %d rolls of value %d\n", results[i], i + 1);
        }
    }
}
