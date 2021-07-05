package assignment3_nbody_simulation;

import edu.princeton.cs.algs4.StdAudio;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class NBody {
    public static void main(String[] args) {
        // Parse command-line args
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Expected exactly two input args parseable as doubles.");
        }

        double totalDuration = Double.parseDouble(args[0]);
        double timeStep = Double.parseDouble(args[1]);

        // Read universe from standard in
        int numBodies = StdIn.readInt();
        double radius = StdIn.readDouble();

        double[] xs = new double[numBodies];
        double[] ys = new double[numBodies];
        double[] vxs = new double[numBodies];
        double[] vys = new double[numBodies];
        double[] masses = new double[numBodies];
        String[] imagePaths = new String[numBodies];
        for (int i = 0; i < numBodies; i++) {
            xs[i] = StdIn.readDouble();
            ys[i] = StdIn.readDouble();
            vxs[i] = StdIn.readDouble();
            vys[i] = StdIn.readDouble();
            masses[i] = StdIn.readDouble();
            imagePaths[i] = StdIn.readString();
        }

        StdOut.println(numBodies);
        StdOut.println(radius);
        for (int i = 0; i < numBodies; i++) {
            StdOut.println(
                    String.format(
                            "%5.4e\t%5.4e\t%5.4e\t%5.4e\t%5.4e\t%s",
                            xs[i], ys[i],
                            vxs[i], vys[i],
                            masses[i],
                            imagePaths[i]
                    )
            );
        }

        // Initialize standard draw
        StdDraw.setXscale(-radius, radius);
        StdDraw.setYscale(-radius, radius);
        StdDraw.enableDoubleBuffering();

        // Play music on standard audio
        StdAudio.play("data/2001.wav");

        // Simulate universe
        double t = 0.0;
        while (t < totalDuration) {
            StdOut.println(t);
            t += timeStep;
        }

        // Print universe to standard out
    }
}
