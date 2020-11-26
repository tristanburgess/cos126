package exercises_1_2;

public class Ex_27_GaussRand {
    /*
    Test trial output from 10000 gaussian random numbers with mean 0 and stddev 1
        Freq -5: 0
        Freq -4: 1
        Freq -3: 17
        Freq -2: 213
        Freq -1: 1374
        Freq 0: 6788
        Freq 1: 1387
        Freq 2: 209
        Freq 3: 10
        Freq 4: 1
        Freq 5: 0
     */
    public static void main(String[] args) {
        int[] buckets = new int[11];
        for (int i = 0; i < 10000; i++) {
            double u = Math.random();
            double v = Math.random();
            double r = Math.sin(2 * Math.PI * v) * Math.pow(-2 * Math.log(u), 0.5);
            int b = (int) r;
            if (b >= -5 && b <= 5) {
                buckets[b + 5]++;
            }
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(String.format("Freq %d: %d", i - 5, buckets[i]));
        }
    }
}
