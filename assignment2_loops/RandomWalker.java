package assignment2_loops;

public class RandomWalker {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as a positive int.");
        }

        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            throw new IllegalArgumentException("Expected input arg to be a positive int.");
        }

        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
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

            System.out.printf("(%d, %d)\n", x, y);
        }

        System.out.printf("squared distance = %d", x * x + y * y);
    }
}
