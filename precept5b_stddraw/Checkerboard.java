package precept5b_stddraw;

import edu.princeton.cs.algs4.StdDraw;

/* *****************************************************************************
 * Name:
 * NetID:
 * Precept:
 *
 * Description: Plots an n-by-n red and black checkerboard.
 *              Lower-left square is red.                    (Ex. 1.5.18)
 *
 * Execution:   java-introcs Checkerboard n
 *
 **************************************************************************** */
public class Checkerboard {

    public static void main(String[] args) {

        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as an int.");
        }

        // declaration and initialization - How big?
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);

        // Draw from lower left, up and across.
        // i is the index for the x value; j is the index for y.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i + j) % 2) == 0)
                    StdDraw.setPenColor(StdDraw.RED);
                else
                    StdDraw.setPenColor(StdDraw.BLACK);

                // draw filled square centered at i + 0.5, j + 0.5 with radius 0.5
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
