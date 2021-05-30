package precept5a_stdin;

/* *****************************************************************************
 *  Name:    Alan Turing
 *  NetID:   aturing
 *  Precept: P00
 *
 *  Description:  Write a program Powers that takes in two numbers from
 *                standard input: a double k and an integer n. It should print
 *                out the first n powers of k (using the format given in the
 *                template). For example:
 *                > java Powers
 *                 with standard input 2.0 5 outputs:
 *                    2.0000
 *                    4.0000
 *                    8.0000
 *                    16.000
 *                    32.000
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Powers {
    public static void main(String[] args) {
        // read two arguments from stdin
        double k = StdIn.readDouble();
        int n = StdIn.readInt();

        double power = 1.0;
        for (int i = 1; i <= n; i++) {
            power *= k;
            StdOut.printf("%.5g\n", power); // print to 5 decimal places
        }
    }
}
