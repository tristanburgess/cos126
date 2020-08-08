package examples_reading_1_3;

public class Gambler {
    public static void main(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "Expected exactly three input arg parseable as a ints.");
        }

        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);

        int bets = 0;
        int wins = 0;

        for (int i = 0; i < trials; i++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) {
                    cash++;
                }
                else {
                    cash--;
                }
            }
            if (cash == goal) {
                wins++;
            }
        }

        System.out.println(wins + " wins");
        System.out.println(trials + " trials");
        System.out.println(100.0 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);
    }
}
