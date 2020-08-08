package examples_reading_1_4;

public class Sample {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Expected exactly two input arg parseable as a ints.");
        }

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] perm = new int[n];

        for (int i = 0; i < n; i++) {
            perm[i] = i;
        }

        for (int i = 0; i < m; i++) {
            // choose a random elem between i and n-1
            int r = i + (int) (Math.random() * (n - i));
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }

        // NOTE(tristan): Uniform random sample can be used to randomly sample
        // elements of an equally sized array using perm[i] as an index.
        for (int i = 0; i < m; i++) {
            System.out.print(perm[i] + " ");
        }
        System.out.println();
    }
}
