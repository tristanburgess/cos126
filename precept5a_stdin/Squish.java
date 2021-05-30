package precept5a_stdin;

/* *****************************************************************************
 *  Name:
 *  NetID:
 *  Precept:
 *
 *  Description:  Write a program Squish that reads in a sequence of integers
 *                from standard input and prints out the integers, but removing
 *                repeated values that appear consecutively. For example,
 *                if the input is
 *                    1 2 2 1 5 1 1 7 7 7 7 1 1 1 1 1 1 1 1 1
 *                your program prints
 *                    1 2 1 5 1 7 1
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Squish {
    public static void main(String[] args) {
        int lastSeen = StdIn.readInt();
        StdOut.print(lastSeen);

        while (!StdIn.isEmpty()) {
            int val = StdIn.readInt();
            if (val != lastSeen) {
                lastSeen = val;
                StdOut.printf(" %d", val);
            }
        }

        StdOut.println();
    }
}
