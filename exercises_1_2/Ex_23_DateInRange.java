package exercises_1_2;

public class Ex_23_DateInRange {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Expected exactly two input args parseable as ints.");
        }
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        // NOTE(tristan): returns true if day d of month m is betwee
        // 3/20 and 6/20, false otherwise.
        boolean dateInRange = false;
        switch (m) {
            case 3:
                if (d >= 20 && d <= 31) dateInRange = true;
                break;
            case 4:
                if (d >= 1 && d <= 30) dateInRange = true;
                break;
            case 5:
                if (d >= 1 && d <= 31) dateInRange = true;
                break;
            case 6:
                if (d >= 1 && d <= 20) dateInRange = true;
                break;
        }

        System.out.println(dateInRange);
    }
}
