package precept3_conditionals_loops;
/* **************************************************************************
 * Description: Simulate the roll of a loaded six-sided die, where
 * the values 1, 2, 3, 4, and 5 appear with probability 1/8 and the
 * value 6 appears with probablity 3/8. Print the resulting number.
 *
 * Examples:
 * > java RollLoadedDie
 * 4
 * > java RollLoadedDie
 * 6                                 (This is Booksite Web Exercise 1.3.2.)
 *****************************************************************************/

public class RollLoadedDie {
    public static void main(String[] args) {
        // generate random double in the range [0.0, 1.0)
        double r = Math.random();

        // compute the roll with desired probabilities
        int roll;
        if (r < 1.0 / 8.0) {
            roll = 1;
        }
        else if (r < 2.0 / 8.0) {
            roll = 2;
        }
        else if (r < 3.0 / 8.0) {
            roll = 3;
        }
        else if (r < 4.0 / 8.0) {
            roll = 4;
        }
        else if (r < 5.0 / 8.0) {
            roll = 5;
        }
        else {
            roll = 6;
        }

        // print the roll
        System.out.println(roll);
    }
}
