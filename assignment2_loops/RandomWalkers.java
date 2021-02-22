package assignment2_loops;

public class RandomWalkers {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Expected exactly two input args parseable as positive ints.");
        }

        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            throw new IllegalArgumentException("Expected input arg n to be a positive int.");
        }

        int trials = Integer.parseInt(args[1]);
        if (trials < 0) {
            throw new IllegalArgumentException("Expected input arg trials to be a positive int.");
        }

        long totalSquaredDistances = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            for (int j = 0; j < n; j++) {
                int stepDir = (int) (Math.random() * 4);
                switch (stepDir) {
                    case 0: {
                        y += 1;
                        break;
                    }
                    case 1: {
                        x += 1;
                        break;
                    }
                    case 2: {
                        y -= 1;
                        break;
                    }
                    case 3: {
                        x -= 1;
                        break;
                    }
                }
            }

            totalSquaredDistances += (x * x + y * y);
        }

        double meanSquaredDistance = (double) totalSquaredDistances / (double) trials;
        System.out.printf("mean squared distance for n %d = %f\n", n, meanSquaredDistance);
        System.out.printf("deviation of mean squared distance from n %d: %f\n", n,
                          Math.abs(meanSquaredDistance - n));
    }
}
