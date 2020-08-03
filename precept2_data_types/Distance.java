package precept2_data_types;

/* **************************************************************************
 * Description: Prints the distance between (0, 0) and (x, y), where x and
 * y are integers, given as command line arguments.
 *
 * Notes: In case you're rusty on the algebra, we determine this by the
 * Euclidean distance: distance = square root of (x squared + y squared).
 *
 * Example:
 * % java Distance 3 4                                  This is Booksite
 * Distance from (0, 0) to (3, 4) is 5.0.               Web Exercise 1.2.1.
 **************************************************************************** */

public class Distance {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Must provide exactly two arguments parseable as ints.");
        }

        // input point coordinates
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // compute distance
        double dist = Math.sqrt(x * x + y * y);

        // output distance
        System.out.println(String.format("distance from (0, 0) to (%d, %d) is %f", x, y, dist));
    }
}
