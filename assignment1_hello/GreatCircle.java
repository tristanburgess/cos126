package assignment1_hello;

public class GreatCircle {
    public static void main(String[] args) {
        if (args.length != 4) {
            throw new IllegalArgumentException(
                    "Expected exactly four input arguments to parse as doubles.");
        }

        double x1deg = Double.parseDouble(args[0]);
        double x1rad = Math.toRadians(x1deg);
        double y1deg = Double.parseDouble(args[1]);
        double y1rad = Math.toRadians(y1deg);
        double x2deg = Double.parseDouble(args[2]);
        double x2rad = Math.toRadians(x2deg);
        double y2deg = Double.parseDouble(args[3]);
        double y2rad = Math.toRadians(y2deg);

        double dist = 60 * Math.toDegrees(Math.acos(
                Math.sin(x1rad) * Math.sin(x2rad) +
                        Math.cos(x1rad) * Math.cos(x2rad) * Math.cos(y1rad - y2rad)
        ));

        System.out.println(String.format("%.13f nautical miles", dist));
    }
}
