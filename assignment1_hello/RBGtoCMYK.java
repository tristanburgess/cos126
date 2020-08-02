package assignment1_hello;

public class RBGtoCMYK {
    // WARN(tristan): Assignment restriction - no branch statements except for
    // arg checking!
    public static void main(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "Expected exactly three input arguments to parse as RGB color ints.");
        }

        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        if ((r < 0 || r > 255) ||
                (g < 0 || g > 255) ||
                (b < 0 || b > 255)
        ) {
            throw new IllegalArgumentException(
                    "All color int arguments must be between 0 and 255 inclusive.");
        }

        if (r == 0 && g == 0 && b == 0) {
            throw new IllegalArgumentException(
                    "All arguments must not be simultaneously equal to 0.");
        }

        double w = Math.max(Math.max(r / 255.0, g / 255.0), b / 255.0);
        double c = (w - (r / 255.0)) / w;
        double m = (w - (g / 255.0)) / w;
        double y = (w - (b / 255.0)) / w;
        double k = 1 - w;

        System.out.println(String.format("red\t= %d", r));
        System.out.println(String.format("green\t= %d", g));
        System.out.println(String.format("blue\t= %d", b));
        System.out.println(String.format("cyan\t= %f", c));
        System.out.println(String.format("magenta\t= %f", m));
        System.out.println(String.format("yellow\t= %f", y));
        System.out.println(String.format("black\t= %f", k));
    }
}
