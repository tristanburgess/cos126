package examples_reading_1_3;

public class TenHellos {
    public static void main(String[] args) {
        System.out.println("1st hello.");
        System.out.println("2nd hello.");
        System.out.println("3rd hello.");

        int i = 4;
        while (i <= 10) {
            System.out.println(String.format("%dth hello.", i));
            i++;
        }
    }
}
