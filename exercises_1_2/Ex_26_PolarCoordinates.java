package exercises_1_2;

public class Ex_26_PolarCoordinates {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Expected exactly two input args parseable as doubles.");
        }
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt((x * x) + (y * y));
        double theta = Math.atan2(y, x);

        System.out.println(String.format("Rectangular coords: (%f, %f)", x, y));
        System.out.println(String.format("Polar coords: (%f, %f)", r, theta));
    }
}
