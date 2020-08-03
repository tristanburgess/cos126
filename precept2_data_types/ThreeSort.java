package precept2_data_types;

/* **************************************************************************
 * Description: Reads three integer command line arguments and prints
 * them in ascending order.
 *
 * Hint: Don't use conditionals for this; use Math.min() and Math.max().
 *
 * Example:
 * % java ThreeSort 17 50 33
 * 17
 * 33
 * 50                                       (This is Book Exercise 1.2.34.)
 **************************************************************************** */


public class ThreeSort {
    public static void main(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "Must provide exactly three arguments parseable as ints.");
        }

        // command-line input
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);


        // compute the order
        int greatest = Math.max(Math.max(a, b), c);
        int least = Math.min(Math.min(a, b), c);
        int mid = a + b + c - greatest - least;

        // output in ascending order
        System.out.println(String.format("%d %d %d", least, mid, greatest));
    }
}
