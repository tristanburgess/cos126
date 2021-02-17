package precept3_conditionals_loops;
/* *****************************************************************************
 *  Name:    Alan Turing
 *  NetID:   aturing
 *  Precept: P00
 *
 *  Description:  Write a program SquareCensus that takes a single
 *  command-line argument n, which is an integer.
 *  First, print out all of the positive square numbers less than or equal to
 *  n (in increasing order). Then, print their sum. Use the format shown in this
 *  example:
 *       > java SquareCensus 11 outputs
 *
 *       1
 *       4
 *       9
 *       The sum is 14
 *
 *
 **************************************************************************** */

public class SquareCensus {
    public static void main(String[] args) {
        // get the number n
        int n = Integer.parseInt(args[0]);

        int i = 1;      // start at 1
        int sum = 0;    // sum starts at 0

        // keep squaring until i > n
        while (i <= n) {
            System.out.println(i * i);   // print the square of i
            sum += i * i;           // add the square to the sum
            i += 1;
        }

        // output the sum
        System.out.println("The sum is " + sum);
    }
}
