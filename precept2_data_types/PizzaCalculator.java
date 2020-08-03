package precept2_data_types;

/* ******************************************************************************
 *Description:Write a program to help you feed your friends at a pizza party.
 *There will be one command-line argument,the pizza's radius.
 *The area of the pizza is the square of the side length times
 *pi(use Math.PI).Assuming that each person needs to eat
 *100cm^2of pizza,compute the number of people you can feed,
 *rounded down to the nearest integer.For example,
 **
 *>java PizzaCalculator 10
 *3
 *
 *(The area will be 314.15cm^2,so 3 is the correct output.)
 *
 *Hint:use an explicit typecast at the end.
 *
 *
 ****************************************************************************** */

public class PizzaCalculator {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Must provide exactly one argument parseable as a double.");
        }

        double PERSONAL_AREA = 100;                  // in square cm
        double radius = Double.parseDouble(args[0]); // radius of pizza

        // compute the area
        double area = Math.PI * radius * radius;

        // cast to int rounds down:
        // cm^2 / (cm^2 / person)
        int people = (int) (area / 100.0);

        // output
        System.out.println(people);
    }
}
