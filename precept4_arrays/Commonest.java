package precept4_arrays;
/* *****************************************************************************
 *  Name:    Alan Turing
 *  NetID:   aturing
 *  Precept: P00
 *
 *  Description:   Write a program Commonest that takes any number of
 *                 command-line arguments, which will be positive integers, and
 *                 prints the one that occurs most often. For example
 *                 > java Commonest  1 4 5 7  1  7 9 4 4 4 5 1
 *                 4
 *
 *                 If more than one integer is the commonest, print the first
 *                 one that occurs.
 *
 **************************************************************************** */

public class Commonest {
    public static void main(String[] args) {
        // convert command-line arguments to int's
        int[] values = new int[args.length];
        for (int i = 0; i < args.length; i++)
            values[i] = Integer.parseInt(args[i]);

        int commonest = -1;      // just a placeholder for now
        int commonestCount = -1; // same

        for (int i = 0; i < values.length; i++) {
            // count how many times values[i] occurred
            int count = 0;
            for (int j = 0; j < values.length; j++) { // look at each value
                if (values[j] == values[i])           // when you find it
                    count++;                          // count it
            }

            // we found a new commonest word
            if (count > commonestCount) {
                commonest = values[i];
                commonestCount = count;
            }
        }

        System.out.println(commonest);
    }
}
