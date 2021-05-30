package examples_reading_1_5;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class PlotFilter {
    public static void main(String[] args) {
        double x0 = StdIn.readDouble();
        double y0 = StdIn.readDouble();
        double x1 = StdIn.readDouble();
        double y1 = StdIn.readDouble();

        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);

        StdDraw.enableDoubleBuffering();
        StdDraw.show();

        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);
        }

        StdDraw.show();
    }
}
