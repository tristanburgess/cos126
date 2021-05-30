package precept5a_stdin;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/* *****************************************************************************
 * Name:
 * NetID:
 * Precept:
 *
 * Description: This program simply echoes every int it reads from standard
 *              input to standard output.
 *
 *  Execution:    java-introcs Echo
 *   -- input required from standard input
 *   -- use Ctrl-d (Mac) or Ctrl-z <enter> (Windows) for EOF
 **************************************************************************** */
public class Echo {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            StdOut.println(x);
        }
    }
}
