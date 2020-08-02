/* This program reads two command-line arguments and prints both out
 * in a sentence. By doing this exercise you will learn the difference
 * between print() and println().
 *
 * Examples:
 * > java NameAge Alice 19
 * Alice is 19 years old.
 * > java NameAge FatherTime 999
 * FatherTime is 999 years old.
 */

public class NameAge {
    public static void main(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("Must provide both a name and an age!");
        }

        System.out.println(String.format("%s is %s years old.", args[0], args[1]));
    }
}
