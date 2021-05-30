package examples_reading_1_5;

import edu.princeton.cs.algs4.StdDraw;

public class Triangle {
    public static void main(String[] args) {
        StdDraw.setPenRadius(0.01);
        double t = 0.025;
        double h = Math.sqrt(3.0) / 2.0;
        StdDraw.line(0.0, t, 1.0, t);
        StdDraw.line(0.0, t, 0.5, h + t);
        StdDraw.line(0.5, h + t, 1.0, t);
        StdDraw.point(0.5, (h / 3.0) + t);
    }
}
