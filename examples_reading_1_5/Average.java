package examples_reading_1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int n = 0;

        while (!StdIn.isEmpty()) {
            sum += StdIn.readDouble();
            n++;
        }

        StdOut.printf("Average is %.4f\n", sum / n);
    }
}
