package precept5a_stdin;

/* *****************************************************************************
 * Name:
 * NetID:
 * Precept:
 *
 * Description: This program takes a command-line argument n, reads in
 * n integers, and prints out their sum.
 *
 * Compilation:  javac-intocs AddInts.java
 * Execution:    java-introcs AddInts n
 *
 * % java-introcs AddInts 4
 * 3 5
 * 2 1
 * Sum is 11
 *
 * https://introcs.cs.princeton.edu/java/15inout/AddInts.java.html
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class AddInts {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int value = StdIn.readInt();
            sum = sum + value;
        }
        StdOut.println("Sum is " + sum);
    }
}
