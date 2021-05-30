package precept5b_stddraw;

/* *****************************************************************************
 *  Name:    Alan Turing
 *  NetID:   aturing
 *  Precept: P00
 *
 *  Description:  Reads a sequence of points defined by (x, y) coordinates from
 *                standard input and draws a spot at each point. It adopts the
 *                convention that the first four numbers on standard input
 *                specify the bounding box, so that it can scale the plot.
 *
 *                Execution:    java PlotFilter < input.txt
 *
 *                > java PlotFilter < USA.txt
 *
 *                Datafile: https://introcs.cs.princeton.edu/java/15inout/USA.txt
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class PlotFilter {

    public static void main(String[] args) {

        // read in bounding box and rescale
        double x0 = StdIn.readDouble();
        double y0 = StdIn.readDouble();
        double x1 = StdIn.readDouble();
        double y1 = StdIn.readDouble();
        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);

        // for bigger points
        StdDraw.setPenRadius(0.005);

        // to speed up performance, defer displaying points
        StdDraw.enableDoubleBuffering();

        // plot points, one at a time
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);
        }

        // display all of the points now
        StdDraw.show();

    }
}
