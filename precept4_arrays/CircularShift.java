package precept4_arrays;
/* *****************************************************************************
 *  Name:    Alan Turing
 *  NetID:   aturing
 *  Precept: P00
 *
 *  Description:  Given an array of strings from the command-line:
 *                  - Copy the command-line arguments to a new array
 *                  - Print the new array
 *                  - Move each string one position later in the array, and move
 *                    the one at the end to the start.
 *                  - Print the array again
 *
 *                 > java CircularShift The quick brown fox jumps over the lazy dog
 *                 The quick brown fox jumps over the lazy dog
 *                 dog The quick brown fox jumps over the lazy
 *
 **************************************************************************** */

public class CircularShift {
    public static void main(String[] args) {
        int n = args.length; // for convenience

        // create the new array and copy
        String[] copy = new String[n];
        for (int i = 0; i < n; i++)
            copy[i] = args[i];

        // print the copy
        System.out.println("Before shift:");
        for (int i = 0; i < n; i++)
            System.out.print(copy[i] + " ");
        System.out.println();

        // Shift
        String temp = copy[n - 1];    // save the last one
        for (int i = n - 1; i >= 1; i--)   // shift the remaining ones
            copy[i] = copy[i - 1];
        copy[0] = temp;               // set the first one

        // print the shifted array
        System.out.println("After shift:");
        for (int i = 0; i < n; i++)
            System.out.print(copy[i] + " ");
        System.out.println();
    }
}
