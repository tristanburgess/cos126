package precept5a_stdin;

/* *****************************************************************************
 * Name:
 * NetID:
 * Precept:
 *
 * Description: Reads integers from standard input and prints the maximum
 *              and minimum of those values to standard output.  Assume there
 *              is at least one integer.
 *
 * Compilation:  javac-introcs MaxMin.java
 * Execution:    java-introcs MaxMin
 *   -- input required from standard input
 *   -- use Ctrl-d (Mac) or Ctrl-z <enter> (Windows) for EOF
 *
 *  % java-introcs MaxMin
 *  23 45 17 56 32
 *  89 10 53 32 34
 *  16
 *  Ctrl-d / Ctrl-z <enter>
 *  maximum = 89, minimum = 10               (This is book exercise 1.5.1.)
 **************************************************************************** */


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MaxMin {
    public static void main(String[] args) {

        // first value read initializes min and max
        int max = StdIn.readInt();
        int min = max;

        // read in the data, keep track of min and max
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();

            if (value > max) max = value;
            if (value < min) min = value;
        }

        // output
        StdOut.println("max = " + max + "   min = " + min);
    }
}
