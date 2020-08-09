package examples_reading_1_4;

public class SelfAvoidingWalk {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Expected exactly two input arg parseable as a ints.");
        }

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int deadEnds = 0;

        for (int i = 0; i < trials; i++) {
            boolean[][] visited = new boolean[n][n];
            int x = n / 2;
            int y = n / 2;

            while (x > 0 && x < n - 1 && y > 0 && y < n - 1) {
                visited[x][y] = true;

                if (visited[x - 1][y] &&
                        visited[x + 1][y] &&
                        visited[x][y - 1] &&
                        visited[x][y + 1]
                ) {
                    deadEnds++;
                    break;
                }

                int r = (int) (Math.random() * 4);
                switch (r) {
                    case 0:
                        if (!visited[x - 1][y]) x--;
                        break;
                    case 1:
                        if (!visited[x + 1][y]) x++;
                        break;
                    case 2:
                        if (!visited[x][y - 1]) y--;
                        break;
                    case 3:
                        if (!visited[x][y + 1]) y++;
                        break;
                }
            }
        }

        System.out.println(100 * deadEnds / trials + "% dead ends");
    }
}
