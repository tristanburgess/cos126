package examples_reading_1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TwentyQuestions {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 1_000_000) + 1;
        StdOut.println("I'm thinking of a number between 1 and 1,000,000");
        int guess = 0;
        while (guess != n) {
            StdOut.print("Enter your guess: ");
            guess = StdIn.readInt();
            if (guess == n) {
                StdOut.println("You win!");
            }
            else if (guess > n) {
                StdOut.println("Too high!");
            }
            else {
                StdOut.println("Too low!");
            }
        }
    }
}
