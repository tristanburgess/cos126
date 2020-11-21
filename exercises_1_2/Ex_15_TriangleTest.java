package exercises_1_2;

public class Ex_15_TriangleTest {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("The three input args must be positive integers!");
        }

        boolean canTriangle = (a < b + c) &&
                (b < a + c) &&
                (c < a + b);

        System.out.println(canTriangle);
    }
}
