package exercises_1_2;

import edu.princeton.cs.algs4.StdRandom;

public class Ex_20_TwoDice {
    public static void main(String[] args) {
        int die1 = StdRandom.uniform(1, 7);
        int die2 = StdRandom.uniform(1, 7);

        System.out.println("Two Dice Sum: " + (die1 + die2));
    }
}
