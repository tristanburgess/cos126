package precept2_data_types;

/* **************************************************************************
 * Description: Compute your grade on a two-part exam. You will
 * be given 4 command-line arguments:
 *   1. The number of questions you got right on the first part.
 *   2. The total number of questions on the first part.
 *   3. The number of questions you got right on the second part.
 *   4. The total number of questions on the second part.
 * Output your percentage score on the exam.
 *
 * For example, for PercentScore 8 10 15 17 since you got a total of
 * 23 questions correct out of 27 and 23/27 = 0.8518 you should print
 * 85.18518518518519.
 *
 * Examples:
 * > java PercentScore 8 10 15 17
 * 85.18518518518519
 **************************************************************************** */

public class PercentScore {
    public static void main(String[] args) {
        if (args.length != 4) {
            throw new IllegalArgumentException(
                    "Must provide exactly four arguments parseable as ints.");
        }

        // read 4 command-line arguments
        int numCorrectPt1 = Integer.parseInt(args[0]);
        int numTotalPt1 = Integer.parseInt(args[1]);
        int numCorrectPt2 = Integer.parseInt(args[2]);
        int numTotalPt2 = Integer.parseInt(args[3]);

        int numCorrect = numCorrectPt1 + numCorrectPt2;
        int numTotal = numTotalPt1 + numTotalPt2;
        if (numTotal == 0) {
            throw new IllegalArgumentException(
                    "Can't calculate a score for a test with zero questions total.");
        }

        // calculate the result
        double score = 100.0 * numCorrect / numTotal;

        // print the result
        System.out.println(score);
    }
}
