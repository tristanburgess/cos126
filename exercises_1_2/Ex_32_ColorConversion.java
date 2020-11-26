package exercises_1_2;

public class Ex_32_ColorConversion {
    public static void main(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "Expected exactly three input args parseable as ints.");
        }
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        if (r < 0 || r > 255 ||
                g < 0 || g > 255 ||
                b < 0 || b > 255) {
            throw new IllegalArgumentException("Expected RGB ints to be in range [0, 255]");
        }

        double w = Math.max(Math.max(r / 255.0, g / 255.0), b / 255.0);

        double c = (w > 0.0) ? (w - (r / 255.0)) / w : 0.0;
        double m = (w > 0.0) ? (w - (g / 255.0)) / w : 0.0;
        double y = (w > 0.0) ? (w - (b / 255.0)) / w : 0.0;
        double k = 1.0 - w;


        System.out.println(String.format("r: %d, g: %d, b: %d", r, g, b));
        System.out.println(String.format("c: %f, m: %f, y: %f, k: %f", c, m, y, k));
    }
}
