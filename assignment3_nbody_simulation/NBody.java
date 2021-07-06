package assignment3_nbody_simulation;

import edu.princeton.cs.algs4.StdAudio;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class NBody {
    public static void main(String[] args) {
        double totalDuration = Double.parseDouble(args[0]);
        double timeStep = Double.parseDouble(args[1]);

        boolean textOnly = false;
        if (args.length == 3) {
            textOnly = Boolean.parseBoolean(args[2]);
        }

        // Read universe from standard in
        int numBodies = StdIn.readInt();
        double radius = StdIn.readDouble();

        double[] xs = new double[numBodies];
        double[] ys = new double[numBodies];
        double[] vxs = new double[numBodies];
        double[] vys = new double[numBodies];
        double[] fxs = new double[numBodies];
        double[] fys = new double[numBodies];
        double[] masses = new double[numBodies];
        String[] imagePaths = new String[numBodies];
        for (int i = 0; i < numBodies; i++) {
            xs[i] = StdIn.readDouble();
            ys[i] = StdIn.readDouble();
            vxs[i] = StdIn.readDouble();
            vys[i] = StdIn.readDouble();
            fxs[i] = 0.0;
            fys[i] = 0.0;
            masses[i] = StdIn.readDouble();
            imagePaths[i] = String.format("%s/%s", "data", StdIn.readString());
        }

        // Initialize standard draw
        if (!textOnly) {
            StdDraw.setXscale(-radius, radius);
            StdDraw.setYscale(-radius, radius);
            StdDraw.enableDoubleBuffering();

            StdDraw.picture(0, 0, "data/starfield.jpg");
            for (int i = 0; i < numBodies; i++) {
                StdDraw.picture(xs[i], ys[i], imagePaths[i]);
            }

            // Play music on standard audio
            StdAudio.play("data/2001.wav");
        }

        // Simulate universe
        final double g = 6.67e-11;
        double t = 0.0;

        while (t < totalDuration) {
            if (!textOnly) {
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(0, 0, "data/starfield.jpg");
            }

            for (int i = 0; i < numBodies; i++) {
                fxs[i] = 0.0;
                fys[i] = 0.0;
                for (int j = 0; j < numBodies; j++) {
                    if (i == j) continue;
                    double delX = xs[j] - xs[i];
                    double delY = ys[j] - ys[i];
                    double r = Math.sqrt((delX * delX) + (delY * delY));
                    double f = (g * masses[i] * masses[j]) / (r * r);
                    fxs[i] += (f * delX) / r;
                    fys[i] += (f * delY) / r;
                }
            }

            for (int i = 0; i < numBodies; i++) {
                vxs[i] += ((fxs[i] / masses[i]) * timeStep);
                vys[i] += ((fys[i] / masses[i]) * timeStep);
                xs[i] += (vxs[i] * timeStep);
                ys[i] += (vys[i] * timeStep);
            }

            t += timeStep;

            if (!textOnly) {
                for (int i = 0; i < numBodies; i++) {
                    StdDraw.picture(xs[i], ys[i], imagePaths[i]);
                }

                StdDraw.show();
                StdDraw.pause(20);
            }
        }

        // Print universe to standard out
        StdOut.println(numBodies);
        StdOut.println(String.format("%7.2e", radius));
        for (int i = 0; i < numBodies; i++) {
            StdOut.println(
                    String.format(
                            "%11.4e %11.4e %11.4e %11.4e %11.4e %17s",
                            xs[i], ys[i],
                            vxs[i], vys[i],
                            masses[i],
                            imagePaths[i]
                    )
            );
        }
    }
}
