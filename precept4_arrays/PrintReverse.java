package precept4_arrays;
/* *****************************************************************************
 * Name:
 * NetID:
 * Precept:
 *
 * Description: Prints all the inputs in reverse order.
 *
 * Examples:
 * > java PrintReverse Alice Bob Carol Doug
 * Doug Carol Bob Alice
 * > java PrintReverse Seven Ate Nine
 * Nine Ate Seven
 **************************************************************************** */

public class PrintReverse {
    public static void main(String[] args) {
        // n is the number of command-line arguments
        int n = args.length;

        // print in reverse order
        for (int i = 0; i < n; i++) {
            System.out.print(args[n - i - 1]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }

        // print new line at the end
        System.out.println();
    }
}
